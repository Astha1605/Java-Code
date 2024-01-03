package interfaceabstract;

public class vehicleImplementation extends vehicle{

    @Override
    int vehiclePrice() {
        System.out.println("vehiclePrice");
        return 0;
    }

    @Override
    void printEngineType() {
        System.out.println("printEngineType");
    }
    @Override
    void vehicleInformation()
    {
        System.out.println("Vehicle details");
    }
}
