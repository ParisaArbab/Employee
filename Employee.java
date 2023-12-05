public class Employee {
    private String name;
    private int employeeID;
    private int yearsOfService;
    private double baseSalary;

    public Employee (String name, int employeeID, int yearsOfService, double baseSalary) {
        this.name = name;
        this.employeeID = employeeID;
        this.yearsOfService = yearsOfService;
        this.baseSalary = baseSalary;
    }

    public String getName ()
    {
        return name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public int getYears0fService() {
        return yearsOfService;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double calculateSalary() {
        return baseSalary + (0.05 * yearsOfService * baseSalary);
        }
}