package liskov_substitution.com.app;
public class ElectricCar extends Vehicle {

    @Override
    public void fuel() {
        System.out.println("Fueling not required");
    }
}
