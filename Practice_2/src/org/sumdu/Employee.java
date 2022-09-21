package org.sumdu;

import java.util.Objects;

public class Employee {
    private final int MAX_LENGTH = 15;
    private int managerID;
    private int ID;
    private static int nextID = 0;
    private String departmentname;
    private String name;
    private String surname;
    private double salary;

    public Employee(String name, String surname, double salary, String departmentname, int managerID) {
        ID = nextID;
        nextID++;

        try {
            setName(name);
            setDepartmentname(departmentname);
            setSalary(salary);
        } catch (FieldLengthLimitException e) {
            System.out.println(e.getMessage());
        } catch (IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        }

        setManagerID(managerID);
        this.surname = surname;
    }

    public void setName(String name) throws FieldLengthLimitException {
        if (name.length() > MAX_LENGTH) {
            throw new FieldLengthLimitException("Too long name");
        }

        this.name = name;
    }

    public void setDepartmentname(String departmentname) throws FieldLengthLimitException {
        if (departmentname.length() > MAX_LENGTH) {
            throw new FieldLengthLimitException("Too long departmentname");
        }

        this.departmentname = departmentname;
    }

    public void setSalary(double salary) throws IncorrectSalaryException {
        if (salary < 0) {
            throw new IncorrectSalaryException("Salary can`t be nagative");
        }

        this.salary = salary;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getID() {
        return ID;
    }

    public int getManagerID() {
        return managerID;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return MAX_LENGTH == employee.MAX_LENGTH && managerID == employee.managerID && ID == employee.ID
                && Double.compare(employee.salary, salary) == 0 && Objects.equals(departmentname, employee.departmentname)
                && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(MAX_LENGTH, managerID, ID, departmentname, name, surname, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "managerID = " + managerID +
                ", ID = " + ID +
                ", departmentname = '" + departmentname + '\'' +
                ", name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", salary = " + salary +
                '}';
    }
}
