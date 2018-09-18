package validator;

import entity.Product;
import exception.ProductCountNegativeException;
import exception.ProductNameEmptyException;
import exception.ProductPriceNoPositiveException;
import exception.ProductWeightNoPositiveException;

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

    public boolean isValidate(Product product) throws ProductNameEmptyException, ProductWeightNoPositiveException, ProductCountNegativeException, ProductPriceNoPositiveException {
        if (isPricePositive(product.getPrice())) {
            throw new ProductPriceNoPositiveException("Product price is no positive.");
        }

        if (isCountNoNegative(product.getProductCount())) {
            throw new ProductCountNegativeException("Product count is less than 0.");
        }

        if (isWeightPositive(product.getWeight())) {
            throw new ProductWeightNoPositiveException("Product weight is less or equals 0.");
        }

        if (isNameNoEmpty(product.getProductName())) {
            throw new ProductNameEmptyException("Product name cannot be empty.");
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
