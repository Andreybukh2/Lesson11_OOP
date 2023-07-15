package Task1;

import java.util.List;

public class Category {
    public Category(String goodsName) {
        this.goodsName = goodsName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "goodsName='" + goodsName + '\'' +
                '}';
    }

    private String goodsName;
    private List<Goods> goodsList;
}
