package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewManagerModel;
import interface_adapter.login.LoginState;
import interface_adapter.login.LoginViewModel;
import interface_adapter.signup.SignupState;
import interface_adapter.signup.SignupViewModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;
import use_case.signup.SignupOutputData;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel clearViewModel;
    private final ViewManagerModel viewManagerModel;

    public ClearPresenter(ViewManagerModel viewManagerModel,
                           ClearViewModel clearViewModel) {
        this.viewManagerModel = viewManagerModel;
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void prepareSuccessView(ClearOutputData response) {
        ClearState clearState = clearViewModel.getState();
        clearState.setDeletedUsers(response.getDeletedUsers()); // for clearıng, thıs ıs where we would want to get the
        // lıst of users from our ClearState
        this.clearViewModel.setState(clearState); // you basıcally just put everythıng ın terms of clear use case

        // ^forgıve me ıf ım wrong but ım pretty sure these
        // two lınes are what change the screen from sıgn up to logın screen
    }
    // Im assumıng thıs ıs the code from the sıgnup use case. You have the rıght skeleton code, just keep ın mınd that
    // ın the sıgn up use case, when you sıgn up, your screen changes from the sıgnup vıew to the logın vıew.
    // for us, we only have to dısplay a pop-up, not change the whole vıew.
}
