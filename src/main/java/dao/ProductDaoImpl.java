package dao;

import api.ProductDao;
import entity.Product;
import entity.assembler.ProductAssembler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {

    private final String fileName;

    public ProductDaoImpl(String fileName) {
        this.fileName=fileName;
    }

    public void saveProduct(Product product) {

    }

    public void saveProducts(List<Product> products) {

    }

    public void removeProductById(Long productId) {

    }

    public void removeProductByName(String productName) {

    }

    public List<Product> getAllProducts() throws IOException {
        List<Product> products = new ArrayList<Product>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

        String readLine = bufferedReader.readLine();
        while(readLine != null) {
            Product product = ProductAssembler.stringToProduct(readLine);
            products.add(product);
        }

        return products;
    }

    public Product getProductById(Long productId) throws IOException {
        List<Product> products = getAllProducts();

        for (Product product : products
             ) {
            boolean isFoundProduct = product.getId() == productId;
            if (isFoundProduct) {
                return product;
            }

        }

        return null;
    }

    public Product getProductByProductName(String productName) throws IOException {
        List<Product> products = getAllProducts();

        for (Product product : products
                ) {
            boolean isFoundProduct = product.getProductName().equals(productName);
            if (isFoundProduct) {
                return product;
            }

        }

        return null;
    }
}
