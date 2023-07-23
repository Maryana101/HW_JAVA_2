public class Main {
    public static void main(String[] args) {

        int cost; //стоимость билета
        int bonusItem = 20;  //стоимость одной бонусной мили
        int bonus; // кол-во начисленных бонусов

        cost = 16_200;
        bonus = cost / bonusItem;

        System.out.println("Начислено бонусных миль: " + bonus);
    }
}
