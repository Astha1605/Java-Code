package interfaceabstract;

public class MusicSysImpl implements musicSystem,MediaType{

    @Override
    public int brandName() {
        System.out.println("brandName");
        return 0;
    }

    @Override
    public int version() {
        System.out.println("version");
        return 0;
    }

    @Override
    public void type() {
        System.out.println("type");
    }
    @Override
    public String mediaType() {
        System.out.println("type");
        return null;
    }
}
