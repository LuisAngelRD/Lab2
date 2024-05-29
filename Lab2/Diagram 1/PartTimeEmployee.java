public class PartTimeEmployee extends Employee {
    private int workHours;
    private int hourlyRate;

    public PartTimeEmployee(String employeeName, int employeeId, int workHours, int hourlyRate) {
        super(employeeName, employeeId);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }

    public PartTimeEmployee(PartTimeEmployee partTimeEmployee) {
        super(partTimeEmployee.getEmployeeName(), partTimeEmployee.getEmployeeId());
        this.workHours = partTimeEmployee.workHours;
        this.hourlyRate = partTimeEmployee.hourlyRate;
    }

    @Override
    public void displayEmployeeInfo() {
        super.displayEmployeeInfo();
        System.out.println("Horas trabajadas: " + workHours + ", Pago por hora: " + hourlyRate);
    }

    @Override
    public double calculatePay() {
        return workHours * hourlyRate;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public int getWorkHours() {
        return workHours;
    }
}
