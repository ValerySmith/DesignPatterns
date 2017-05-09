import builder.Car;
import builder.FordProbeConcreteBuilder;
import builder.Shop;
import decorator.*;
import decorator2.*;
import facade.Computer;
import singleton.classic.Singleton;
import state.GumballMachine;

public class Main {

    public static void main(String[] args) {
        // Builder
        Shop shop = new Shop();
        shop.setCarBuilder(new FordProbeConcreteBuilder());
        Car car = shop.buyCar();
        System.out.println(car);
        System.out.println("-------------------------------------");

        // Decorator
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Large(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());

        Beverage beverage3 = new Espresso();
        beverage3 = new Small(beverage3);
        beverage3 = new Milk(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
        System.out.println("-------------------------------------");

        // Decorator 2
        Profession human = new Human();
        Profession humanWarrior = new HumanWarrior(new Human());
        Profession swordbearer = new Swordbearer(new HumanWarrior(new Human()));
        Profession archer = new Archer(new HumanWarrior(new Human()));
        Profession rider = new Rider(new Swordbearer(new HumanWarrior(new Human())));

        System.out.println(human.profession() + " " + human.attack() + " " + human.speed() + " "
                + human.health() + " " + human.protection());

        System.out.println(humanWarrior.profession() + " " + humanWarrior.attack() + " " + humanWarrior.speed() + " "
                + humanWarrior.health() + " " + humanWarrior.protection());

        System.out.println(swordbearer.profession() + " " + swordbearer.attack() + " " + swordbearer.speed() + " "
                + swordbearer.health() + " " + swordbearer.protection());

        System.out.println(archer.profession() + " " + archer.attack() + " " + archer.speed() + " "
                + archer.health() + " " + archer.protection());

        System.out.println(rider.profession() + " " + rider.attack() + " " + rider.speed() + " "
                + rider.health() + " " + rider.protection());
        System.out.println("-------------------------------------");

        // Facade
        Computer computer = new Computer();
        computer.startComputer();
        System.out.println("-------------------------------------");

        // Singleton
        Singleton singleton = Singleton.getUniqueInstance();
        System.out.println(singleton.getDescription());
        System.out.println("-------------------------------------");

        // State
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

    }
}
