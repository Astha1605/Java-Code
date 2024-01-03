package ExceptionHandling;

import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int x=0;
        int y=1;
        int z =0;
        String ans = null;
        try(Scanner sc = new Scanner(System.in)) {
            ans = printCurrency(sc.next());
        }catch (ArrayStoreException  exp)
        {
            System.out.println("input is invalid"+ exp.getMessage());
        }
        finally {
            if(ans==null)
            ans = "chillar";
        }
        System.out.println(ans);
    }
    static String printCurrency(String countryName) throws ArrayStoreException {
        if(countryName.equalsIgnoreCase("india"))
            return "rupee";
        if(countryName.equalsIgnoreCase("USA"))
            return "Doller";
        if(countryName.contains("9"))
        {
            throw new ArrayStoreException("country name contains number");
        }
        return "";
    }
}
