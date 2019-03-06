package dz3;

import java.util.Scanner;

public class dz3 {


    public static void main(String[] args) {
        GuessTheNumber();
    }

    public static void GuessTheNumber() {
        Scanner in = new Scanner(System.in);

        int a, n = (int) (Math.random() * 10);
        System.out.println("Угадайте число от 0 до 9. У вас есть 3 попытки.");
        for (int i = 0; i < 3; i++) {
            System.out.println("Попытка " + (i + 1) + ": ");
            a = in.nextInt();
            if (a < n) System.out.println("Число больше!");
            if (a > n) System.out.println("Число меньше!");
            if (a == n) {
                System.out.println("Вы угадали!");
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                a = in.nextInt();
                if (a == 1) GuessTheNumber();
                else {
                    System.out.println("Спасибо за игру!");
                    break;
                }
            }
        }
    }
}