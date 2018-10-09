package rest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.eclipse.persistence.eis.EISConnectionSpec.PASSWORD;

public class DbConnection {

    private static final String URL="jdbc:mysql://127.0.0.1:3306/kcs";    //pakurtas connection su DB
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public static Connection CreateConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");  //nurodomi draiveriai
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return connection;        //pakurtas connection su DB
    }
}
