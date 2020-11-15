package Somepac3;

public class Fruits extends ForHerbivore
{
    Fruits (String name, int hungry)
    {
        this.name = name;
        this.hunrgy = hungry;
    }
    static public Fruits apple = new Fruits("apple", 1);
}