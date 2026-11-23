package src;
import java.util.ArrayList;
public class Product{
    private static int nextID = 0;
    private int productID;
    private String productName;
    private String category;
    private String supplier;

    public Product (String productName, String category, String supplier){
        this.productName = productName;
        this.category = category;
        this.supplier = supplier;
        nextID ++;
        this.productID = nextID;
    }

    public int getProductID(){
        return productID;
    }
    public String getProductName(){
        return productName;
    }
    public String getCategory(){
        return category;
    }
    public String getSupplier(){
        return supplier;
    }
    @Override 
    public String toString(){
        return "Product ID: " + productID +
           ", Name: " + productName +
           ", Category: " + category +
           ", Supplier: " + supplier;
    }
}