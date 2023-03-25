package liskov_substitution.com.app;
public class PetrolCar extends Vehicle {
    @Override
    public void fuel() {
        System.out.println("PetrolCar Fueling");
    }
}
