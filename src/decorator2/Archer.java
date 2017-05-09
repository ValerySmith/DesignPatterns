package decorator2;

public class Archer extends ProfessionDecorator {

    public Archer(Profession profession) {
        super(profession);
    }

    @Override
    public String profession() {
        return "Archer ";
    }

    @Override
    public int attack() {
        return 20;
    }

    @Override
    public int speed() {
        return 20;
    }

    @Override
    public int health() {
        return 50;
    }

    @Override
    public int protection() {
        return 10;
    }
}
