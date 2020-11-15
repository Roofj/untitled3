package Somepac2;

public class Parrot extends Herbivore implements Fly
{
    Parrot(String name, int satiety, int AP) {
        this.name = name;
        this.satiety = satiety;
        this.AP = AP;
        this.species = "Parrot";
        this.volume = 1;
    }

    @Override
    public void fly ()
    {
        this.AP-=2;
        System.out.println(this.name+ " fly");
    }
    Parrot Kesha = new Parrot("Kesha", 4, 5);
}
