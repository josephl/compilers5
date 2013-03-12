package typechk;
import ast.*;
import astpsr.*;
import symbol.*;
import java.io.*;
import java.util.Hashtable;
import java.util.Vector;

public class TypeVisitor implements TypeVI{
    private Table symTable;
    private ClassRec currClass;
    private MethodRec currMethod;
    private boolean hasReturn;

    private BasicType IntType;
    private BasicType BoolType;
    private boolean debug;

    // constructor -- a symbol table is passed in as a parameter
    public TypeVisitor(Table symtab) {
        this.symTable = symtab;
        this.currClass = null;
        this.currMethod = null;
        
        this.IntType = new BasicType(BasicType.Int);
        this.BoolType = new BasicType(BasicType.Bool);
        this.debug = true;
    }

    // top level visit routine
    public void visit(Program n) throws Exception {
        if (this.debug)
            System.out.println("DEBUG: Program");
        n.cl.accept(this);
        if (this.debug)
            System.out.println("END: Program");
    }

    // LISTS
    // --DONE--
    public void visit(AstList n) throws Exception {}
    public void visit(ClassDeclList n) throws Exception {
        if (this.debug)
            System.out.println("DEBUG: ClassDeclList");
        for (int i = 0; i < n.size(); i++)
            n.elementAt(i).accept(this);
        if (this.debug)
            System.out.println("END: ClassDeclList");
    }
    public void visit(MethodDeclList n) throws Exception {
        if (this.debug)
            System.out.println("DEBUG: MethodDeclList");
        for (int i = 0; i < n.size(); i++)
            n.elementAt(i).accept(this);
        if (this.debug)
            System.out.println("END: MethodDeclList");
    }
    public void visit(VarDeclList n) throws Exception {
        if (this.debug)
            System.out.println("DEBUG: VarDeclList " + n.size());
        for (int i = 0; i < n.size(); i++)
            n.elementAt(i).accept(this);
        if (this.debug)
            System.out.println("END: VarDeclList");
    }
    public void visit(FormalList n) throws Exception {
        if (this.debug)
            System.out.println("DEBUG: FormalList");
        for (int i = 0; i < n.size(); i++)
            n.elementAt(i).accept(this);
    }
    public void visit(StmtList n) throws Exception {
        if (this.debug)
            System.out.println("DEBUG: StmtList");
        this.hasReturn = false;
        for (int i = 0; i < n.size(); i++)
            n.elementAt(i).accept(this);
        if (this.currMethod.rtype() != null && !this.hasReturn) {
            throw new TypeException("Method " + this.currMethod.id() +
                " is missing a Return statement");
        }
        if (this.debug)
            System.out.println("END: StmtList");
    }
    public void visit(ExpList n) throws Exception {
        if (this.debug)
            System.out.println("DEBUG: ExpList");
        for (int i = 0; i < n.size(); i++)
            n.elementAt(i).accept(this);
    }

    // Declarations
    public void visit(ClassDecl n) throws Exception {
        if (this.debug)
            System.out.println("DEBUG: ClassDecl");
        currClass = symTable.getClass(n.cid);
        n.vl.accept(this);
        n.ml.accept(this);
        currClass = null;
    }
    public void visit(MethodDecl n) throws Exception {
        if (this.debug)
            System.out.println("DEBUG: MethodDecl");
        currMethod = currClass.getMethod(n.mid);
        n.fl.accept(this);
        n.vl.accept(this);
        n.sl.accept(this);
        currMethod = null;
        if (this.debug)
            System.out.println("END: MethodDecl");
    }
    public void visit(VarDecl n) throws Exception {
        if (this.debug)
            System.out.println("DEBUG: VarDecl");
        n.t.accept(this);
        if (n.e != null) {
            n.e.accept(this);
        }
        if (this.debug)
            System.out.println("END: VarDecl");
    }
    public void visit(Formal n) throws Exception {
        if (this.debug)
            System.out.println("DEBUG: Formal");
        n.t.accept(this);
    }

