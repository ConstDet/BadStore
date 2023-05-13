package ru.netology;
//действия над покупками

public class Purchase {
    protected String title;
    protected int count;
    //магические числа - new Purchase[4]
    //теперь product передается в параметрах конструктора и размер прайса может быть любой

    public Purchase(String title, int count) {
        this.title = title;
        this.count = count;
    }

    //действия над корзиной - принцип единственной ответственности, sum() вынести в отдельный класс
    //создан отдельный класс Basket, где все действия проводятся над корзиной, а не над покупками
}
