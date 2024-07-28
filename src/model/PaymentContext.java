package model;

import strategy.PaymentStrategy;

import java.math.BigDecimal;

public class PaymentContext {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(BigDecimal amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Ödeme stratejisi belirlenmedi!");
        }
        paymentStrategy.processPayment(amount);
    }
}
