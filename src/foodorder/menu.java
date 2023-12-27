package foodorder;

import java.util.List;

public class menu{
    int totalMenu;
    List<dish> dishList;

    public menu()
    {
    }

    public menu(int totalMenu, List<dish> dishList) {
        this.totalMenu = totalMenu;
        this.dishList = dishList;
    }

    public int getTotalMenu() {
        return totalMenu;
    }

    public void setTotalMenu(int totalMenu) {
        this.totalMenu = totalMenu;
    }

    public List<dish> getDishList() {
        return dishList;
    }

    public void setDishList(List<dish> dishList) {
        this.dishList = dishList;
    }

    @Override
    public String toString() {
        return "menu{" +
                "dishList=" + dishList +
                '}';
    }
}

