package entity;

import entity.enums.Color;
import entity.enums.ProductSeparators;

import java.util.EnumSet;


public class Product {
    private Long id;
    private String productName;
    private Float price;
    private Float weight;
    private EnumSet<Color> colors;
    private Integer productCount;

    public Product(Long id, String productName, Float price, Float weight, EnumSet<Color> colors, Integer productCount) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.weight = weight;
        this.colors = colors;
        this.productCount = productCount;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public Float getPrice() {
        return price;
    }

    public Float getWeight() {
        return weight;
    }

    public EnumSet<Color> getColors() {
        return colors;
    }

    public Integer getProductCount() {
        return productCount;
    }

    protected String getBasicProductString() {
        return id + ProductSeparators.PRODUCT_SEPARATOR.toString() + productName + ProductSeparators.PRODUCT_SEPARATOR.toString() + price + ProductSeparators.PRODUCT_SEPARATOR.toString() + weight + ProductSeparators.PRODUCT_SEPARATOR.toString() + colors + ProductSeparators.PRODUCT_SEPARATOR.toString() + productCount;
    }

    @Override
    public String toString() {
        return ProductSeparators.PRODUCT_ID + ProductSeparators.PRODUCT_SEPARATOR.toString() + getBasicProductString();
    }
}
