package Staff;

public abstract class Employee {

    private String name;
    private int ni;
    private double salary;

    public Employee(String name, int ni, double salary) {
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getni() {
        return ni;
    }

    public double getSalary() {
        return salary;
    }


//    Add a method named raiseSalary with takes in a parameter of type double to increment the salary.


    public void raiseSalary(double increase) {
        this.salary += increase;
    }


//    Add a method called payBonus which returns 1% of the employees salary.


    public double payBonus() {
        return this.salary * 0.01;
    }
}
