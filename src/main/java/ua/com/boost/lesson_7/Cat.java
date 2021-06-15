package ua.com.boost.lesson_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean wellFed;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.wellFed = false;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate currentPlate){
        if ((currentPlate.getFood() >= this.appetite) && (!this.wellFed)) {
            currentPlate.decreaseFood(this.appetite);
            wellFed = true;
        }
    }

    public boolean isWellFed() {
        return wellFed;
    }

}
