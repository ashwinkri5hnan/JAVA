import java.text.SimpleDateFormat;
import java.util.Date;

// Interface with prototype function for calculation
interface Billable {
    double calculate();
}

// Product class implementing the Billable interface
class Product implements Billable {
    private int productId;
    private String name;
    private int quantity;
    private double unitPrice;

    public Product(int productId, String name, int quantity, double unitPrice) {
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public double calculate() {
        return quantity * unitPrice;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-10s %-10d %-12.2f %.2f",
                productId, name, quantity, unitPrice, calculate());
    }
}

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String orderNo = "123456";
        Date date = new Date();

        System.out.println("Order No: " + orderNo);
        System.out.println("Date: " + dateFormat.format(date));
        System.out.println();
        System.out.println("Product ID    Name       Quantity    Unit Price   Total");
        System.out.println("--------------------------------------------------------");

        // Create a Product object
        Product product = new Product(123, "ashwin", 3, 200);

        System.out.println(product);

        System.out.println("--------------------------------------------------------");
    }
}

