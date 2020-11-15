package Somepac3;

public class Chicken extends ForCarnivorus
{
    Chicken (String name, int hungry)
    {
        this.name = name;
        this.hunrgy = hungry;
    }
    static Chicken hip = new Chicken("hip", 3);
}
