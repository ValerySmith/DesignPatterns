package decorator2;

public class Rider extends ProfessionDecorator {
    public Rider(Profession profession) {
        super(profession);
    }

    @Override
    public String profession() {
        return "Rider ";
    }

    @Override
    public int attack() {
        return -10;
    }

    @Override
    public int speed() {
        return 40;
    }

    @Override
    public int health() {
        return 200;
    }

    @Override
    public int protection() {
        return 100;
    }
}
