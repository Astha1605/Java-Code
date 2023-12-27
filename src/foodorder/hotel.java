package foodorder;

import java.util.List;

public class hotel extends menu {
    String name;
    String location;
    String state;
    String hotelName;
    String menuDetails;

    public hotel(int totalMenu, List<dish> dishList, String name, String location, String state, String hotelName, String menuDetails) {
        super(totalMenu, dishList);
        this.name = name;
        this.location = location;
        this.state = state;
        this.hotelName = hotelName;
        this.menuDetails = menuDetails;
    }

    public hotel()
    {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getMenuDetails() {
        return menuDetails;
    }

    public void setMenuDetails(String menuDetails) {
        this.menuDetails = menuDetails;
    }

    @Override
    public String toString() {
        return "hotel{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", state='" + state + '\'' +
                ", hotelName='" + hotelName + '\'' +
                ", menuDetails='" + menuDetails + '\'' +
                '}';
    }
}

