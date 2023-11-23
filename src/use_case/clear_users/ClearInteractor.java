package use_case.clear_users;

// TODO Complete me

import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearOutputBoundary;

    public ClearInteractor(ClearUserDataAccessInterface clearDataAccessInterface, ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = clearDataAccessInterface;
        this.clearOutputBoundary = clearOutputBoundary;
    }


    //@Override
    public void execute(ClearInputData clearInputData) {
        ArrayList<String> users = userDataAccessObject.getUsers();
        ClearOutputData data = new ClearOutputData(users);
        userDataAccessObject.clear();
        clearOutputBoundary.prepareSuccessView(data);

    }
}
