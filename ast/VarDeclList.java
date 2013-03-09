package ast;

public class VarDeclList extends AstList {
  public VarDeclList() { super(); }
  public void add(VarDecl n) { super.add(n); }
  public VarDecl elementAt(int i)  { return (VarDecl)super.elementAt(i); }

  public void accept(VoidVI v) { v.visit(this); }
  public void accept(TypeVI v) throws Exception { v.visit(this); }
}
