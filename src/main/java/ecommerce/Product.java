package ecommerce;

public class Product{
    //All the private variable declarations
    private int prodId;
    private String prodName;
    private Double prodCost;
    private static Double taxRate;  //Static variable declaration
    private Double markUp;
    private Double wholeCost;
    private Double retailPrice;
    private Double retailPriceWithoutTax;

    //All the setter methods
    void setProductId(int prodIds){
        this.prodId = prodIds;
    }
    //Sets the name pf the products
    void setName(String prodNames){
        this.prodName = prodNames;
    }
    //Sets the cost of the products 
    void setCost(Double prodCosts){
        this.prodCost = prodCosts;
    }
    //returns the wholesale cost of the item
    double getCost(){
        return prodCost;
    }
    //This is a static method which means this method's value can be used by 
    //all the other methods as if it were a constant
    static void setTaxRate(double rateTaxs){
    //If the tax rate is either less than 0 or more than 1,
    //It automatically sets the rate of tax to 0.13 as default
    if(rateTaxs>1 || rateTaxs<0){
        taxRate = 0.13;
    } else{
    taxRate = rateTaxs;
    }
    }
    // Sets the Markup by checking the condition 
    void setMarkUp(Double markUps){
        if(markUps>1 || markUps < 0){
        markUps = 0.25;
    }
    this.markUp = markUps;
    }
    //Returns the Id of the products
    public int getProductId(){
        return this.prodId;
    }
    //Returns the name of the product
    public String getName(){
        return this.prodName;
    }

    public double getRetailPrice(){
        // checks if both the cost of the product and the MarkUp is null
        if(prodCost != null && markUp != null){
            retailPrice = (prodCost * (1 + markUp)) * (1 + taxRate);
            return retailPrice;
        }else{//If both the above mentioned are null, then it returns 0
            return 0.0;
        }
        
    }
    //Returns the Markup rate 
    public double getMarkupRate(){
        return this.markUp;
    }
    //returns a string consisting of the item name, a colon, a space, and the retail price of the item
    public String toString(){
        return getName() + ":" + " " + String.format("%.2f", getRetailPrice());
    }
    //returns the taxRate which can be used 
    public static double getTaxRate(){
        return taxRate;
    }
    //This method only returns the retail price without the taxrate
    public double getRetailPriceWithoutTax(){
        retailPriceWithoutTax = (prodCost * (1 + markUp));
        return retailPriceWithoutTax;
    }
}
