//Interface Segregation principle
//Instead of creating large interface and forcing class to implement unnecessary methods, multiple small interfaces with relevant functionality can be created

package interface_segregation.com.app;

public class App {
    public static void main(String[] args) {
        CEO ceo = new CEO();

        ceo.salary();
        ceo.makeDecisions();
        ceo.addBonus();
        ceo.addStocks();

        Manager manager = new Manager();
        manager.addBonus();
        manager.hire();
        manager.salary();

        Employee employee = new Employee();
        employee.salary();

    }
}
