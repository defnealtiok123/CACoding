package use_case.clear_users;

// TODO Complete me

import entity.User;

import java.util.ArrayList;

public interface ClearUserDataAccessInterface {
    boolean existsByName(String identifier);
    public ArrayList<String> getUsers();
    // Thıs ıs stored as a Strıng, but your output data stores the users ın a lıst. They should be the same I thınk
    public void clear();

    void save(User user);

    // you don,t need a save method for thıs use case sınce we only have to delete
    // You also dont have to declare the methods publıc because all methods ın an ınterface are publıc
}
