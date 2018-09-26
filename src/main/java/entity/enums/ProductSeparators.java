package entity.enums;


public enum ProductSeparators {
    PRODUCT_SEPARATOR('#'), PRODUCT_ID('P'), ClOTH_ID('C'), BOOTS_ID('B');
    
    private char word;

    ProductSeparators(char word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return String.valueOf(word);
    }
}
