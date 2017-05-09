package builder;

public class FordProbeConcreteBuilder extends CarBuilder {
    @Override
    void buildName() {
        car.setName("Ford Probe");
    }

    @Override
    void buildHousing() {
        car.setHousing("compartment");

    }

    @Override
    void buildEngine() {
        car.setEngine(160);

    }

    @Override
    void buildWheels() {
        car.setWheels(14);

    }

    @Override
    void buildTransmission() {
        car.setTransmission("4 Auto");

    }
}
