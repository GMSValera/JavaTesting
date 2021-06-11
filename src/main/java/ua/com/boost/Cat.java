package ua.com.boost;

public class Cat extends Animal {

    private final int maxDistanceToRun = 200;
    private final int maxDistanceToSwim = 0;
    static int quantity;

    public Cat(String name) {
        super(name);
        quantity++;
    }

    public void run( final int distance) {
        if (distance>maxDistanceToRun) {
            System.out.println("Кот имя: " + name + " столько не пробежит: " + distance);
        } else {
            System.out.print("Кот");
            super.run( distance );
        }
    }

    public void swim( final int distance) {
        if (distance>maxDistanceToSwim) {
            System.out.println("Кот имя: " + name + " столько не проплывет: " + distance);
        } else {
            System.out.print("Кот");
            super.run( distance );
        }
    }

}

