package org.sumdu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Registry {
    private static Registry WorkersRegistry = new Registry();
    private List<Employee> workers;

    private Registry() {
        workers = new LinkedList<Employee>();
    }

    public static Registry getRegistry() {
        return WorkersRegistry;
    }

    public void addWorker(Employee man) throws EmployeeInRegistryException {
        if (workers.contains(man)) {
            throw new EmployeeInRegistryException("Can not add the same person!");
        }

        workers.add(man);
    }

    public void printList() {
        for (Employee employee: workers) {
            System.out.println(employee);
        }
    }
}
