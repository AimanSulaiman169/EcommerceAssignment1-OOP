// Assignment 1

public class Ecommerce{
//7 attributes
    private int productID;
    private String productName;
    private String category;
    private double price;
    private double weightKG;
    private boolean warranty;
    private boolean isOnSale;

    //Default constructor
    public Ecommerce(){
        this.productID = 1;
        this.productName = "Adibas";
        this.category = "Shoes";
        this.price = 100.00;
        this.weightKG = 1.00;
        this.warranty = true;
        this.isOnSale = true;
    }

    //Parameterized constructor
    public Ecommerce(int productID, String productName, String category, double price, double weightKG, boolean warranty, boolean isOnSale){
        this.productID = productID;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.weightKG = weightKG;
        this.warranty = warranty;
        this.isOnSale = isOnSale;
    }

    //Getters
    public int getProductID(){
        return productID;
    }
    public String getProductName(){
        return productName;
    }
    public String getCategory(){
        return category;
    }
    public double getPrice(){
        return price;
    }
    public double getWeightKG(){
        return weightKG;
    }
    public boolean getWarranty(){
        return warranty;
    }
    public boolean getIsOnSale(){
        return isOnSale;
    }

    //Setters
    public void setProductID(int productID){
        this.productID = productID;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public void setPrice(double price){
        if(price >= 0){
            this.price = price;
        } 
    }
    public void setWeightKG(double weightKG){
        if(weightKG >= 0){
            this.weightKG = weightKG;
        } 
    }
    public void setWarranty(boolean warranty){
        this.warranty = warranty;    
    }
    public void setIsOnSale(boolean isOnSale){
        this.isOnSale = isOnSale;
    }

    //Method
    //Method 1: Display Product Detail
    public void displayDetails(){
        System.out.println("---Product Detail---");
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name and Category: " + productName + " " + category);
        System.out.println("Product Price: RM " + price);
        System.out.println("Product Weight: " + weightKG + " Kilogram");
        System.out.println("Product have Warranty: " + warranty);
        System.out.println("Product is on Sale: " + isOnSale);
    }

    //Method 2: Calculate Shipping Based On weightKG (RM5.00 per kg)
    public double calculateShippingFee(){
        double ratePerKG = 5.00;
        return weightKG * ratePerKG;
    }

    //Method 3: Calculate Discount Price if appliable
    public double calculateSalePrice(){
        double discountPercentage = 10.00;
        if (isOnSale){
            return price - (price* (discountPercentage / 100));
        }
        return price;
    }
}