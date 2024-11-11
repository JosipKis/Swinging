package Model;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private List<String> userIds;

    public DataBase() {
        userIds = new ArrayList<>();
    }

    public void addUser(String userId) {
        userIds.add(userId);
    }

    public List<String> getUserIds() {
        return userIds;
    }

    public void clearUserIdList(){
        userIds.clear();
    }
}