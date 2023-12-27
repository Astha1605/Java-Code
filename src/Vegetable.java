public class Vegetable extends Fruit {
    String color;
    String size;

    public Vegetable()
    {

    }

    public Vegetable(String color, String size) {
        this.color = color;
        this.size = size;
    }

    void tatse()
    {
        System.out.println("color");
    }
    void type()
    {
        System.out.println("type");
    }
    public static void main(String[] args)
    {
        Fruit fal=new Vegetable();
        Fruit fruit = new Fruit();
        Vegetable veg = new Vegetable("Red","medium");
        Vegetable veg2 = new Vegetable();

        System.out.println(veg.color);
        fruit.tatse();
        //veg.tatse();
        fal.tatse();
        veg.type();
        fal.cost();
        veg.cost();

    }
}
