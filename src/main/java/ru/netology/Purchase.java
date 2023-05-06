package ru.netology;

import java.util.HashMap;
//действия над покупками

public class Purchase {
    protected String title;
    protected int count;
    protected HashMap<String, Integer> price;
    //магические числа - new Purchase[4]
    //теперь product передается в параметрах конструктора и размер прайса может быть любой
    protected Basket basket;

    public Purchase(String title, int count, HashMap<String, Integer> price) {
        this.title = title;
        this.count = count;
        this.price = price;
        basket = new Basket(title, count, price);
    }

    public Purchase(HashMap<String, Integer> price) {
        this.price = price;
        basket = new Basket(price);
    }

    public void addPurchase(String title, int count) {
        basket.addPurchaseInBasket(title, count);
    }

    //действия над корзиной - принцип единственной ответственности, sum() вынести в отдельный класс
    //создан отдельный класс Basket, где все действия проводятся над корзиной, а не над покупками
    /**public long sum(Map<String, Integer> prices) {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for (int i = 0; i < purchases.length; i++) {
            Purchase purchase = purchases[i];
            if (purchase == null) continue;
            System.out.println("\t" + purchase.title + " " + purchase.count + " шт. в сумме " + (purchase.count * prices.get(purchase.title)) + " руб.");
            sum += purchase.count * prices.get(purchase.title);
        }
        return sum;
    }*/
}
