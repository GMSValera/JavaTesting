package ua.com.boost.lesson_5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private float salary;
    private int age;

    public Employee(String name, String position, String email, String phone, float salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info(){
        System.out.printf("Сотрудник: %s, должность: %s, email: %s, phone: %s, salary: %10.2f, age: %d", this.name, this.position, this.email, this.phone, this.salary, this.age);
        System.out.println();
    }

    public int getAge() {
        return age;
    }
}
