package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;
import use_case.clear_users.ClearInputData;

// TODO Complete me
public class ClearController {
    final ClearInputBoundary userClearUseCaseInteractor;
    public ClearController(ClearInputBoundary userClearUseCaseInteractor) {
        this.userClearUseCaseInteractor = userClearUseCaseInteractor;
    }

    public void execute() {
        ClearInputData clearInputData = new ClearInputData();
        userClearUseCaseInteractor.execute(clearInputData);
        // There ıs no ınput data. The user just clıcks the clear button and every user wıll get deleted, and the
        // program should dısplay a strıng that shows all of the usernames after.
    }
}
