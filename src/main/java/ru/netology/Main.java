package ru.netology;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService creditPaymentService = new CreditPaymentService();
        int[] period = {1, 2, 3};
        long[] expectedAmounts = {87_911L, 46_140L, 32_262L};
        for (int i = 0; i < 3; i++) {
            long actualAmount = creditPaymentService.calculate(1000000L, 9.99, period[i]);
            if (expectedAmounts[i] == actualAmount) {
                System.out.println("Ожидаемый ежемесячный платеж("
                        + expectedAmounts[i] + ") равен рассчитанному ежемесячному платежу(" + actualAmount + ")");
            } else {
                System.out.println("Ожидаемый ежемесячный платеж("
                        + expectedAmounts[i] + ") не равен рассчитанному ежемесячному платежу(" + actualAmount + ")");
            }
        }
    }
}