public class FullTimeEmployee extends Employee {
    private int annualSalary;

    public FullTimeEmployee(String employeeName, int employeeId, int annualSalary) {
        super(employeeName, employeeId);
        this.annualSalary = annualSalary;
    }

    public FullTimeEmployee(FullTimeEmployee fullTimeEmployee) {
        super(fullTimeEmployee.getEmployeeName(), fullTimeEmployee.getEmployeeId());
        this.annualSalary = fullTimeEmployee.annualSalary;
    }

    @Override
    public void displayEmployeeInfo() {
        super.displayEmployeeInfo();
        System.out.println("Salario Anual: " + annualSalary);
    }

    @Override
    public double calculatePay() {
        return annualSalary;
    }

    public int getAnnualSalary() {
        return annualSalary;
    }
}
