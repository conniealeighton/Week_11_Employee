package Management;

public class Director extends Manager {

    private int budget;

    public Director(String name, int ni, double salary, String deptName, int budget) {
        super(name, ni, salary, deptName);
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }
}
