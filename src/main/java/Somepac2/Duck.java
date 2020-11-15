package Somepac2;

public class Duck extends Herbivore implements Swim, Fly {
    Duck(String name, int satiety, int AP) {
        this.name = name;
        this.satiety = satiety;
        this.AP = AP;
        this.species = "Duck";
        this.volume = 1;
    }
    @Override
    public void swim ()
    {
        this.AP-=2;
        System.out.println(this.name+ " swim");
    }

    @Override
    public void fly ()
    {
        this.AP-=3;
        System.out.println(this.name+ " fly");
    }

    static public Duck Donald = new Duck("Donald", 5, 4);
    static public Duck Scrooge  = new Duck("Scrooge ", 5, 4);
    static public Duck Launchpad   = new Duck("Launchpad  ", 5, 4);

}
