package decorator2;

public class ProfessionDecorator implements Profession{

    Profession profession;

    public ProfessionDecorator(Profession profession) {
        this.profession = profession;
    }

    @Override
    public String profession() {
        return profession.profession();
    }

    @Override
    public int attack() {
        return profession.attack();
    }

    @Override
    public int speed() {
        return profession.speed();
    }

    @Override
    public int health() {
        return profession.health();
    }

    @Override
    public int protection() {
        return profession.protection();
    }
}
