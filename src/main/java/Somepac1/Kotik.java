package Somepac1;

public class Kotik {
    int satiety;
    int AP;
    String name;

    public boolean eat(int hungry) {
        this.satiety += hungry;
        --this.AP;
        return true;
    }

    public boolean eat(int hungry, String food) {
        this.satiety = hungry;
        --this.AP;
        System.out.println(this.name + " eat " + food);
        return true;
    }

    public boolean eat() {
        this.eat(3, "Mouse");
        return true;
    }

    public boolean play() {
        this.satiety -= 2;
        --this.AP;
        System.out.println(this.name + " play");
        return true;
    }

    public boolean sleep() {
        --this.satiety;
        this.AP += 5;
        System.out.println(this.name + " sleep");
        return true;
    }

    public boolean walk() {
        this.satiety -= 2;
        --this.AP;
        System.out.println(this.name + " walk");
        return true;
    }

    public boolean chaseMouse() {
        this.satiety -= 3;
        --this.AP;
        System.out.println(this.name + " chase Mouse.");
        return true;
    }

    public boolean dead() {
        System.out.println(this.name + " is dead");
        return true;
    }

    public boolean relax() {
        --this.satiety;
        ++this.AP;
        System.out.println(this.name + " relax");
        return true;
    }

    public Kotik(String name, int satiety, int AP) {
        this.name = name;
        this.satiety = satiety;
        this.AP = AP;
    }

    public void liveAnotherDay() {
        for(int n = 0; n < 24; ++n) {
            System.out.println(n);
            if (this.satiety <= -5) {
                this.dead();
            } else if (this.AP < 0) {
                this.sleep();
                System.out.println(this.name + " not dead");
            } else if (this.satiety < 0) {
                this.chaseMouse();
                this.eat();
                System.out.println(this.name + " not dead, not sleep");
            } else {
                System.out.println(this.name + " not dead, not sleep, not eat");
                int a = (int)(Math.random() * 10.0D);
                if (a != 0 && a != 5) {
                    if (a != 1 && a != 6) {
                        if (a != 2 && a != 7 && a != 9) {
                            if (a != 3 && a != 8) {
                                System.out.println(this.sleep());
                            } else {
                                System.out.println(this.walk());
                            }
                        } else {
                            System.out.println(this.relax());
                        }
                    } else {
                        System.out.println(this.play());
                    }
                } else {
                    System.out.println(this.chaseMouse());
                    System.out.println(this.eat());
                }
            }
        }

    }
    public void liveAnotherDay(int b)
    {
        for(int n = 0; n < 24; ++n)
        {
            System.out.println(n);
            if (this.satiety <= -5) {
                this.dead();
            } else if (this.AP < 0) {
                this.sleep();
                System.out.println(this.name + " not dead");
            } else if (this.satiety < 0) {
                this.chaseMouse();
                this.eat();
                System.out.println(this.name + " not dead, not sleep");
            } else
            {
                System.out.println(this.name + " not dead, not sleep, not eat");
                int a = (int)(Math.random() * 10.0D);
                switch (a)
                {
                    case 0:
                    case 1: System.out.println(this.chaseMouse());System.out.println(this.eat()); break;
                    case 2:
                    case 3: System.out.println(this.play()); break;
                    case 4:
                    case 5: System.out.println(this.relax()); break;
                    case 6:
                    case 7:
                    case 8: System.out.println(this.walk()); break;
                    case 9: System.out.println(this.sleep()); break;
                }
            }
        }
    }

}
