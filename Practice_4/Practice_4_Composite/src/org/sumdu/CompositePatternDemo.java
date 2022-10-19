package org.sumdu;

public class CompositePatternDemo {
    public static void main(String[] args) throws FieldLengthLimitException, EmployeeInRegistryException {
        Registry hr = Registry.getInstance();

        Manager CEO = new Manager("John", "CEO");
        hr.addWorker(CEO);

        Employee headSales = new Employee("Robert", "Head Sales");
        hr.addWorker(headSales);
        headSales.manid = CEO.id;

        Employee headMarketing =new Employee("michel", "Head Marketing");
        hr.addWorker(headMarketing);
        headMarketing.manid = CEO.id;

        Employee clerk1 = new Employee("laura", "Marketing");
        hr.addWorker(clerk1);
        clerk1.manid = headMarketing.id;

        Employee clerk2 = new Employee("Bob", "Marketing");
        hr.addWorker(clerk2);
        clerk2.manid = headMarketing.id;

        Employee salesExecutives1 = new Employee("Richard", "Sales");
        hr.addWorker(salesExecutives1);
        salesExecutives1.manid = headSales.id;

        Employee salesExecutives2 = new Employee("Bob", "Sales");
        hr.addWorker(salesExecutives2);
        salesExecutives2.manid = headSales.id;

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutives1);
        headSales.add(salesExecutives2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        CEO.PrintEmployee();

        for(Employee headEmployee : CEO.getSubordinates()){
            headEmployee.PrintEmployee();

            for (Employee employee :headEmployee.getSubordinates()){
                employee.PrintEmployee();
            }
        }
    }
}
