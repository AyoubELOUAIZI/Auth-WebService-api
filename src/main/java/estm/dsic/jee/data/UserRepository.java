package estm.dsic.jee.data;

import estm.dsic.jee.models.User;

public interface UserRepository {
    User findById(int id);
    User findByUsername(String username);
    User findByEmail(String email);
    void save(User user);
    void update(User user);
    void delete(User user);
}
