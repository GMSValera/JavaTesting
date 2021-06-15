package ua.com.boost.lesson_5;

public class HomeWorkLesson5 {

    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Employee("Petrov Andry", "Engineer", "Petrov@mailbox.com", "46546341321", 10000, 50);
        persArray[2] = new Employee("Sidorov A", "Engineer", "Sidorov@mailbox.com", "4646546541", 20000, 60);
        persArray[3] = new Employee("Pupkina Ira", "Engineer", "Pupkina@mailbox.com", "7879844651", 30000, 70);
        persArray[4] = new Employee("Ivanov Semen", "Engineer", "ivivan_Semen@mailbox.com", "13213246546", 40000, 20);

        for (int i=0; i<persArray.length; i++) {
            if (persArray[i].getAge()>40) {
                persArray[i].info();
            }
        }

    }
}
