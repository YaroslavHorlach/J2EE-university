package org.sumdu;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    protected int id;
    protected static int nextid = 0;
    protected String name;
    protected String dept;
    protected List<Employee> subordinates;
    int manid;

    public Employee(String name, String dept) throws FieldLengthLimitException {
        this.id = nextid++;

        if (name.length() > 15)
            throw new FieldLengthLimitException("Name must be less then 15 symbols!");
        else
            this.name = name;

        this.dept = dept;
        subordinates = new ArrayList<Employee>();
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public String getDept() { return dept; }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public void PrintEmployee() {
        System.out.println("Employee : [ Name: " + name + ", Dept: " + dept + " ]: managerID: " + manid);
    }
}
