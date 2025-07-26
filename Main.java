package PaymentOCP;
import PaymentOCP.paymentmethods.*;

public class Main {
    public static void main(String[] args) {
        PaymentService ps1 = new PaymentService(new CreditCardPayment());
        ps1.makePayment(500.0);

        PaymentService ps2 = new PaymentService(new DebitCardPayment());
        ps2.makePayment(750.0);

        PaymentService ps3 = new PaymentService(new UpiPayment());
        ps3.makePayment(250.0);

        PaymentService ps4 = new PaymentService(new CodPayment());
        ps4.makePayment(999.0);

        PaymentService ps5 = new PaymentService(new NetBankingPayment());
        ps5.makePayment(1200.0);

        PaymentService ps6 = new PaymentService(new WalletPayment());
        ps6.makePayment(300.0);
    }
}
