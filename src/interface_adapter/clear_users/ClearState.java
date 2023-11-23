package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.signup.SignupState;

import java.util.ArrayList;
import java.util.List;

public class ClearState {
    private ArrayList<String> deletedUsers = new ArrayList<String>();

    public ClearState(ClearState copy) {
        deletedUsers = copy.deletedUsers;
    }

    public ClearState() {
    }

    public ArrayList<String> getDeletedUsers() {
        return deletedUsers;
    }

    public void setDeletedUsers(ArrayList<String> deletedUsers) {
        this.deletedUsers = deletedUsers;
    }
}
