package Country;

public class India implements Country{
    @Override
    public void flag() {
        System.out.println("Triranga");
    }

    @Override
    public void currency() {
        System.out.println("Rupee");
    }

    public void population() {
        System.out.println("population");
    }

}
