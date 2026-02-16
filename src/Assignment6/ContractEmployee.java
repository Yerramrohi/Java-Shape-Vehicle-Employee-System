package assignment6_employees;

public class ContractEmployee implements assignment6_employees.Payable {

    private double hourlyRate;
    private double hoursWorked;

    public ContractEmployee(double hourlyRate, double hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
