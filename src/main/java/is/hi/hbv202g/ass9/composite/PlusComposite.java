package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression {

    private List<MathExpression> children = new ArrayList<>();

    public void add(MathExpression component) {
        children.add(component);
    }

    @Override
    public int getResult() {
        int sum = 0;
        for (MathExpression child : children) {
            sum += child.getResult();
        }
        return sum;
    }
}
