package Task1;

import java.util.ArrayList;
import java.util.List;

/**1
        *Создать класс Товар, имеющий переменные имя, цена, рейтинг.
        *Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
        *Создать класс Basket, содержащий массив купленных товаров.
        *Создать класс User, содержащий логин, пароль и объект класса Basket. Создать объект класса User.
 */

public class Main {
    public static void main(String[] args) {
        Category category1 = new Category();
        Category category2 = new Category();
        Category category3 = new Category();
        User user1 = new User();
        User user2 = new User();
        Basket basket1 = new Basket();
        Goods goods = new Goods();

        List<String> goodsList = new ArrayList<>();
        goodsList.add("Капуста");
        goodsList.add("Морковь");
        goodsList.add("Картофель");
        for (String g : goodsList) {

        }
        System.out.println(goodsList);
    }
}