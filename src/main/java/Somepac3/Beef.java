package Somepac3;

public class Beef extends ForCarnivorus
{
    Beef (String name, int hungry)
    {
        this.name = name;
        this.hunrgy = hungry;
    }
    static public Beef hip = new Beef("hip", 3);
}

