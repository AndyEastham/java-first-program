package com.h2;

import java.time.LocalDate;
import java.time.YearMonth;

public class SavingsCalculator {
    private float[] credits;
    private float[] debits;

    public SavingsCalculator(float[] credits, float[] debits) {
        this.credits = credits;
        this.debits = debits;
    }

    private float sumOfCredits() {
        float sum = 0.0f;

        for (float currentVel : credits
        ) {
            sum = currentVel + sum;
        }
        return sum;
    }

    private float sumOfDebits() {
        float sum = 0.0f;

        for (float currentVal : debits) {
            sum = currentVal + sum;
        }
        return sum;
    }

    static private int remainingDaysInMonth(LocalDate date) {
        YearMonth yearMonth = YearMonth.of(int year, int month);
        return -1;
    }

}
