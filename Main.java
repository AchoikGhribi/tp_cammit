import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // بيانات تجريبية
        Customer customer = new Customer("Ahmed", true);
        Item item1 = new Item("LapTop", 1000, 1);
        Item item2 = new Item("Mouse", 50, 2);
        Order order = new Order();
        order.setCustomer(customer);
        order.setItems(Arrays.asList(item1, item2));
        order.setPayment(new Payment(1100));

        // اختبار OrderProcessor
        OrderProcessor processor = new OrderProcessor();
        processor.printOrderSummary(order);

        // اختبار DiscountCalculator
        DiscountCalculator discountCalc = new DiscountCalculator();
        double discount = discountCalc.calculateDiscount(order);
        System.out.println("promo : " + (discount * 100) + "%");
    }
}