    // Types
    // --DONE--
    public Type visit(BasicType n) { return n; }
    public Type visit(ObjType n) throws Exception {
        if (this.debug)
            System.out.println("DEBUG: ObjType");
        // need to verify that the class exists
        if (this.symTable.getClass(n.cid) != null) {
            return new ObjType(n.cid);
        }
        else {
            throw new TypeException("Undeclared class type");
        }
    }
    public Type visit(ArrayType n) { return n; }

    // Statements
    public void visit(Block n) throws Exception {
        if (this.debug)
            System.out.println("DEBUG: Block");
    }
    public void visit(Assign n) throws Exception {
        if (this.debug)
            System.out.println("DEBUG: Assign");
        Type t1 = n.lhs.accept(this);
        Type t2 = n.rhs.accept(this);
        // check for well-formedness of lhs
        if (this.debug) {
            System.out.println("DEBUG: Assign Types::");
            System.out.println("DEBUG: Id LHS " + t1.toString());
            System.out.println("DEBUG: Id RHS " + t2.toString());
        }
        //else {
        //    // method scope
        //    t1 = 

        // check for type compatibility of both sides
        if (!this.compatible(t1, t2)) {
            throw new TypeException("Incompatible types.");
        }
    }
    public void visit(CallStmt n) throws Exception {
        if (this.debug)
            System.out.println("DEBUG: CallStmt");
        // check if method id is valid
        MethodRec mr;
        mr = this.symTable.getMethod(this.currClass, n.mid);
        System.out.println("CallStmt: " + mr.id().s);

        n.obj.accept(this);
        n.mid.accept(this);
        n.args.accept(this);
        // check if method's formals match callstmt's actual args
        if (n.args.size() != mr.paramCnt()) {
            throw new TypeException("Wrong param count");
        }
        Type t;
        for (int i = 0; i < mr.paramCnt(); i++) {
            t = n.args.elementAt(i).accept(this);
            if (!this.compatible(t, mr.getParamAt(i).type())) {
                throw new TypeException(
                    "Formal's and actual's types not compatible: " +
                    t.toString() + " vs. " +
                    mr.getParamAt(i).type().toString() );
            }
        }
        if (this.debug)
            System.out.println("END: CallStmt");
    }
    public void visit(If n) throws Exception {
        Type t1 = n.e.accept(this);
        Type t2 = new BasicType(BasicType.Bool);
        if (!this.compatible(t1, t2)) {
            throw new TypeException("Test of If is not of boolean type: " +
                t1.toString());
        }
    }
    public void visit(While n) throws Exception {
        if (this.debug)
            System.out.println("DEBUG: While");
    }
    public void visit(Print n) throws Exception {
        if (this.debug)
            System.out.println("DEBUG: Print");
        Type t = n.e.accept(this);
        if (!this.compatible(t, this.IntType) &&
            !this.compatible(t, this.BoolType)) {
            throw new TypeException("Argument to Print must be of a " +
                "basic type or a string literal: " + t.toString());
        }
    }
    public void visit(Return n) throws Exception {
        if (this.debug)
            System.out.println("DEBUG: Return");
            System.out.println("Null return");

        this.hasReturn = true;
        Type t1 = null;
        Type t2 = this.currMethod.rtype();

        if (n.e == null && t2 != null) {
            throw new TypeException("Return is missing an expr of type " +
                t2.toString());
        }
        else
            t1 = n.e.accept(this);

        if (!this.compatible(t1, t2)) {
            throw new TypeException("Wrong return type for method m: " +
                t1.toString());
        }
    }

