
// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
// 2. n! (произведение чисел от 1 до n)

import java.util.Scanner;;

public class Task1 {

    static void operation(){
        System.out.println("Введите действие:\n1) сумма чисел от 1 до n\n2) произведение чисел от 1 до n");
    }

    static void sum(int multiplication) {

        int n = 1;

        for (int i = 1; i <= multiplication; i++) {
            System.out.println((n*(n+1))/2);
            n++;
        }
    }

    static void factorial(int factorialNumber){
        if(factorialNumber >= 0) {
            if(factorialNumber == 0) System.out.println(1);
            else{
                int count = 1;
                for (int i = 1; i <= factorialNumber; i++) {
                    count = i * count;
                }
                System.out.print(count);
            }
        }
        else System.out.println("Факториал не может быть отрицательным");
    }

    public static void main(String[] args) {

        System.out.println("Введите число");
        Scanner scanner1 = new Scanner(System.in);
        int sc = scanner1.nextInt();

        operation();

        Scanner scanner2 = new Scanner(System.in);
        int action = scanner2.nextInt();

        if (action > 0 && action < 3 )
        {
           if(action == 1) sum(sc);
           else factorial(sc);
        }
        else System.out.println("Такой операции нет!");


    }

}