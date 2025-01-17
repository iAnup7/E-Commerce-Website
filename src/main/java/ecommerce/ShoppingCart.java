package ecommerce;
import java.util.ArrayList;

public class ShoppingCart{

    private ArrayList<Product> allProducts = new ArrayList<>();
    //adds a single object of the product to the cart
    public void addProduct(Product prodNames){
    
        allProducts.add(prodNames);  
    }
    //removes a single object of the products to the cart
    public void removeProduct(Product prodNames){
        allProducts.remove(prodNames);
    }
    //returns true if product is in cart already, false otherwise
    public boolean hasProduct(Product prodNames){
       return allProducts.contains(prodNames);
    }
    //returns the total retail cost of the products in the cart, including tax
    public double totalCartPrice(){

       double cost = 0.0;
       for(int i = 0;i<allProducts.size();i++){
       cost += allProducts.get(i).getRetailPrice();
        }
       return cost;
    }
    //returns the  total retail cost of products in the cart with out tax
    public double beforeTaxPrice(){
    
       double priceWoutTax = 0.0;
       for(int i = 0;i<allProducts.size();i++){
          priceWoutTax += allProducts.get(i).getRetailPriceWithoutTax();
      }
      return priceWoutTax;
    }
    //returns the total checkout price
    public double checkout(){

        double finalPrice = 0.0;
        for(int i = 0;i<allProducts.size();i++){

            finalPrice += allProducts.get(i).getRetailPrice();
        }
        // System.out.println(finalPrice);
        // System.out.println(allProducts);
        int size = allProducts.size();
        // System.out.println("size = " + size);
        for(int i = 0;i<size;i++){
          allProducts.remove(0);
        //   System.out.println("line " + i);
        }

        // System.out.println("end size = " +allProducts.size());
        return finalPrice;
    }
    //returns the number of items in the cart
    public int getCartSize(){
        System.out.println(allProducts.size());
        return allProducts.size();
    }
    //returns a single String that contains every item in the cart, each on its own line .
    public String toString(){
        String finalString = "";
        for(int i = 0; i<allProducts.size(); i++){
            finalString = finalString + String.valueOf(allProducts.get(i)) + "\n";
        }
        finalString = finalString.trim();
        return finalString;
    }   
}