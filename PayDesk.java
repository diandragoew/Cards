package com.company;

public class PayDesk {
    public static void purchaseWithCard(Card card, int theTurnoverForThePreviousMonth, int purchaseValue) {
        card.giveDetailsForPurchase(theTurnoverForThePreviousMonth, purchaseValue);
    }

    public static void main(String[] args) {
        purchaseWithCard(new GoldCard(), 1500, 1300);
    }
}
