public class Employee {
    private String employeeName;
    private int employeeId;

    public Employee(String employeeName, int employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    public Employee(Employee employee) {
        this(employee.employeeName, employee.employeeId);
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void displayEmployeeInfo() {
        System.out.println("Name: " + employeeName + ", ID: " + employeeId);
    }

    public double calculatePay() {
        return 0.0;
    }
}
