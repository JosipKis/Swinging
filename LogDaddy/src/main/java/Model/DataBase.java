package Model;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private List<String> logData;
    private List<UserData> userData;

    public DataBase() {
        logData = new ArrayList<>();
        userData = new ArrayList<>();
    }

    public void addUser(String userId) {
        logData.add(userId);
    }

    public List<String> getLogData() {
        return logData;
    }

    public void clearUserIdList(){
        logData.clear();
    }

    public void addUserToList(UserData userData) {
        this.userData.add(userData);
    }

    public List<UserData> getUserData() {
        return userData;
    }

    public void clearUserData(){
        userData.clear();
    }
}