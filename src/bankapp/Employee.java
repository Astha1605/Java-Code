package bankapp;

public class Employee extends Person {
    int empId;
    String empDetails;

    public Employee(String name, int age, String dob, int empId, String empDetails) {
        super(name, age, dob);
        this.empId = empId;
        this.empDetails = empDetails;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpDetails() {
        return empDetails;
    }

    public void setEmpDetails(String empDetails) {
        this.empDetails = empDetails;
    }
    public int getSalary()
    {
        int salary=0;
        if(empDetails.equalsIgnoreCase("manager"))
        {
            salary=400000;
        }
        if(empDetails.equalsIgnoreCase("assistant manager"))
        {
            salary=300000;
        }
        if(empDetails.equalsIgnoreCase("clerk"))
        {
            salary=200000;
        }
        if(empDetails.equalsIgnoreCase("peon"))
        {
            salary=100000;
        }
        if(empDetails.equalsIgnoreCase("baby"))
        {
            salary=110000;
        }
        return salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empDetails='" + empDetails + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dob='" + dob + '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}
