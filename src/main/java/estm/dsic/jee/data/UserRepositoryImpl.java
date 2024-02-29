package estm.dsic.jee.data;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

import estm.dsic.jee.models.User;

public class UserRepositoryImpl implements UserRepository {

    private final DataSource dataSource;

    public UserRepositoryImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public User findById(int id) {
        // Implementation to retrieve user by ID from the database
        return null;
    }

    @Override
    public User findByUsername(String username) {
        // Implementation to retrieve user by username from the database
        return null;
    }

    @Override
    public User findByEmail(String email) {
        // Implementation to retrieve user by email from the database
        return null;
    }

    @Override
    public void save(User user) {
        // Implementation to save a new user to the database
    }

    @Override
    public void update(User user) {
        // Implementation to update user information in the database
    }

    @Override
    public void delete(User user) {
        // Implementation to delete a user from the database
    }
}

