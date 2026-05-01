// // Before refactoring
// public class DiscountCalculator {
//     public double calculateDiscount(Order order) {
//         double discount = 0.0;
//         if (order.getTotalAmount() > 100) {
//             if (order.getCustomer().isMember()) {
//                 discount = 0.2;
//             } else {
//                 discount = 0.1;
//             }
//         }
//         return discount;
//     }
// }

// after refactoring
public class DiscountCalculator {
    public double calculateDiscount(Order order) {
        if (order.getTotalAmount() <= 100) {
            return 0.0;
        }
        if (order.getCustomer().isMember()) {
            return 0.2;
        }
        return 0.1;
    }
}