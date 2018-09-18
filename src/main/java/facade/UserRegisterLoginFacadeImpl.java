package facade;

import api.UserRegisterLoginFacade;
import api.UserService;
import entity.User;
import service.UserServiceImpl;

public class UserRegisterLoginFacadeImpl implements UserRegisterLoginFacade {
    private UserService userService = UserServiceImpl.getInstance();
    private static UserRegisterLoginFacade instance = null;

    private UserRegisterLoginFacadeImpl() {

    }

    public static UserRegisterLoginFacade getInstance() {
        if (instance == null) {
            instance = new UserRegisterLoginFacadeImpl();
        }

        return instance;
    }

    public boolean registerUser(User user) {
        if (userService.addUser(user)) {
            return true;
        }
        return false;
    }

    public boolean loginUser(User user) {
        if (userService.isCorrectLoginAndPassword(user)) {
            return true;
        }

        return false;
    }


}
