package service;

import data.User;

import java.util.HashMap;
import java.util.Map;

public class AccountService {

    private final Map<Long, User> authorizedUsersMap;

    private User loggedInUser;

    public AccountService() {
        this.authorizedUsersMap = new HashMap<>();
    }

    public void addNewUser(User user) {
        this.authorizedUsersMap.put(user.getId(), user);
    }

    public void removeUser(User user) {
        this.authorizedUsersMap.remove(user.getId());
    }

    public User getUserById(User user) {
        return this.authorizedUsersMap.get(user.getId());
    }

    public User getUserByUsername(String username) {
        this.authorizedUsersMap.forEach((id, user) -> filterUsername(id, user, username));
        return this.loggedInUser;
    }

    public User getUserByEmail(String email) {
        this.authorizedUsersMap.forEach((id, user) -> filterEmail(id, user, email));
        return this.loggedInUser;
    }

    private void filterUsername(Long id, User user, String username) {
        if (user.getUsername().equals(username)) {
            this.loggedInUser = user;
        } else {
            this.loggedInUser = null;
        }
    }

    private void filterEmail(Long id, User user, String email) {
        if (user.getEmail().equals(email)) {
            this.loggedInUser = user;
        } else {
            this.loggedInUser = null;
        }
    }
}
