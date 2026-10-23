//Assignment 1

public class Main{
    public static void main(String[] args){
        //Test Default Constrictor
        Ecommerce item1 = new Ecommerce();

        //Test Parameterized Constrictor
        Ecommerce item2 = new Ecommerce(2, "Bolo", "Shirt", 200.00, 0.25, true, false);

        //Display Product Detail with Method 
        //Item 1 = Default
        System.out.println("---Item 1 Details---");
        item1.displayDetails();
        System.out.println("Shipping Fee: RM " + String.format("%.2f", item1.calculateShippingFee()));
        System.out.println("Price after 10% sale discount: RM " + String.format("%.2f", item1.calculateSalePrice()));
        //Item 2 = Paramiterized
        System.out.println("\n---Item 2 Details---");
        item2.displayDetails();
        System.out.println("Shipping Fee: RM " + String.format("%.2f", item2.calculateShippingFee()));

        //Attribute manipulation
        System.out.println("\n---Updating Item 2 Price---");
        item2.setPrice(150.00);
        System.out.println("Updated Price for " + item2.getProductName() + " " + item2.getCategory() + "is: RM " + String.format("%.2f", item2.getPrice()));
        
        //Looping Structure (For Statement in Array) (Shopping Cart Summary)
        Ecommerce[] cart = {item1, item2};
        System.out.println("\n---Shopping Cart Summary---");
        for (int i = 0; i < cart.length; i++){
            System.out.println((i + 1) + ". " + cart[i].getProductName() + " " + cart[i].getCategory() + "- RM " + cart[i].getPrice());

            //Selection Structure (If Statement) (Discount Status)
            if (cart[i].getIsOnSale()){
                System.out.println("Congratulations! You have got a great deal for the item.");
            }else{
                System.out.println("Regular price item.");
            }
        }
    }
}