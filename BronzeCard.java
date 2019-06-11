package com.company;

public class BronzeCard extends Card {


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
        if (theTurnoverForThePreviousMonth < 100) {
            return 0;
        }
        if (theTurnoverForThePreviousMonth <= 300) {
            return 1;
        } else {
            return 2.5;
        }
    }
}
