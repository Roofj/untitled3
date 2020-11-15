package Somepac2;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class AnimalContain<T extends Animal>
{
    enum Quantity {One, Two, Three, Four, Five}
    ArrayList<Animal> animal = new ArrayList<Animal>();
    private HashMap<String, T > animalHashMap = new HashMap<String, T>();
    //private HashMap<String, HashMap> contanHashMap = new HashMap<>();

    private AnimalContain (Quantity mcount)
    {
        this.mcount = mcount.ordinal()+1;
    }

    public T getAnimal(String name)
    {
        if (this.searchAnimal(name)!= null)
        {
            System.out.println(name + " found this");
            return this.searchAnimal(name);
        }
        System.out.println(name + " not found this");
        return null;
    }

    private T searchAnimal(String name) {
        if (this.animalHashMap.containsKey("Akela"))
        {
            return (T) this.animalHashMap.get(name);
        }
        return null;
    }

    public void putAnimal(T a) {
        if (this.searchAnimal(a.getName())== null && this.count+ a.getVolume()<= this.mcount) {
            this.animalHashMap.put(a.getName(), a);
            this.count+= a.getVolume();
            System.out.println(a.getName() + " added");
            System.out.println(this.animalHashMap.size());
        } else {
            System.out.println(a.getName() + " not added");
        }
    }

    public void deleteAnimal(String name)
    {
        if (this.searchAnimal(name)!= null)
        {
            this.count-= this.animalHashMap.get(name).getVolume();
            this.animalHashMap.remove(name, getAnimal(name));
            System.out.println(name+ " deleted of this");
        }
        else
        {
            System.out.println(name + " not found this");
        }
    }

    /*public void getHM(String name)
    {
        if (AnimalContain.contanHashMap.containsKey(name))
        {
            AnimalContain.contanHashMap.get(name);
        }
        return null;
    }

    public void putHM()
    {
        AnimalContain.contanHashMap.put("animalHashMap", AnimalContain.animalHashMap);
    }
    */ private int id, quantity, count;
    final private int mcount;
    private String name;

    public static AnimalContain <Carnivorous> forCarnivorous = new AnimalContain<>(Quantity.Four);
    public static AnimalContain <Herbivore> forHerbivore = new AnimalContain<>(Quantity.Four);
    public static AnimalContain <Duck> forDuck = new AnimalContain<>(Quantity.Four);

    //public Animal getAnimal(int n){return this.animal.get(n);}
    /*public AnimalContain(String name, int quantity, int id)
    {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
    }
    public void addAnimal(Animal a)
    {
        if (this.id == a.getId() && this.quantity>this.count && !this.animal.contains(a))
        {
            this.animal.add(a);
            System.out.println(a.getName()+ " contain in "+ this.name+ " under the number "+ this.animal.indexOf(a));
            this.count++;
        }
        else if (this.quantity<=this.count&& this.id == a.getId() && !this.animal.contains(a))
        {
            System.out.println(this.name+ " crowded");
        }
        else if (this.quantity>this.count&& this.id == a.getId() && this.animal.contains(a))
        {
            System.out.println(a.getName()+ " already contained in "+ this.name);
        }
        else
        {
            System.out.println(a.getName()+ " can't contain in "+ this.name);
        }
    }
    public void getoutAnimal (Animal a)
    {
        if (this.animal.remove(a))
        {
            System.out.println(a.getName() + " get out of " + this.name);
            this.count--;
        }
        else
        {
            System.out.println(a.getName() + " not contained in " + this.name);
        }
    }
    static public AnimalContain forc = new AnimalContain("forc", 3, 1);
    static public AnimalContain forc1 = new AnimalContain("forc1", 3, 1);
    static public AnimalContain forh = new AnimalContain("forh", 3, 0);
    static public AnimalContain forh1 = new AnimalContain("forh1", 3, 0);
*/}
