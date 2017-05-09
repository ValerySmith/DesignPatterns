package builder;

public abstract class CarBuilder {

    Car car;

    void createCar(){
        car = new Car();
    }

    abstract void buildName();
    abstract void buildHousing();
    abstract void buildEngine();
    abstract void buildWheels();
    abstract void buildTransmission();

    public Car getCar() {
        return car;
    }
}
