package ru.netology;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CreditPaymentService {
    public long calculate(long creditSum, double interestRate, int period) {
        BigDecimal ps = BigDecimal.valueOf(interestRate).divide(BigDecimal.valueOf(1200L));
        int m = 12 * period;
        BigDecimal rez = BigDecimal.valueOf(1L);
        rez = rez.add(ps);
        rez = rez.pow(m);
        rez = (BigDecimal.valueOf(1L)).divide(rez, 10, RoundingMode.HALF_DOWN);
        rez = BigDecimal.valueOf(1L).subtract(rez);
        rez = BigDecimal.valueOf(creditSum).divide(rez, 10, RoundingMode.HALF_DOWN);
        rez = rez.multiply(ps);
        return rez.longValue();
    }

}
