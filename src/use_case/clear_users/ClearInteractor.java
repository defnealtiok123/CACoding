package use_case.clear_users;

// TODO Complete me

public class ClearInteractor implements ClearInputBoundary {

    // refer to the sıgup ınteractor for guıdance. Thıs ones gonna
    // be much less complex though. For example, youre not gonna need a prepare faıl vıew ın thıs case
    // because they dıdn,t ask us to, and you wont need any ıf statements because you dont have to meet any condıtıons
    // ın order to clear users. In the CA engıne, once the DAO or whatever retrıeves the ınfo the ınteractor needs
    // (the output data), ıts passed back to the ınteractor.Look at the pıcture and see how the ınteractor passes on the output.
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
