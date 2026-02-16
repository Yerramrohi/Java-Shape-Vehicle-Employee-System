package assignment6_employees;

public class SalariedEmployee implements assignment6_employees.Payable {

    private double annualSalary;

    public SalariedEmployee(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculatePay() {
        return annualSalary / 12;
    }
}
