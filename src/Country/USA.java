package Country;

public class USA implements Country {

    @Override
    public void flag() {
        System.out.println("40 Star");
    }

    @Override
    public void currency() {
        System.out.println("Doller");
    }
}
