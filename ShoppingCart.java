import java.util.ArrayList;

public class ShoppingCart
{
    private ArrayList<Product> products;

    public ShoppingCart() {
        products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(int productId) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == productId) {
                products.remove(i);
                break;
            }
        }
    }

    public double calculateTotal() {
        double total = 0.0;
        for (int i = 0; i < products.size(); i++) {
            total = total + products.get(i).getPrice();
        }
        return total;
    }

    public void displayCart() {
        System.out.println("Shopping Cart:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).toString());
        }
    }
}
