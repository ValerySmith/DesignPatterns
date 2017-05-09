package builder;

public class DaewooLanosConcreteBuilder extends CarBuilder {
    @Override
    void buildName() {
        car.setName("Daewoo Lanos");
    }

    @Override
    void buildHousing() {
        car.setHousing("Sedan");
    }

    @Override
    void buildEngine() {
        car.setEngine(98);

    }

    @Override
    void buildWheels() {
        car.setWheels(13);

    }

    @Override
    void buildTransmission() {
        car.setTransmission("5 Manual");
    }
}
