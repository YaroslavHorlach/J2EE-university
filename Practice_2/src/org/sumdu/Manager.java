package org.sumdu;

import java.util.Objects;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, String surname, double salary, String departmentname, int managerID, double bonus) {
        super(name, surname, salary, departmentname, managerID);

        try {
            setBonus(bonus);
        } catch (IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        }
    }

    public void setBonus(double bonus) throws IncorrectSalaryException {
        if (bonus < 0) {
            throw new IncorrectSalaryException("Bonus can`t be below 0!");
        }

        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Double.compare(manager.bonus, bonus) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bonus);
    }
}
