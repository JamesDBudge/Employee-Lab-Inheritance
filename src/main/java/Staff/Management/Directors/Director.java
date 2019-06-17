package Staff.Management.Directors;

import Staff.Management.Manager;

public class Director extends Manager {

    private double budget;

    public Director(String name, String nINumber, int salary, String department, double budget) {
        super(name, nINumber, salary, department);
        this.budget = budget;
    }


    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double payBonus() {
        return this.salary/50;
    }
}
