package PaymentOCP;

import PaymentOCP.paymentmethods.PaymentMethod;

public class PaymentService {
    private PaymentMethod paymentMethod;
    public PaymentService(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public void makePayment(double amount) {
        paymentMethod.pay(amount);
    }
}
