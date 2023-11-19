package use_case.clear_users;

// TODO Complete me

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;

    public ClearInteractor(ClearUserDataAccessInterface clearDataAccessInterface) {
        this.userDataAccessObject = clearDataAccessInterface;
    }


    //@Override
    public void execute(ClearInputData clearInputData) {
        userDataAccessObject.getUsers();
        userDataAccessObject.clear();

    }
}
