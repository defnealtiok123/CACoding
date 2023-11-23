package use_case.clear_users;

// TODO Complete me

import entity.User;

import java.util.ArrayList;

public interface ClearUserDataAccessInterface {
    boolean existsByName(String identifier);
    public ArrayList<String> getUsers();

    public void clear();

    void save(User user);

}
