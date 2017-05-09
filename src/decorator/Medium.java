package decorator;

public class Medium extends CondimentDecorator {
    private Beverage beverage;

    public Medium(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Medium";
    }

    @Override
    public double cost() {
        return beverage.cost();
    }
}
