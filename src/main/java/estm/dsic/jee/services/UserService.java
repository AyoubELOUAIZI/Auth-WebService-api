package estm.dsic.jee.services;

import estm.dsic.jee.models.User;

public interface UserService {
    User getUserById(int id);
    User getUserByUsername(String username);
    User getUserByEmail(String email);
    void registerUser(User user);
    boolean authenticateUser(String username, String password);
}

