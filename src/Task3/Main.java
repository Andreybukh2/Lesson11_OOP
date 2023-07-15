package Task3;

public class Main {
    public static void main(String[] args) {
        Human grp1 = new Human("Женя",true, 66,null,null);
        Human grm1 = new Human("Юлия",false,65,null,null);

        Human grp2 = new Human("Алексей,",true, 70,null,null);
        Human grm2 = new Human("Мариана", false,68,null,null);

        Human father = new Human("Анатолий",true, 47, grp1, grm1);
        Human mother = new Human("Ефросиня",false,46, grp2, grm2);

        Human ch1 = new Human("Ольга",false,17, father, mother);
        Human ch2 = new Human("Мария",false,23, father, mother);
        Human ch3 = new Human("Артем",true, 14, father, mother);

        System.out.println(ch2);
    }
}
