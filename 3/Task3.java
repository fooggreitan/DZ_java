// Реализовать простой калькулятор Введите число
// 2 Введите операцию 1 + 2 - 3 * 4 / Введите число 2 + 2 = 4

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        System.out.println("Введите первое число:");
        Scanner one = new Scanner(System.in);
        int onenumber = one.nextInt();

        System.out.println("Введите второе число:");
        Scanner two = new Scanner(System.in);
        int twonumber = two.nextInt();

        System.out.println("Выберите операцию\n1.*\n2.-\n3./\n4.%\n5.+");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        switch(c) {
            case 1:
                System.out.println("Результат вычисления - > " + (onenumber * twonumber));
                break;
            case 2:
                System.out.println("Результат вычисления - > " + (onenumber - twonumber));
                break;
            case 3:
                System.out.println("Результат вычисления - > " + (onenumber / twonumber));
                break;
            case 4:
                System.out.println("Результат вычисления - > " + (onenumber % twonumber));
                break;
            case 5:
                System.out.println("Результат вычисления - > " + (onenumber + twonumber));
                break;
            default:
                System.out.println("Такой операции нет в списке");
                break;
        }
    }
}