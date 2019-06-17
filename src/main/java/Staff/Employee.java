package Staff;

public class Employee {

    private String name;
    private String nINumber;
    public int salary;


    public Employee(String name, String nINumber, int salary) {
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null){
        this.name = name;}
    }

    public String getnINumber() {
        return nINumber;
    }

    public void setnINumber(String nINumber) {
        this.nINumber = nINumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void raiseSalary(double percentage) {
        if(percentage>0){
        this.salary *= 1+(percentage/100);}

    }

    public double payBonus() {
        return this.salary/100;
    }
}
