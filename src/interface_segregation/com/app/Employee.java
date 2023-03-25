package interface_segregation.com.app;

public class Employee implements IEmployee{
    @Override
    public void salary() {
        System.out.println("Worker salary called");

    }
}
