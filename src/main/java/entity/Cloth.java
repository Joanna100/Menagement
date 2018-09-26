package entity;

import entity.enums.Color;
import entity.enums.Material;
import entity.enums.ProductSeparators;

import java.util.EnumSet;

public class Cloth extends Product {
    private String size;
    private Material material;

    public Cloth(Long id, String productName, Float price, Float weight, EnumSet<Color> colors, Integer productCount, String size, Material material) {
        super(id, productName, price, weight, colors, productCount);
        this.size = size;
        this.material = material;
    }


    public String getSize() {
        return size;
    }

    public Material getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return ProductSeparators.ClOTH_ID + ProductSeparators.PRODUCT_SEPARATOR.toString() + getBasicProductString() + ProductSeparators.PRODUCT_SEPARATOR.toString() + size + ProductSeparators.PRODUCT_SEPARATOR.toString() + material;
    }
}
