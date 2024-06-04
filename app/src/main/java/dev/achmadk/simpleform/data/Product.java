package dev.achmadk.simpleform.data;

public class Product implements IProduct {
    private String productName = "Refrigerator";

    public Product(String productName) {
        this.productName = productName;
    }

    @Override
    public void getProduct() {

    }

    @Override
    public String getProductName() {
        return null;
    }
}
