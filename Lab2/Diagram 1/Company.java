import java.util.ArrayList;

public class Company {
    private String companyName;
    private ArrayList<Employee> employees;

    public Company(String companyName) {
        this.companyName = companyName;
        this.employees = new ArrayList<>();
    }

    public void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
            return;
        }
        for (Employee employee : employees) {
            employee.display();
        }
    }

    public void addEmployee(Employee employee) {
        if (employee != null) {
            employees.add(employee);
            System.out.println("Employee added successfully.");
        } else {
            System.out.println("Cannot add a null employee.");
        }
    }

    public Employee findEmployeeByName(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        return null; // Not found
    }

    public void removeEmployeeByName(String name) {
        Employee employee = findEmployeeByName(name);
        if (employee != null) {
            employees.remove(employee);
            System.out.println("Employee removed successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    public double getAnnualSalaryByName(String name) {
        Employee employee = findEmployeeByName(name);
        if (employee != null) {
            return employee.calculatePay();
        }
        System.out.println("Employee not found.");
        return 0.0;
    }

    public double calculateAveragePayForPartTimeEmployees() {
        int partTimeEmployeeCount = 0;
        double totalPay = 0.0;
        for (Employee employee : employees) {
            if (employee instanceof PartTimeEmp) {
                totalPay += employee.calculatePay();
                partTimeEmployeeCount++;
            }
        }
        if (partTimeEmployeeCount > 0) {
            return totalPay / partTimeEmployeeCount;
        } else {
            System.out.println("No part-time employees found.");
            return 0.0;
        }
    }
}
