package staff;

public abstract class Employee {
    private String name ;
    private String nI;
    private double salary ;

    public Employee(String name, String nI, int salary) {
        this.name=name;
        this.nI=nI;
        this.salary=salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getnI() {
        return nI;
    }

    public void setnI(String nI) {
        this.nI = nI;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void  raiseSalary(double raiseSalary ){
        this.salary += raiseSalary;
    }
    public double payBonus(){
       double  bonus = this.salary / 100 ;
        return bonus;
    }


}
