package interface_segregation.com.app;

public class CEO implements ICEO {
    @Override
    public void addBonus() {
        System.out.println("CEO addBonus called");
    }

    @Override
    public void makeDecisions() {
        System.out.println("CEO makeDecisions called");

    }

    @Override
    public void addStocks() {
        System.out.println("CEO addStocks called");

    }

    @Override
    public void salary() {
        System.out.println("CEO salary called");

    }
}
