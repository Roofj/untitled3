package Somepac2;

import Somepac3.Beef;
import Somepac3.Food;
import Somepac3.ForCarnivorus;
import Somepac3.Grace;

public abstract class Carnivorous extends Animal <ForCarnivorus> {
    /*    protected void eat (Food a)
        {
            //Animal.searchFood(a);
            if (Animal.z==1)
            {
                System.out.println("Now "+ this.name+ " is offered "+ a);
                System.out.println(this.name + " don't eat "+ a);
            }
            else
            {
                this.satiety+= Animal.hungry;
                this.AP--;
                System.out.println("Now "+ this.name+ " is offered "+ a);
                System.out.println(this.name + " eat "+ a);
            }
        }
    */    Carnivorous()
    {
        this.species = "Carnivorous";
        this.id = 1;
    }
/*    static Carnivorus Garfield = new Carnivorus("Garfield", "Cat", 5, 4);
    static Carnivorus Simba = new Carnivorus("Simba", "Lion", 5, 4);
    static Carnivorus Akela = new Carnivorus("Akela", "Wolf", 5, 4);
 */
}

