package decorator2;

public class Swordbearer extends ProfessionDecorator{

    public Swordbearer(Profession profession) {
        super(profession);
    }

    @Override
    public String profession() {
        return "Swordbearer ";
    }

    @Override
    public int attack() {
        return 40;
    }

    @Override
    public int speed() {
        return -10;
    }

    @Override
    public int health() {
        return 50;
    }

    @Override
    public int protection() {
        return 40;
    }
}
