package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractComposite implements MathExpression, Observer {

    protected List<MathExpression> children = new ArrayList<>();
    protected int lastObservedResult;

    public void add(MathExpression component) {
        children.add(component);
    }

    @Override
    public int getResult() {
        int result = getNeutralElement();
        for (MathExpression child : children) {
            result = operation(result, child.getResult());
        }
        return result;
    }

    @Override
    public void update() {
        lastObservedResult = getResult();
        System.out.println(this.getClass().getSimpleName() + " updated: " + lastObservedResult);
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }

    protected abstract int operation(int currentValue, int childValue);

    protected abstract int getNeutralElement();
}
