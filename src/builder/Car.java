package builder;

public class Car {

    private String name;
    private String housing;
    private int engine;
    private int wheels;
    private String transmission;

    public void setName(String name) {
        this.name = name;
    }

    public void setHousing(String housing) {
        this.housing = housing;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", housing='" + housing + '\'' +
                ", engine=" + engine +
                ", wheels=" + wheels +
                ", transmission='" + transmission + '\'' +
                '}';
    }
}
