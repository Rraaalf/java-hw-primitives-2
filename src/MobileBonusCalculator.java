public class MobileBonusCalculator {
    public static void main(String[] args) {

        int balance = 100;
        int replenishment = 1100;
        int bonus = 0;
        int resultBalance;

        if (replenishment > 1000) {
            bonus = replenishment / 100;
        }

        resultBalance = balance + replenishment + bonus;

        System.out.println("Клиент пополнил счет на " + replenishment + " рублей");
        System.out.println("Сумма бонуса: " + bonus + " рублей");
        System.out.println("Итоговая сумма на счете: " + resultBalance + " рублей");
    }
}
