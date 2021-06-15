package ua.com.boost.lesson_7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info(){
        System.out.println("Food: "+this.food);
    }

    public void decreaseFood(final int quantity){
        this.food -= quantity;
    }

    public int getFood() {
        return food;
    }

    public void fillInFeed(final int quantity) {
        decreaseFood(-quantity); // :)))))
    }
}
