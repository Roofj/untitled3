package Somepac2;

public class Zebra extends Herbivore {
    Zebra(String name, int satiety, int AP) {
        this.name = name;
        this.satiety = satiety;
        this.AP = AP;
        this.species = "Zebra";
        this.volume = 2;
    }

    static public Zebra Marty = new Zebra("Marty", 5, 4);
}
