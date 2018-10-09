import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/kcs";   //FINAL - KAD NEPERSIRASYTU REIKSME , kodas i database
    private static final String USERNAME = "root";   //kcs - duomenu bases pavadinimas
    private static final String PASSWORD = "";


    public static Connection creatConnection() { //METODAS

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        }catch (SQLException e) {
            System.out.println(e);
        }
        return connection;


    }




}
