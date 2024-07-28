import model.PaymentContext;
import strategy.BankTransferPaymentStrategy;
import strategy.CreditCardPaymentStrategy;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        PaymentContext paymentContext = new PaymentContext();

        // Kredi kartı ile ödeme yapılacak
        paymentContext.setPaymentStrategy(new CreditCardPaymentStrategy());
        paymentContext.processPayment(BigDecimal.valueOf(1000));

        // Banka havalesi ile ödeme yapılacak
        paymentContext.setPaymentStrategy(new BankTransferPaymentStrategy());
        paymentContext.processPayment(BigDecimal.valueOf(2000));

    }
}