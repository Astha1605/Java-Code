public class Polymorphism {
     void methodOverload(String a, int b)
    {
        System.out.println("Method1");
    }
     void methodOverload(int a, String b)
    {
        System.out.println("Method2");
    }

    public static void main(String[] args)
    {
       Polymorphism polymorphism=new Polymorphism();
       polymorphism.methodOverload(6,"y");
    }
}
