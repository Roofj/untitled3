package Somepac2;

public class Mouse extends Herbivore implements Swim {
    Mouse(String name, int satiety, int AP) {
        this.name = name;
        this.satiety = satiety;
        this.AP = AP;
        this.species = "Mouse";
        this.volume = 1;
    }

    @Override
    public void swim ()
    {
        this.AP-=2;
        System.out.println(this.name+ " swim");
    }

    static public Mouse Jerry = new Mouse("Jerry", 5, 4);
    static public Mouse Pinky = new Mouse("Pinky", 5, 4);
    static public Mouse TheBrain = new Mouse("TheBrain", 5, 4);
}
