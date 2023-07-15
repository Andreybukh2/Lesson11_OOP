package Task3;
/**Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

        Примечание:
        Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

        Пример вывода:
        Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
        Имя: Катя, пол: женский, возраст: 55
        Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
 */
public class Human {
    public String name;
    public boolean gender;
    public int age;
    public Human father;
    public Human mother;

    public Human(String name, boolean gender, int age, Human father, Human mother) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", father=" + father +
                ", mother=" + mother +
                '}';
    }
}
