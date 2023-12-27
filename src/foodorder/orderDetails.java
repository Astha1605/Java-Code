package foodorder;

import java.util.List;

public class orderDetails {
    String address;
    long mobileNum;
    int orderTime;
    String deliveryBoyName;
    String paymentMode;
    int totalAmount;
    List<dish> dishList;

    public orderDetails() {
    }

    public orderDetails(String address, long mobileNum, int orderTime, String deliveryBoyName, String paymentMode, int totalAmount, List<dish> dishList) {
        this.address = address;
        this.mobileNum = mobileNum;
        this.orderTime = orderTime;
        this.deliveryBoyName = deliveryBoyName;
        this.paymentMode = paymentMode;
        this.totalAmount = totalAmount;
        this.dishList = dishList;
    }
    public int getPrice()
    {
        int price=0;
        for(int i=0;i<dishList.size();i++)
        {
            price+= dishList.get(i).getPrice();
        }
        return price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(long mobileNum) {
        this.mobileNum = mobileNum;
    }

    public int getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(int orderTime) {
        this.orderTime = orderTime;
    }

    public String getDeliveryBoyName() {
        return deliveryBoyName;
    }

    public void setDeliveryBoyName(String deliveryBoyName) {
        this.deliveryBoyName = deliveryBoyName;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<dish> getDishList() {
        return dishList;
    }

    public void setDishList(List<dish> dishList) {
        this.dishList = dishList;
    }

    @Override
    public String toString() {
        return "orderDetails{" +
                "address='" + address + '\'' +
                ", deliveryBoyName='" + deliveryBoyName + '\'' +
                ", paymentMode='" + paymentMode + '\'' +
                ", orderPrice='" + getPrice() + '\'' +
                ", dishList=" + dishList +
                '}';
    }
}
