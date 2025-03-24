package is.hi.hbv202g.ass9.compositeObserved;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression, Observer {

    private List<MathExpression> children = new ArrayList<>();
    private int lastObservedResult;

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

    @Override
    public void update() {
        lastObservedResult = getResult();
        System.out.println("PlusComposite updated: " + lastObservedResult);
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }
}
