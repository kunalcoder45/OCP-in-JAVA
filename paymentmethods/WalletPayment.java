package PaymentOCP.paymentmethods;

public class WalletPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Wallet");
    }
}
