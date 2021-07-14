package ua.com.boost.test;

public class MyArrayDataException extends Exception {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    MyArrayDataException(int x, int y) {
        this.x = x;
        this.y = y;

    }

}