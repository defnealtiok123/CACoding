package use_case.clear_users;

// TODO Complete me

import entity.User;

public interface ClearUserDataAccessInterface {
    boolean existsByName(String identifier);
    public String getUsers();
    public void clear();

    void save(User user);
}
