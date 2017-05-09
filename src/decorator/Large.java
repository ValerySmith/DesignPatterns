package decorator;

public class Large extends CondimentDecorator {
    private Beverage beverage;

    public Large(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Large";
    }

    @Override
    public double cost() {
        return .50 + beverage.cost();
    }
}
