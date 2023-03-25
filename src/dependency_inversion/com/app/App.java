//Dependency Inversion
//High level design is tightly coupled with low level design
//use abstraction by adding layer

package dependency_inversion.com.app;


public class App {
    public static void main(String[] args) {
        DBConnection sql_connection = new DBConnection(new MySqlDb());
        sql_connection.connect();
        sql_connection.disconnect();

        DBConnection oracle_connection = new DBConnection(new OracleDb());
        oracle_connection.connect();
        oracle_connection.disconnect();
    }
}
