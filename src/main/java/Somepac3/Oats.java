package Somepac3;

public class Oats extends ForHerbivore
{
    Oats (String name, int hungry)
    {
        this.name = name;
        this.hunrgy = hungry;
    }
    public String getType(){return this.type;}
    static public Oats oats = new Oats("oats", 1);
}
