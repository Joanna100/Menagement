package api;

import entity.User;

public interface UserRegisterLoginFacade {
    boolean registerUser(User user);
    boolean loginUser(User user);
}
