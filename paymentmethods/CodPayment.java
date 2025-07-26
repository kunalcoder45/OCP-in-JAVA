package PaymentOCP.paymentmethods;

public class CodPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Order placed with Cash on Delivery");
    }
}
