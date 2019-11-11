package management;

import staff.Employee;

public class Manager extends Employee {
    private String depName;
    public Manager(String name ,String nI , int salary,String depName){
        super(name ,nI,salary);
        this.depName=depName;
    }

    public String getDepName() {
        return depName;
    }
}
