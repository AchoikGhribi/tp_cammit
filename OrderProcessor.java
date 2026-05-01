// // Before refactoring
// import java.util.List;

// public class OrderProcessor {
//     public void printOrderSummary(Order order) {
//         double totalPrice = 0;
//         for (Item item : order.getItems()) {
//             totalPrice += item.getPrice() * item.getQuantity();
//         }
//         if (order.getCustomer().isMember()) {
//             totalPrice *= 0.9;
//         }
//         System.out.println("Order Summary:");
//         System.out.println("Customer: " + order.getCustomer().getName());
//         System.out.println("Items:");
//         for (Item item : order.getItems()) {
//             System.out.println("  - " + item.getName());
//         }
//         System.out.println("Total Price: $" + totalPrice);
//     }
// }

// After refactoring
import java.util.List;

public class OrderProcessor {
    public void printOrderSummary(Order order) {
        double totalPrice = calculateTotalPrice(order.getItems());
        totalPrice = applyDiscount(totalPrice, order.getCustomer().isMember());
        printSummary(order, totalPrice);
    }

    private double calculateTotalPrice(List<Item> items) {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }

    private double applyDiscount(double price, boolean isMember) {
        if (isMember) return price * 0.9;
        return price;
    }

    private void printSummary(Order order, double total) {
        System.out.println("Order Summary:");
        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.println("Items:");
        for (Item item : order.getItems()) {
            System.out.println("  - " + item.getName());
        }
        System.out.println("Total Price: $" + total);
    }

    // Eliminate Duplicate Code
    private void validateOrder(Order order) {
        if (order.getItems().isEmpty()) {
            throw new IllegalArgumentException("Order must have items");
        }
        if (order.getCustomer() == null) {
            throw new IllegalArgumentException("Order must have a customer");
        }
    }

    private void validatePayment(Payment payment) {
        if (payment == null || payment.getAmount() <= 0) {
            throw new IllegalArgumentException("Invalid payment");
        }
    }
} 