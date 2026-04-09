public class Main
{
    public static void main(String[] args)
    {
        Product p1 = new Product(1, "Laptop", 15000);
        Product p2 = new Product(2, "Mouse", 500);
        Product p3 = new Product(3, "Keyboard", 1000);

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        cart.removeProduct(2);

        cart.displayCart();

        System.out.println("Total Price: " + cart.calculateTotal());
    }
}