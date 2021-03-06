package ast;

import visitor.ExpVisitor;

public class MultiplyExp extends OpExp {

    public MultiplyExp(Exp l, Exp r) {
        super(l, r);
    }

    public String myOp() {
        return "*";
    }

    public void accept(ExpVisitor v) {
        v.visit(this);
    }
}
