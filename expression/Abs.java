package expression;



import expression.generic.TypeGeneric;

import java.util.InputMismatchException;

public class Abs<T> extends AbstractUnaryOperation<T> {
    public Abs(CommonOperation<T> right, TypeGeneric<T> t) {
        super(right, t);
    }

    @Override
    protected String getOperator() {
        return "abs";
    }

    @Override
    protected T calculate(T x) {
        return t.abs(x);
    }
}