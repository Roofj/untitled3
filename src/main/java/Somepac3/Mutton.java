package Somepac3;

public class Mutton extends ForCarnivorus
{
    Mutton (String name, int hungry)
    {
        this.name = name;
        this.hunrgy = hungry;
    }
    static public Mutton hip = new Mutton("hip", 3);
}