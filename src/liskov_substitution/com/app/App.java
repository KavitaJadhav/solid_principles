//Liskov substitution principle
//object of super class should be replaceable with object of superclass
//Can be ensured by applying Strategy Pattern , Template Pattern

package liskov_substitution.com.app;

public class App {
    public static void main(String[] args) {
        Vehicle electricCar = new ElectricCar();

        electricCar.start();
        electricCar.stop();
        electricCar.fuel();

        Vehicle petrolCar = new PetrolCar();

        petrolCar.start();
        petrolCar.stop();
        petrolCar.fuel();
    }
}
