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

    // Because of the previous copy constructor, the default constructor must be explicit.
    public ClearState() {
    }

    public List getDeletedUsers() {
        return deletedUsers;
    }

    public void setDeletedUsers(ArrayList<String> deletedUsers) {
        this.deletedUsers = deletedUsers;
    }
}


// your clear state ısn,t gonna be as lengthy as the sıgn up use case. It wıll sımply store the ınformatıon you need to
// pass on to the vıew; the users. So format ıt ın the way thıs fıle does, but only do ıt for users.
