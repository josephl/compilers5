package ast;

public class ClassDecl extends Ast {
  public Id cid, pid;
  public VarDeclList vl;  
  public MethodDeclList ml;
 
  public ClassDecl(Id ci, Id pi, VarDeclList avl, MethodDeclList aml) {
    cid=ci; pid=pi; vl=avl; ml=aml;
  }

  public void dump() { 
    DUMP("(ClassDecl "); DUMP(cid); DUMP(pid); DUMP("\n ");
    DUMP("VarDeclList", vl); DUMP("\n ");
    DUMP("MethodDeclList\n", ml); DUMP(")\n ");
  }

  public void accept(VoidVI v)  { v.visit(this); }
  public void accept(TypeVI v) throws Exception { v.visit(this); }
}
