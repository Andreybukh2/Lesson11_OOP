package Task1;

public class Goods {
    private String name;

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", rating=" + rating +
                ", category=" + category +
                '}';
    }
    private double cost;
    private int rating;
    public Category category;

    public Goods(String name, double cost, int rating, Category category) {
        this.name = name;
        this.cost = cost;
        this.rating = rating;
        this.category = category;
    }
}
