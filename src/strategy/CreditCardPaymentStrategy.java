package strategy;

import java.math.BigDecimal;

public class CreditCardPaymentStrategy implements PaymentStrategy{

    @Override
    public void processPayment(BigDecimal amount) {
        System.out.println("Kredi karti ile " + amount + " TL odeme yapildi.");
        // Gerçek kredi kartı işlemleri burada yapılacak
    }
}
