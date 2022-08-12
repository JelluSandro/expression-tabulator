package expression;

public class And extends AbstractTripleOperation {

    public And(CommonOperation left, CommonOperation right) {
        super(left, right);
    }

    @Override
    protected String getOperator() {
        return "&";
    }

    @Override
    protected int calculate(int x, int y) {
        return x & y;
    }

    protected int getPriority() {
        return 3;
    }
}
