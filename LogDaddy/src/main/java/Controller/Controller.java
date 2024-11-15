package Controller;

import Model.DataBase;
import Model.DatabaseConfig;
import Model.UserData;

import java.sql.*;
import java.util.List;

public class Controller {

    private Connection con;
    private final DatabaseConfig databaseConfig = new DatabaseConfig();

    private final String DB_URL = databaseConfig.getDbUrl();
    private final String DB_USR = databaseConfig.getDbUsername();
    private final String DB_PWD = databaseConfig.getDbPassword();

    private DataBase dataBase;
    private UserData userData;
    public static Controller controller = new Controller();

    private Controller(){
        dataBase = new DataBase();
        userData = new UserData();
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

    public List<String> getUserIdBySector(String sector){
        if (con != null) {
            dataBase.clearUserIdList();
            String query = "SELECT logs.user_id FROM logs WHERE tablica = ?";
            try (PreparedStatement ps = con.prepareStatement(query)){
                ps.setString(1, sector);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    String userData = rs.getString("user_id");
                    dataBase.addUser(userData);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return dataBase.getLogData();
    }

    // napraviti upis na svaku od sektora, sa switch case ces risit koju zvati !!!
    public UserData getOdredeniUserByID(String id){
        userData.nullAll();
        if (con != null) {
            String query = "SELECT * FROM odredeno_radnici WHERE id = ?";

            try (PreparedStatement ps = con.prepareStatement(query)){
                ps.setString(1, id);

                ResultSet rs = ps.executeQuery();
                while (rs.next()) {

                    userData.setId(Integer.parseInt(id));
                    userData.setName(rs.getString("ime_i_prezime"));
                    userData.setAddress(rs.getString("adresa_ulica") + rs.getString("adresa_grad"));
                    userData.setIsplataGo(rs.getString("isplata_go"));
                    userData.setNapomena(rs.getString("napomena"));
                    userData.setOib(rs.getString("oib"));
                    userData.setWorkPlace(rs.getString("radno_mjesto"));
                    userData.setWorkPlaceCode(rs.getString("sifra_rm"));
                    userData.setService(rs.getString("sluzba"));
                    userData.setStatus((rs.getString("status")));
                    userData.setDateBegin(rs.getDate("datum_pocetka"));
                    userData.setDateEnd(rs.getDate("kraj_rada"));
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return userData;
    }

    public UserData getNeodredeniById(String id){
        userData.nullAll();
        if (con != null) {
            String query = "SELECT * FROM neodredeno_radnici WHERE id = ?";

            try (PreparedStatement ps = con.prepareStatement(query)){
                ps.setString(1, id);

                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    // umjesto statusa; opis, umjesto datum_kraja; datum_promjene
                    userData.setId(Integer.parseInt(id));
                    userData.setName(rs.getString("ime_i_prezime"));
                    userData.setAddress(rs.getString("adresa_ulica") + rs.getString("adresa_grad"));
                    userData.setIsplataGo(rs.getString("isplata_go"));
                    userData.setNapomena(rs.getString("napomena"));
                    userData.setOib(rs.getString("oib"));
                    userData.setWorkPlace(rs.getString("radno_mjesto"));
                    userData.setWorkPlaceCode(rs.getString("sifra_rm"));
                    userData.setService(rs.getString("sluzba"));
                    userData.setStatus((rs.getString("opis")));
                    userData.setDateBegin(rs.getDate("datum_pocetka"));
                    userData.setDateEnd(rs.getDate("datum_promjene"));
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return userData;
    }


    public static Controller getControllerInstance(){
        if (controller == null){
            controller = new Controller();
        }

        return controller;
    }
}