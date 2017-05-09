package decorator;

public class Small extends CondimentDecorator {
    private Beverage beverage;

    public Small(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Small";
    }

    @Override
    public double cost() {
        return beverage.cost() - .10;
    }
}
