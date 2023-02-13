
// Вывести все простые числа от 1 до 1000

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    
    public List<Integer> getPrimesLessThan(int sieveSize){
        var sieve = new boolean[sieveSize];
        Arrays.fill(sieve, true);
        sieve[0] = false;
        sieve[1] = false;

        for (int i = 2; i < sieve.length; i++){
            if(sieve[i]){
                for (var j = 2; i * j < sieve.length; j++) {
                    sieve[i * j] = false;
                }
            }
        }

        var ss = new ArrayList<Integer>();
        for (var i = 2; i < sieve.length; i++) {
            if(sieve[i]){
                ss.add(i);
            }
        }

        return ss;

    }

    public static void main(String[] args) {
        var ss = new Task2().getPrimesLessThan(1000);
        System.out.println(ss);
    }
     
}
