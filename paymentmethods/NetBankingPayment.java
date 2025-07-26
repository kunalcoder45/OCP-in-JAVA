package PaymentOCP.paymentmethods;


public class NetBankingPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Net Banking");
    }
}
