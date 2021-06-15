package ua.com.boost.lesson_7;

public class HomeWork7 {
    public static void main(String[] args) {
        Cat cats[] = new Cat[5];
        Plate plate = new Plate(45);

        cats[0] = new Cat("Barsik", 5);
        cats[1] = new Cat("Mursik", 15);
        cats[2] = new Cat("Begemot", 25);
        cats[3] = new Cat("Motja", 12);
        cats[4] = new Cat("Tusja", 13);

        plate.info();
        for ( int i=0; i<cats.length; i++ ) {
            System.out.println( cats[i].getName()+" "+cats[i].isWellFed());
        }
        System.out.println( "Eating.....");
        plate.info();
        for ( int i=0; i<cats.length; i++ ) {
            cats[i].eat(plate);
            System.out.println( cats[i].getName()+" "+cats[i].isWellFed());
        }
        plate.fillInFeed( 100 );
        plate.info();
        System.out.println( "Eating.....");
        for (int i=0; i<cats.length; i++) {
            cats[i].eat(plate);
            System.out.println( cats[i].getName()+" "+cats[i].isWellFed());
        }
    }
}
