package Task1;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    @Override
    public String toString() {
        return "Basket{" +
                "goods=" + goods +
                ", user=" + user +
                ", goodsList=" + goodsList +
                '}';
    }

    public Goods goods;
    public User user;

    public Basket(Goods goods, User user) {
        this.goods = goods;
        this.user = user;
    }
    List<Goods> goodsList = new ArrayList<>();

}
