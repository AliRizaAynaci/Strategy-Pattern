package strategy;

import java.math.BigDecimal;

public class BankTransferPaymentStrategy implements PaymentStrategy{
    @Override
    public void processPayment(BigDecimal amount) {
        System.out.println("Banka havalesi ile " + amount + " TL odeme yapildi.");
        // Gerçek banka havalesi işlemleri burada yapılacak
    }
}
