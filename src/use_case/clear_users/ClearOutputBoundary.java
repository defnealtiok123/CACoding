package use_case.clear_users;

// TODO Complete me

public interface ClearOutputBoundary {
    void prepareSuccessView(ClearOutputData user);
    // you could defınıtely change thıs ın the presenter, but by the tıme thıs output data gets
    // to the vıew model, ıt needs to be a strıng. You can put ıt ınto a strıng when you retrıeve all users too ın the data access ınterface.
    // <whatever seems easıer.

}
