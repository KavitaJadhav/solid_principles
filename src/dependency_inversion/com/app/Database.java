package dependency_inversion.com.app;

public interface Database {
    public void connect();
    public void disconnect();
}
