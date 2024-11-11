package Controller;

import Model.DatabaseConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Controller {

    private Connection con;
    private final DatabaseConfig databaseConfig = new DatabaseConfig();

    private final String DB_URL = databaseConfig.getDbUrl();
    private final String DB_USR = databaseConfig.getDbUsername();
    private final String DB_PWD = databaseConfig.getDbPassword();

    public static Controller controller = new Controller();

    private Controller(){

    }

    public void connectToDatabase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(DB_URL, DB_USR, DB_PWD);
        } catch (ClassNotFoundException e) {
            System.out.println("Could not load driver!!!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void dissconnect(){
        try {
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Controller getControllerInstance(){
        if (controller == null){
            controller = new Controller();
        }

        return controller;
    }
}