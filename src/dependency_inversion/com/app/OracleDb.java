package dependency_inversion.com.app;

public class OracleDb implements Database{
    @Override
    public void connect() {
        System.out.println("Connecting to OracleDb");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from OracleDb");
    }
}
