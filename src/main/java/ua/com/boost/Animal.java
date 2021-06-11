package ua.com.boost;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println("Животное: " + name);
    }

    public void run(final int distance) {
        System.out.println(" имя: " + name + " пробежал: " + distance);
    }

    public void swim( final int distance) {
        System.out.println(" имя: " + name + " проплыло: " + distance);
    }
}

