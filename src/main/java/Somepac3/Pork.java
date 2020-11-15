package Somepac3;

public class Pork extends ForCarnivorus
{
    Pork (String name, int hungry)
    {
        this.name = name;
        this.hunrgy = hungry;
    }
    static public Pork hip = new Pork("hip", 3);
}
