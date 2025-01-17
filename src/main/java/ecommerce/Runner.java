package ecommerce;

public class Runner{
    public static void main(String[] args){

        Product bottle = new Product();
        bottle.setName("bottle");
        bottle.setProductId(101);
        bottle.setCost(15.5);
        bottle.setTaxRate(0.76);
        bottle.setMarkUp(0.25);
        System.out.println(bottle.toString());

        Product pen = new Product();
        pen.setName("pen");
        pen.setProductId(105);
        pen.setCost(5.99);
        pen.setTaxRate(0.89);
        pen.setMarkUp(0.65);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(bottle);
        cart.addProduct(pen);
        cart.removeProduct(bottle);
        cart.hasProduct(bottle);
        cart.totalCartPrice();
        cart.beforeTaxPrice();
        cart.getCartSize();
        
        cart.checkout();
        cart.hasProduct(pen);
        cart.getCartSize();
        System.out.println(cart.toString());
        cart.toString();

        
        System.out.println(bottle.toString());
    }
}