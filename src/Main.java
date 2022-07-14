public class Main {

    public static void main(String[] args) {

        int score = 200; // начальный счет
        int cash = 1300; // сумма пополнения счета
        int bonusScale = 100; // бонусная ставка
        int bonus;

        if (cash >= 1000) {
            bonus = cash / bonusScale;

        } else {
            bonus = 0;
        }

        int balance = score + cash + bonus;
        System.out.println(balance + "руб. Ваш бонус: " + bonus + " руб.");
    }
}
