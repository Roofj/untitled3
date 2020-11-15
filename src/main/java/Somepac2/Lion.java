package Somepac2;

import Somepac3.ForCarnivorus;

public class Lion extends Carnivorous implements Growl {
    Lion(String name, int satiety, int AP) {
        this.name = name;
        this.satiety = satiety;
        this.AP = AP;
        this.species = "Lion";
        this.volume = 3;
    }

    @Override
    public void growl()
    {
        this.AP-= 1;
        System.out.println(this.name+ " growl");
    }

    static public Lion Simba = new Lion("Simba", 5, 4);
    static public Lion Scar = new Lion("Scar", 5, 4);
    static public Lion Alex = new Lion("Alex", 5, 4);
}
