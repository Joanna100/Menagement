package api;

import entity.User;

import java.io.FileNotFoundException;
import java.util.List;

public interface UserDao {

    void saveUser(User user) throws FileNotFoundException;
    void saveUsers(List<User> users);

    void removeUserById(Long userId);
    void removeUserByLogin(String login);

    List<User> getAllUsers();
    User getUserById(Long userId);
    User getUserByLogin(String login);
    
}
