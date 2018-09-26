package entity;

import entity.enums.Color;

import java.util.EnumSet;

public class Product {

    public final static String PRODUCT_SEPARATOR = "#";
    public final static char PRODUCT_TYPE = 'P';

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
        return id + PRODUCT_SEPARATOR + productName + PRODUCT_SEPARATOR + price + PRODUCT_SEPARATOR + weight + PRODUCT_SEPARATOR + colors + PRODUCT_SEPARATOR + productCount;
    }

    @Override
    public String toString() {
        return PRODUCT_TYPE + PRODUCT_SEPARATOR + getBasicProductString();
    }
}
