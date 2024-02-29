package estm.dsic.jee.data;


import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import estm.dsic.jee.models.User;
import jakarta.annotation.Resource;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named
@SessionScoped
public class UserRepositoryImpl implements UserRepository,Serializable {

    @Resource(lookup = "jdbc/testAuthDatabase")
    private DataSource dataSource;

    //private final DataSource dataSource;

    // public UserRepositoryImpl(DataSource dataSource) {
    //     this.dataSource = dataSource;
    // }

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

        System.out.println("\n\nDatabase : "+dataSource);
        if (dataSource == null) {
            System.err.println("DataSource is null. Ensure proper initialization.");
            return;
        }

        String sql = "INSERT INTO users (email, username, password) VALUES (?, ?, ?)";
        try (Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, user.getEmail());
            statement.setString(2, user.getUsername());
            statement.setString(3, user.getPassword());
            statement.executeUpdate();
            System.out.println("\n\n\nUser has added ...... " + user);
        } catch (SQLException e) {
            // Handle any SQL exceptions (e.g., logging, throwing custom exception)
            e.printStackTrace();
        }
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

