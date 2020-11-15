package Somepac2;

public class Cat extends Carnivorous
{
    static private int count;
    Cat(String name, int satiety, int AP) {
        this.name = name;
        this.satiety = satiety;
        this.AP = AP;
        this.species = "Cat";
        this.volume = 1;
    }

    static public Cat Garfield = new Cat("Garfield", 5, 4);
    static public Cat Leo = new Cat("Leo", 5, 4);
    static public Cat Barik = new Cat("Barik", 5, 4);
}
