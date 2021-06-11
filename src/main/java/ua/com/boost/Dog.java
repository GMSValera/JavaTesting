package ua.com.boost;

public class Dog extends Animal {

   final int maxDistanceToRun = 500;
   final int maxDistanceToSwim = 10;
   static int quantity;

    public Dog(String name) {
            super(name);
            quantity++;
        }

        public void run( final int distance) {
            if (distance>maxDistanceToRun) {
                System.out.println("Собака имя: " + name + " столько не пробежит: " + distance);
            } else {
                System.out.print("Собака");
                super.run( distance );
            }
        }

        public void swim( final int distance) {
            if (distance>maxDistanceToSwim) {
                System.out.println("Собака имя: " + name + " столько не проплывет: " + distance);
            } else {
                System.out.print("Собака");
                super.run( distance );
            }
        }

    }
