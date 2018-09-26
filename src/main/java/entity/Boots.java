package entity;

import entity.enums.Color;
import entity.enums.ProductSeparators;
import entity.enums.SkinType;

import java.util.EnumSet;

public class Boots extends Product {

    private Integer size;
    private SkinType skinType;

    public Boots(Long id, String productName, Float price, Float weight, EnumSet<Color> colors, Integer productCount, Integer size, SkinType skinType) {
        super(id, productName, price, weight, colors, productCount);
        this.size = size;
        this.skinType = skinType;
    }

    public Integer getSize() {
        return size;
    }

    public SkinType getSkinType() {
        return skinType;
    }

    @Override
    public String toString() {
        return ProductSeparators.BOOTS_ID + ProductSeparators.PRODUCT_SEPARATOR.toString() + getBasicProductString() + ProductSeparators.PRODUCT_SEPARATOR.toString() + size + ProductSeparators.PRODUCT_SEPARATOR.toString() + skinType;
    }
}
