package service;

import entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl {

    List<User> users;

    public UserServiceImpl() {
        this.users = new ArrayList<User>();
    }

    public UserServiceImpl(List<User> users) {
        this.users = users;
    }


    public List<User> getAllUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(int index) {
        users.remove(index);
    }
}