    // Expressions
    public Type visit(Binop n) throws Exception {
        // based on op type
        if (this.debug)
            System.out.println("DEBUG: Binop");
        Type t1 = n.e1.accept(this);
        Type t2 = n.e2.accept(this);

        Type returnType;

        switch (n.op) {
            case 0:
            case 1:
            case 2:
            case 3:
                if (t1.toString() == "int" && t2.toString() == "int") {
                    returnType = new BasicType(BasicType.Int);
                }
                else if (t1.toString() == "float" && t2.toString() == "float") {
                    returnType = new BasicType(BasicType.Float);
                }
                else {
                    throw new TypeException("Binop operands' type mismatch: " +
                        t1.toString() + n.opName(n.op) + t2.toString());
                }
                break;
            case 4:
            case 5:
                if (t1.toString() != "boolean" || t2.toString() != "boolean") {
                    throw new TypeException("Binop operands' type mismatch: " +
                        t1.toString() + n.opName(n.op) + t2.toString());
                }
                returnType = new BasicType(BasicType.Bool);
                break;
            default:
                throw new TypeException("Binop operands' type mismatch: " +
                    t1.toString() + n.opName(n.op) + t2.toString());
        }
        return returnType;
    }
    public Type visit(Relop n) throws Exception {
        if (this.debug)
            System.out.println("DEBUG: Relop");
        Type t1 = n.e1.accept(this);
        Type t2 = n.e2.accept(this);
        if (this.debug)
            System.out.println("Relop: " + t1.toString() + n.opName(n.op) + t2.toString());
        if (!this.compatible(t1, t2)) {
            throw new TypeException("Incorrect operand types in Relop: " +
                t1.toString() + n.opName(n.op) + t2.toString());
        }
        return t1;
    }
    public Type visit(Unop n) throws Exception {
        if (this.debug)

            System.out.println("DEBUG: Unop");
        return n.accept(this);
    }
    public Type visit(ArrayElm n) throws Exception {
        if (this.debug)
            System.out.println("DEBUG: ArrayElm");

        Type ta = n.array.accept(this);
        System.out.println("Accept array Id: " + ta.toString());
        Type ti = n.idx.accept(this);
        System.out.println("Accept array index");

        String ts = ta.toString();
        if (!ts.endsWith("[]")) {
            throw new TypeException("ArrayElm object is not an array: " + ts);
        }
        // check if valid array
        //VarRec vr = this.symTable.getVar(this.currClass, this.currMethod,
        //    n.array);

        return null;
    }
    public Type visit(ArrayLen n) throws Exception {
        if (this.debug)
            System.out.println("DEBUG: ArrayLen");
        return n.accept(this);
    }
    public Type visit(Field n) throws Exception {
        if (this.debug)
            System.out.println("DEBUG: Field");

        // check class
        Type tobj = n.obj.accept(this); //Exp
        if (this.debug)
            System.out.println("FIELD CHECK: " + tobj.toString());

        Id objid = new Id(tobj.toString());
        // errt20 fix - check if obj is even an obj
        if (objid.s.endsWith("[]") ||
            objid.s == "int" ||
            objid.s == "boolean" ||
            objid.s == "float") {
            throw new TypeException("Object in Field is not ObjType: " +
                objid.s);
        }
        ClassRec c = this.symTable.getClass(objid);
        ObjType objType = new ObjType(objid);

        // check field
        Type tvar = n.var.accept(this); //Id
        if (this.debug)
            System.out.println("FIELD CHECK: " + tvar.toString());

        if (!this.compatible(tobj, objType)) {
            throw new TypeException("not an object");
        }

        VarRec vr = c.getClassVar(n.var);
        return vr.type();
    }
    public Type visit(Call n) throws Exception {
        if (this.debug)
            System.out.println("DEBUG: Call");
        n.obj.accept(this);
        n.mid.accept(this);
        n.args.accept(this);
        MethodRec mr = this.symTable.getMethod(this.currClass, n.mid);
        // check if method's formals match callstmt's actual args
        if (n.args.size() != mr.paramCnt()) {
            throw new TypeException(
                "Formals' and actuals' counts don't match: " +
                mr.paramCnt() + " vs. " + n.args.size());

        }
        Type t;
        for (int i = 0; i < mr.paramCnt(); i++) {
            t = n.args.elementAt(i).accept(this);
            if (!this.compatible(t, mr.getParamAt(i).type())) {
                throw new TypeException(
                    "Formal's and actual's types not compatible: " +
                    mr.getParamAt(i).type().toString() 
                    + " vs. " + t.toString());
            }
        }
        return mr.rtype();
    }
    public Type visit(NewArray n) throws Exception {
        if (this.debug)
            System.out.println("DEBUG: NewArray");
        return null;
    }
    public Type visit(NewObj n) throws Exception {
        if (this.debug)
            System.out.println("DEBUG: NewObj");
        // check if obj id exists
        ClassRec cr = this.symTable.getClass(n.cid);
        return new ObjType(n.cid);
    }
    public Type visit(Id n) throws Exception {
        if (this.debug)
            System.out.println("DEBUG: Id");
        // lookup cur

        VarRec vr;
        ClassRec cr;
        MethodRec mr;

        mr = this.currClass.getMethod(n);
        if (mr != null) {
            return mr.rtype();
        }
        
        if (currMethod == null) {
            vr = this.symTable.getVar(this.currClass, n);
        }
        else {
            vr = this.symTable.getVar(this.currClass, this.currMethod, n);
        }
        //cr = this.symTable.getClass(n);
        //return new ObjType(n);
        return vr.type();
    }
    public Type visit(This n) throws Exception {
        if (this.debug)
            System.out.println("DEBUG: This");
        // lookup current obj's type
        return new ObjType(this.currClass.id());
    }

