package interface_segregation.com.app;

public class Manager implements IManager {
    @Override
    public void addBonus() {
        System.out.println("Manager addBonus called");
    }

    @Override
    public void salary() {
        System.out.println("Manager salary called");

    }

    @Override
    public void hire() {
        System.out.println("Manager hire called");

    }

    @Override
    public void train() {
        System.out.println("Manager train called");

    }
}
