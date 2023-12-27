package foodorder;

public class dish {
    String dishName;
    int price;
    String type;
    String taste;

    public dish(String dishName, int price, String type, String taste) {
        this.dishName = dishName;
        this.price = price;
        this.type = type;
        this.taste = taste;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "dish{" +
                "dishName='" + dishName + '\'' +
                ", type='" + type + '\'' +
                ", taste='" + taste + '\'' +
                '}';
    }
}
