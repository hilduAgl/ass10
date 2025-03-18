package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpression {

    private List<MathExpression> children=new ArrayList<MathExpression>();

    public void add(MathExpression component) {
        children.add(component);
    }

    @Override
    public int getResult() {
        int result = 1;
        for (MathExpression child : children) {
            result *=child.getResult();
        }
        return result;
    }
}
