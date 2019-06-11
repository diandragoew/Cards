package com.company;

public class GoldCard extends Card {
    public static final int valueWhenIncreasePercent = 100;
    private static final int MIN_DISCOUNT = 2;
    public static final int MAX_DISCOUNT = 10;

    @Override
    public void giveDetailsForPurchase(int theTurnoverForThePreviousMonth, int purchaseValue) {
        double discountRate = calculateDiscountRate(theTurnoverForThePreviousMonth);
        double discount = purchaseValue * (calculateDiscountRate(theTurnoverForThePreviousMonth) / 100);
        double totalSum = purchaseValue - discount;

        System.out.println("Purchase value: $" + purchaseValue);
        System.out.println("Discount rate: " + discountRate + "%");
        System.out.println("Discount: $" + discount);
        System.out.println("Total: $" + totalSum);

    }

    private double calculateDiscountRate(int theTurnoverForThePreviousMonth) {
        if (theTurnoverForThePreviousMonth / valueWhenIncreasePercent < 1) {
            return MIN_DISCOUNT;
        }
        if ((MIN_DISCOUNT + (theTurnoverForThePreviousMonth / valueWhenIncreasePercent)) <= MAX_DISCOUNT) {
            return MIN_DISCOUNT + (theTurnoverForThePreviousMonth / valueWhenIncreasePercent);
        } else {
            return MAX_DISCOUNT;
        }
    }
}

