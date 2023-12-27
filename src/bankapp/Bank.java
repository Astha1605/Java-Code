package bankapp;

import java.util.List;

public class Bank {
    String name;
    String address;
    List<Employee> employeeList;

    public Bank(String name, String address, List<Employee> employeeList) {
        this.name = name;
        this.address = address;
        this.employeeList = employeeList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "employeeList=" + employeeList +
                '}';
    }
}
