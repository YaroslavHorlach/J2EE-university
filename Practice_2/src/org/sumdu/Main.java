package org.sumdu;

public class Main {

    public static void main(String[] args) {
        Manager manager1 = new Manager("Maxsim", "Chervyachok", 67000, "Pristroyshik",
                1, 5);
        Employee employee1 = new Employee("Andrey", "TRex", 1000, "Kagandrey", manager1.getID());
        Employee employee2 = new Employee("Denis", "Obosnuyskiy", 2022, "ADT", manager1.getID());
        Registry registry = Registry.getRegistry();

        try {
            registry.addWorker(manager1);
            registry.addWorker(employee1);
            registry.addWorker(employee2);
        } catch (EmployeeInRegistryException e) {
            System.out.println(e.getMessage());
        }

        registry.printList();

        try {
            registry.addWorker(employee1);
        } catch (EmployeeInRegistryException e) {
            System.out.println(e.getMessage());
        }
    }
}
