interface payment {
    void processPayment(double amount);
}

class CreditCardPayment implements payment {
    public void processPayment(double amount) {
        double discount = amount * 0.02; // 2% discount
        double finalAmount = amount - discount;
        System.out.println("Processing credit card payment of $" + finalAmount);
    }
}

class PaypalPayment implements payment {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

class CashPayment implements payment {
    public void processPayment(double amount) {
        double discount = amount * 0.05; // 5% discount
        double finalAmount = amount - discount;
        System.out.println("Processing cash payment of $" + finalAmount);
    }
}

public class Payment {
    public static void main(String[] args) {
        payment[] payments = {
            new CreditCardPayment(),
            new PaypalPayment(),
            new CashPayment()
        };

        double[] amounts = {250.75, 100.00, 50.0};

        for (int i = 0; i < payments.length; i++) {
            payments[i].processPayment(amounts[i]);
        }
    }
}
