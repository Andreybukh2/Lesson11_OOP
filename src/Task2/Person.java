package Task2;

/**Создать класс Person, который содержит:
 переменные fullName, age;
 методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
 Добавьте два конструктора  - Person() и Person(fullName, age).
 Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
 */

public class Person {
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String fullName;
    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public Person() {
    }
    public void move () {
        System.out.println("Такой-то Person двигается ");
    }
    public void talk () {
        System.out.println("Такой-то Person говорит ");
    }
}
