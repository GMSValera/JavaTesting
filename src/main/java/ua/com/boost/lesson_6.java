package ua.com.boost;

public class lesson_6 {
    public static void main(String[] args) {
        Cat cat = new Cat("Рыжик");
        cat.run(500);
        cat.run(10);
        cat.swim(10);

        Cat cat2 = new Cat("Маркиз");
        cat2.run(500);
        cat2.run(10);
        cat2.swim(10);

        Dog dog1 = new Dog("Рекс");
        dog1.run(1000);
        dog1.run(200);
        dog1.run(10);
        dog1.swim(10);

        System.out.println( "Количество котов:" + cat2.quantity );
        System.out.println( "Количество собак:" + dog1.quantity );
    }
}
