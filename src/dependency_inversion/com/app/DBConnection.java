package dependency_inversion.com.app;

public class DBConnection {
    private Database database;

    public DBConnection(Database db) {
        this.database = db;
    }

    public void connect() {
        database.connect();
    }

    public void disconnect() {
        database.disconnect();
    }
}
