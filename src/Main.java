import assignment4_shapes.*;
import assignment5_vehicles.*;
import assignment6_employees.*;

public class Main {

    public static void main(String[] args) {

        assignment4_shapes.Shape circle = new assignment4_shapes.Circle(5);
        assignment4_shapes.Shape rectangle = new assignment4_shapes.Rectangle(4, 6);
        assignment4_shapes.Shape triangle = new Triangle(3, 4, 5);

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Triangle Area: " + triangle.area());

        assignment5_vehicles.Vehicle v = new assignment5_vehicles.Vehicle();
        assignment5_vehicles.Vehicle car = new assignment5_vehicles.Car();
        assignment5_vehicles.Vehicle bike = new assignment5_vehicles.Bike();

        v.start();
        car.start();
        bike.start();

        assignment6_employees.Payable salaried = new assignment6_employees.SalariedEmployee(600000);
        assignment6_employees.Payable contract = new assignment6_employees.ContractEmployee(500, 40);

        System.out.println("Salaried Monthly Pay: " + salaried.calculatePay());
        System.out.println("Contract Employee Pay: " + contract.calculatePay());
    }
}
