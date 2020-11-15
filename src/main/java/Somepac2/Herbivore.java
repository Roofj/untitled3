package Somepac2;

import Somepac3.ForHerbivore;

public abstract class Herbivore extends Animal<ForHerbivore>
{
/*    public void eat (Food a)
    {
        //Animal.searchFood(a.id);
        System.out.println(a.getFoodid());

        if (this.id != a.getFoodid())
        {
            System.out.println("Now "+ this.name+ " is offered "+ a.getFoodname());
            System.out.println(this.name + " don't eat "+ a.getFoodname());
        }
        else
        {
            this.satiety+= a.hunrgy;
            this.AP--;
            System.out.println("Now "+ this.name+ " is offered "+ a.getFoodname());
            System.out.println(this.name + " eat "+ a.getFoodname());
        }
    }
*/   protected Herbivore ()
    {
        this.species = "Herbivore";
        this.id = 0;

    }
/*    static Herbivore Donald = new Herbivore("Donald", "Duck", 5, 4);
    static Herbivore Jerry = new Herbivore("Jerry", "Mouse", 5, 4);
    static Herbivore Marty = new Herbivore("Marty", "Zebra", 5, 4);
*/
}

