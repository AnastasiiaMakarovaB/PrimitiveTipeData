public class Main2 {
    public static void main(String[] args) {
        int initialBalance = 100;   // начальный баланс
        int deposits = 2700;        // сумма пополнения

        int bonus; // бонусные рубли
        if (deposits > 1000) {
            bonus = deposits / 100;
        } else {
            bonus = 0;
        }

        int finalBalance = initialBalance + deposits + bonus;

        System.out.println("Бонусные рубли: " + bonus);
        System.out.println("Итоговый счёт: " + finalBalance);
    }
}

