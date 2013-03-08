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

    // constructor -- a symbol table is passed in as a parameter
    public TypeVisitor(Table symtab) {
        this.symTable = symtab;
        this.currClass = null;
        this.currMethod = null;
    }

    // top level visit routine
    public void visit(Program n) throws Exception {
        n.cl.accept(this);
    }

    // LISTS
    public void visit(ClassDeclList n) throws Exception {
        for (int i = 0; i < n.size(); i++)
            n.elementAt(i).accept(this);
        }
    }
