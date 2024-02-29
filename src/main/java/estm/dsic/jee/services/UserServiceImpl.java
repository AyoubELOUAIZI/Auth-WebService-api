package estm.dsic.jee.services;

import java.io.Serializable;

import estm.dsic.jee.data.UserRepository;
import estm.dsic.jee.models.User;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@SessionScoped
public class UserServiceImpl implements UserService ,Serializable {

    //private final UserRepository userRepository;

     // No-argument constructor
    //  public UserServiceImpl() {
    //     this.userRepository = null; // or initialize it to a default implementation if needed
    // }

    // public UserServiceImpl(UserRepository userRepository) {
    //     this.userRepository = userRepository;
    // }

    @Inject UserRepository userRepository;


    @Override
    public User getUserById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public void registerUser(User user) {
        userRepository.save(user);
    }

    @Override
    public boolean authenticateUser(String username, String password) {
        // Implementation for user authentication
        return false;
    }
}

