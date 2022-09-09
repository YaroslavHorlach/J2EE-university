package org.sumdu;

public class Employee {
    private final int MAX_LENGTH = 15;
    private int id;
    private static int nextId = 0;
    private String name;
    private String surname;
    private double salary;

    public Employee(String name, String surname, double salary) {
        id = nextId;
        nextId++;

        try {
            setName(name);
            setSalary(salary);
        } catch (FieldLengthLimitException e) {
            System.out.println(e.getMessage());
        } catch (IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        }

        this.surname = surname;
    }

    public void setName(String name) throws FieldLengthLimitException {
        if (name.length() > MAX_LENGTH) {
            throw new FieldLengthLimitException("Too long name");
        } else {
            this.name = name;
        }
    }

    public void setSalary(double salary) throws IncorrectSalaryException {
        if (salary < 0) {
            throw new IncorrectSalaryException("Salary can`t be nagative");
        } else {
            this.salary = salary;
        }
    }
}
