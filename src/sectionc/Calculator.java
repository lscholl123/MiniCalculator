package sectionc;

public abstract class Calculator implements Multiplier, Divider {

    protected int total;

    public Calculator() {
        total=1;
    }

    @Override
    public void divide(int y) {
        total/=y;
    }

    @Override
    public void multiply(int y) {
        total*=y;
    }

    public abstract int calculate();
}
