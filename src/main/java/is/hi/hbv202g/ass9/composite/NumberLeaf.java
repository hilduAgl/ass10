package is.hi.hbv202g.ass9.composite;

public class NumberLeaf implements MathExpression {

    private int leaf;

    public NumberLeaf(int i) {
        leaf = i;
    }

    @Override
    public int getResult() {
        return leaf;
    }
}
