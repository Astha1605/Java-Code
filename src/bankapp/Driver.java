package bankapp;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        Employee astha=new Employee("astha",25,"16/05/1998",767706,"Manager");
        Employee upen=new Employee("upen",28,"21/10/1995",84090,"Peon");
        Employee niku=new Employee("niku",26,"15/051997",160598,"Clerk");
        Employee ravi=new Employee("ravi",24,"07/12/1998",712998,"Assistant Manager");
        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(astha);
        employeeList.add(upen);
        employeeList.add(ravi);
        employeeList.add(niku);
        Bank HDFC=new Bank("hdfc","kolakata",employeeList);
        System.out.println(HDFC.getName());
        System.out.println(HDFC.getAddress());
        System.out.println(HDFC);
        Employee bunny=new Employee("bunny",1,"07/12/192023",101101,"baby");
        HDFC.getEmployeeList().add(bunny);
        System.out.println(HDFC);
    }
}
