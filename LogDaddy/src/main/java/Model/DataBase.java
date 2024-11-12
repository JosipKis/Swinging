package Model;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private List<String> logData;

    public DataBase() {
        logData = new ArrayList<>();
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
}