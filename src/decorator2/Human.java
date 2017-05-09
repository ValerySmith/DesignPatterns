package decorator2;

public class Human implements Profession {

    @Override
    public String profession() {
        return "Human Non Profession";
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
        return 150;
    }

    @Override
    public int protection() {
        return 0;
    }

}
