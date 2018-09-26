package entity;

import entity.enums.Color;
import entity.enums.Material;

import java.util.EnumSet;

public class Cloth extends Product {

    public final static char PRODUCT_TYPE = 'C';

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
        return PRODUCT_TYPE + PRODUCT_SEPARATOR + getBasicProductString() + PRODUCT_SEPARATOR + size + PRODUCT_SEPARATOR + material;
    }
}
