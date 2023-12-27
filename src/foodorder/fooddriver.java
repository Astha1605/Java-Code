package foodorder;

import java.util.ArrayList;
import java.util.List;

public class fooddriver {
    public static void main(String[] args) {
        dish noodles=new dish("noodles",100,"veg","chinese");
        dish biriyani=new dish("biriyani",200,"non-veg","indian");
        dish soup=new dish("soup",150,"veg","thai");
        dish roti=new dish("roti",20,"veg","indian");
        dish kheer=new dish("kheer",300,"sweet","dessert");
        List<dish> dishList=new ArrayList<>();
        dishList.add(noodles);
        dishList.add((biriyani));
        dishList.add(soup);
        dishList.add(roti);
        dishList.add(kheer);
        orderDetails orderSummary=new orderDetails();
        orderSummary.setAddress("Sobha");
        orderSummary.setOrderTime(1130);
        orderSummary.setDeliveryBoyName("Upen");
        orderSummary.setDishList(dishList);
        orderSummary.setMobileNum(9090);
        System.out.println(orderSummary);
    }
}
