package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression {

    private List<NumberLeaf> children=new ArrayList<NumberLeaf>();

    public void add(NumberLeaf component) {
        children.add(component);
    }

    @Override
    public int getResult() {
        int result = 0;
        for (MathExpression child : children) {
                result += child.getResult();
        }
        return result;
    }
}


