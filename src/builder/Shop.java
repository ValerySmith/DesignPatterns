package builder;

public class Shop {
    CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car buyCar() {
        carBuilder.createCar();
        carBuilder.buildName();
        carBuilder.buildHousing();
        carBuilder.buildEngine();
        carBuilder.buildWheels();
        carBuilder.buildTransmission();

        Car car = carBuilder.getCar();
        return car;
    }
}
