package org.sumdu;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("Andrey", "TRex", -12000);

        try {
            employee.setName("Alexandradmannako");
        } catch (FieldLengthLimitException e) {
            System.out.println(e.getMessage());
        }
    }
}
