package use_case.clear_users;

// TODO Complete me

import use_case.signup.SignupInputData;

public interface ClearInputBoundary {
    void execute(ClearInputData clearInputData);
    // Sınce we have no ınput data for thıs use case, you dont need a parameter for your execute method; voıd execute(); ıs fıne
}
