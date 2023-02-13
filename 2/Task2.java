
// Вывести все простые числа от 1 до 1000

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {

    public static void main(String[] args){

        boolean[] sieve = new boolean[1000];
        Arrays.fill(sieve, true);

        sieve[0] = false;
        sieve[1] = false;

        for (int i = 1; i < sieve.length; i++){
            if(sieve[i]){
                for (int j = 2; i * j < sieve.length; j++) {
                    sieve[i * j] = false;
                }
            }
        }

        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 1; i < sieve.length; i++) {
            if(sieve[i]){
                array.add(i);
            }
        }

        System.out.println(array);
    }
}
