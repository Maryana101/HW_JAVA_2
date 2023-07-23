public class Main {
    public static void main(String[] args) {

        int cost; //стоимость билета
        int bonus_item = 20;  //стоимость одной бонусной мили
        int bonus; // кол-во начисленых бонусов

        cost = 16_200;
        bonus = cost / bonus_item;

        System.out.println("Начислело бонусных миль: " + bonus);
    }
}