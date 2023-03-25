package liskov_substitution.com.app;
public abstract class Vehicle {
    public void start() {
        System.out.println("Vehicle starting");
    }

    public void stop() {
        System.out.println("Vehicle stopping");
    }

    public abstract void fuel();
}
