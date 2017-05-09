package decorator2;

public class HumanWarrior extends ProfessionDecorator {

    public HumanWarrior(Profession profession) {
        super(profession);
    }

    @Override
    public String profession() {
        return "Warrior ";
    }

    @Override
    public int attack() {
        return super.attack();
    }

    @Override
    public int speed() {
        return 10;
    }

    @Override
    public int health() {
        return 50;
    }

    @Override
    public int protection() {
        return 20;
    }
}
