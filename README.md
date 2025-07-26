# **Payment OCP Example (Java)**

This project demonstrates the **Open-Closed Principle (OCP)** from **SOLID principles** using a **Payment System** example in Java.

---

## **What is OCP?**

> **Open-Closed Principle (OCP):**
> *“A class should be open for extension but closed for modification.”*
> This means you can add new features or behaviors **without changing the existing, tested code**.

---

## **Project Overview**

The project implements a payment system where multiple payment methods (**Credit Card, Debit Card, UPI, COD, Net Banking**) are supported.

* **Without OCP:** We would use `if-else` or `switch` statements in a single class, and each new payment method would require modifying existing code.
* **With OCP:** We define a `PaymentMethod` interface and create **separate classes** for each payment method.

  * New payment methods can be added by creating **new classes** (extension), without modifying `PaymentService` (closed for modification).

---

## **Folder Structure**

```
PaymentOCP/
│
├── Main.java                # Entry point to run the program
├── PaymentService.java      # Uses the PaymentMethod interface
└── paymentmethods/          # All payment-related classes
      ├── PaymentMethod.java
      ├── CreditCardPayment.java
      ├── DebitCardPayment.java
      ├── UpiPayment.java
      ├── CodPayment.java
      └── NetBankingPayment.java
```

---

## **Key Classes**

### **1. PaymentMethod (Interface)**

```java
package PaymentOCP.paymentmethods;

public interface PaymentMethod {
    void pay(double amount);
}
```

### **2. PaymentService**

```java
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
```

---

## **How It Follows OCP?**

* **Extension:** Add a new payment method by creating a new class (e.g., `WalletPayment.java`) implementing `PaymentMethod`.
* **No Modification:** `PaymentService` or existing payment classes don’t need any changes.

---

## **How to Compile & Run**

1. **Open CMD** inside the parent directory (e.g., `c:/Users/lenovo/OneDrive/Desktop/java`).
2. Compile:

   ```bash
   javac PaymentOCP/paymentmethods/*.java PaymentOCP/*.java
   ```
3. Run:

   ```bash
   java PaymentOCP.Main
   ```

---

## **Sample Output**

```
Paid 500.0 using Credit Card
Paid 750.0 using Debit Card
Paid 250.0 using UPI
Order placed with Cash on Delivery
Paid 1200.0 using Net Banking
```

---

## **Benefits of OCP in This Project**

* Adding a new payment method (like **Wallet/PayPal**) doesn’t require editing `PaymentService`.
* Easy maintenance and reduced bugs.
* Clean and scalable code.

---