    // Base values
    public Type visit(IntVal n) {
        if (this.debug)
            System.out.println("DEBUG: IntVal");
        return new BasicType(BasicType.Int); }
    public Type visit(BoolVal n) { 
        if (this.debug)
            System.out.println("DEBUG: BoolVal");
        return new BasicType(BasicType.Bool);
    }
    public Type visit(StrVal n) {
        if (this.debug)
            System.out.println("DEBUG: StrVal");
        return new BasicType(BasicType.Int);
    }

    // check compatibility
    private boolean compatible(Type t1, Type t2) throws Exception {
        if (this.debug)
            System.out.println("DEBUG: Compatability");
// if t1==t2 or both are the same basic type
// return true
// else if both are ObjType // name equivalence
// if (their class ids are the same, or
// t1’s cid matches an ancestor’s cid of t2)
// return true
// else if both are ArrayType // structure equivalence
// recursively test the compatibility of their elements’ types
// else
// return false
        if (t1 == null && t2 == null)
            return true;

        String ts1 = t1.toString();
        String ts2 = t2.toString();

        if (this.debug)
            System.out.println(ts1 + "::" + ts2);
        
        if (ts1.equals(ts2)) {
            // check for basic type match and same objtype
            //if (ts1.endsWith("[]") && ts2.endsWith("[]")) {
            //    // arrays, compare with first element of t1
            //    for (;;) {
            //    }
            //}
            if (this.debug)
                System.out.println("compatibility: equal");
            return true;
        }
        else {
            // make sure not basic types
            if (ts1 == "int" || ts1 == "float" || ts1 == "boolean" ||
                ts2 == "int" || ts2 == "float" || ts2 == "boolean") {
                if (this.debug)
                    System.out.println("Unequal");
                return false;
            }
            // check if t1 matches ancestor of t2
            Id ido = new Id(t2.toString());
            ClassRec ancestor = symTable.getClass(ido).parent();
            while (ancestor != null) {
                if (ts1 == ancestor.id().s) {
                    if (this.debug)
                        System.out.println("compatibility: equal, ancestor");
                    return true;
                }
                ido = new Id(t2.toString());
                ancestor = symTable.getClass(ido).parent();
            }
        }
        // incompatible
        if (this.debug)
            System.out.println("END: Compatability");
        return false;
    }
}
