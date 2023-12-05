import java.util.ArrayList;
import java.util.Arrays;

public class Manager extends Employee {
    private ArrayList<Employee> subordinates;

    public Manager(String name, int employeeID, int yearsOfService, double baseSalary) {
        super(name, employeeID, yearsOfService, baseSalary);
        subordinates = new ArrayList<Employee>();
    }

    public Manager(String name, int employeeID, int yearsOfService, double baseSalary, Employee[] subordinates) {
        super(name, employeeID, yearsOfService, baseSalary);
        this.subordinates = new ArrayList<Employee>(Arrays.asList(subordinates));
    }

    public void addSubordinate(Employee subordinate) {
        subordinates.add(subordinate);
    }

    public void removeSubordinate(Employee subordinate) {
        subordinates.remove(subordinate);
    }

    public int getSubordinateCount() {
        return subordinates.size();
    }

    @Override
    public double calculateSalary() {
        return calculateSalary(false);
    }

    public double calculateSalary(boolean bonus) {
        double salary = super.calculateSalary() + (0.02 * getSubordinateCount() * super.getBaseSalary());
        if (bonus) {
            salary *= 1.1;
        }
        return salary;
    }
}