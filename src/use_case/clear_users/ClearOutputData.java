package use_case.clear_users;


import java.util.ArrayList;
import java.util.List;

public class ClearOutputData {
    private final ArrayList<String> deletedUsers;
    // Agaın before you gove the OUPUT DATA  to the vıew, you can store ıt however you want, but the end result should be
    // a strıng of users.

    public ClearOutputData(ArrayList<String> deletedUsers) {
        this.deletedUsers = deletedUsers;
    }

    public ArrayList<String> getDeletedUsers() {
        return deletedUsers;
    }

}
