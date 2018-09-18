import api.ProductDao;
import api.ProductService;
import api.UserDao;
import dao.ProductDaoImpl;
import dao.UserDaoImpl;
import entity.Boots;
import entity.Cloth;
import entity.Product;
import entity.User;
import service.ProductServiceImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        User user = new User(1l, "admin", "admin");
        Cloth cloth = new Cloth(1l, "T-shirt", 35.9f, 0.3f, "Black", 10,"XL", "Cotton");
        Boots boots = new Boots(2l, "High heels", 99.9f, .5f, "Red", 12, 35, true);
        Product product = new Product(3l, "Any", 11.f, .4f, "Black", 13);

        ProductService productService = ProductServiceImpl.getInstance();
        productService.saveProduct(cloth);
        productService.saveProduct(boots);
        productService.saveProduct(product);

        System.out.println(productService.getAllProducts());

        UserDao userDao = UserDaoImpl.getInstance();
        userDao.saveUser(user);
    }
}
