package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

public class PlusComposite extends AbstractComposite {

    @Override
    protected int operation(int currentValue, int childValue) {
        return currentValue + childValue;
    }

    @Override
    protected int getNeutralElement() {
        return 0; 
    }
}
