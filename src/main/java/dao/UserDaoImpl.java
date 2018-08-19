package dao;

import api.UserDao;
import entity.User;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private final String fileName;

    public UserDaoImpl(String fileName) {
        this.fileName=fileName;
    }

    public void saveUser(User user) throws FileNotFoundException {

    }

    public void saveUsers(List<User> users) {

    }

    public void removeUserById(Long userId) {

    }

    public void removeUserByLogin(String login) {

    }

    public List<User> getAllUsers() {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
    }

    public User getUserById(Long userId) {
        return null;
    }

    public User getUserByLogin(String login) {
        return null;
    }
}
