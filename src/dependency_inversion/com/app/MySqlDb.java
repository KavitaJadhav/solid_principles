package dependency_inversion.com.app;

public class MySqlDb implements Database {

    @Override
    public void connect() {
        System.out.println("Connecting to MySqlDb");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from MySqlDb");
    }
}
