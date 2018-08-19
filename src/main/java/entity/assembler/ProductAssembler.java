package entity.assembler;

import entity.Product;

public class ProductAssembler {

    public static Product stringToProduct(String productStr) {
        String [] productInformations = productStr.split(Product.PRODUCT_SEPARATOR);

        Long id = Long.parseLong(productInformations[0]);
        String productName = productInformations[1];
        Float price = Float.parseFloat(productInformations[2]);
        Float weight = Float.parseFloat(productInformations[3]);
        String color = productInformations[4];
        Integer productCount = Integer.parseInt(productInformations[5]);

        return new Product(id, productName, price, weight, color, productCount);
    }
}
