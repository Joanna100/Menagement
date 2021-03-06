package api;

import entity.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);

    void removeUserById(Long userId);
    void removeUserByLogin(String login);

    List<User> getAllUsers();

    void updateUser(User user);
}
