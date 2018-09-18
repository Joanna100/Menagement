package validator;

import entity.Product;

public class ProductValidator {
    private static ProductValidator instance = null;

    private ProductValidator() {

    }

    public static ProductValidator getInstance() {
        if (instance == null) {
            instance = new ProductValidator();
        };

        return instance;
    }

    public boolean isValidate(Product product) {
        if (isPricePositive(product.getPrice())) {

            return false;
        }

        if (isCountNoNegative(product.getProductCount())) {

            return false;
        }

        if (isWeightPositive(product.getWeight())) {

            return false;
        }

        if (isNameNoEmpty(product.getProductName())) {

            return false;
        }

        return true;
    }

    private boolean isNameNoEmpty(String productName) {
        return productName.length() > 0;
    }

    private boolean isWeightPositive(Float weight) {
        return weight > 0.0f;
    }

    private boolean isCountNoNegative(Integer productCount) {
        return productCount >= 0;
    }

    private boolean isPricePositive(Float price) {
        return price > 0.0f;
    }
}
