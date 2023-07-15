package Task1;

import java.util.ArrayList;
import java.util.List;

/**1
 *Создать класс Товар, имеющий переменные имя, цена, рейтинг.
 *Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
 *Создать класс Basket, содержащий массив купленных товаров.
 *Создать класс User, содержащий логин, пароль и объект класса Basket. Создать объект класса User.
 * //В 1 задании положи в товары в категории, корзины и пользователей, потом выведи на экран
 */

public class Main {
    public static void main(String[] args) {
        Category category1 = new Category("Овощи");
        Category category2 = new Category("Выпечка");

        User user1205 = new User();
        User user1856 = new User();
        User user2985 = new User();

        Goods goods1 = new Goods("Капуста", 56, 4, category1);
        Goods goods2 = new Goods("Морковь", 35,3, category1);
        Goods goods3 = new Goods("Хлеб",24, 5, category2);

        Basket basket1 = new Basket(goods1, user1205);
        Basket basket2 = new Basket(goods2, user2985);
        Basket basket3 = new Basket(goods3, user1856);
        System.out.println(basket1);
        System.out.println(basket2);
        System.out.println(basket3);
        System.out.println();

        List<String> goodsList = new ArrayList<>();
        goodsList.add("Капуста");
        goodsList.add("Морковь");
        goodsList.add("Картофель");
        goodsList.add("Оливье");
        goodsList.add("Хлеб");

        for (String g : goodsList) {
        }
        System.out.println(goodsList);
    }
}