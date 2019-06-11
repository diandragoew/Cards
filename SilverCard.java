package com.company;

public class SilverCard extends Card {

    public static final double MAX_DISCOUNT = 3.5;
    public static final int MIN_DISCOUNT = 2;

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
        if (theTurnoverForThePreviousMonth < 300) {
            return MIN_DISCOUNT;
        }else {
            return MAX_DISCOUNT;
        }
    }
}
