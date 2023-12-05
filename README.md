# Employee
Suppose that a DePaul employee is represented with an Employee class as defined here:
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
This class represents an employee at a company. The calculateSalary() method calculates the employee's salary by adding 5% for each year of service.

You must define a new Manager class that inherits the Employee class with modified behaviors in order to represent a manager as described below:

A manager has a list of employees as subordinates field.

The manager's salary is calculated by adding 5% for each year of service plus an additional 2% for each subordinate. The calculateSalary() method must be overloaded by defining another calculateSalary method that takes a bonus parameter of type boolean. If bonus is true, the salary is increased by 10% of the base salary. Otherwise, the regular salary is returned.

The Manager class has constructor overloading as well. One constructor takes the same parameters as its parent class and an empty ArrayList of Employees must be initialized in this constructor. The second constructor has an additional parameter to take an array of employees and set it to the subordinates field.

The manager class must also include the following methods:
addSubordinate(Employee subordinate): Adds a subordinate to the list of subordinates.
removeSubordinate(Employee subordinate): Removes a subordinate from the list of subordinates.
getSubordinateCount(): Returns the number of subordinates.
The majority of your grade comes from correctly implementing behavior, but it is also important to keep in mind that part of your grade is based on using the inherited behavior from the superclass in an effective manner. Re-implementing behavior that already works correctly is discouraged, as it can lead to code duplication and inefficiencies. Therefore, whenever possible, try to make use of the superclass constructor and methods and same class methods as much as you can in order to avoid having to unnecessarily duplicate code. Code duplication without proper usage of OOP code reusing features will be penalized.

