import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution21 {


    private boolean isPrime(int n) {
        if(n <= 1 ) return false;
        for (int i = 2; i * i <= n ; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    private void getPrimes(int acc, int[] numbers,boolean[] isUsed,Set<Integer> primes) {

        if(isPrime(acc)) primes.add(acc);

        for (int i = 0; i < numbers.length ; i++) {
            if(isUsed[i]) continue;
            int nextAcc = 10*acc + numbers[i];
//            List<Integer> nextNumbers = new ArrayList<>(numbers);
//            nextNumbers.remove(i);
            isUsed[i] = true;
            getPrimes(nextAcc,numbers,isUsed,primes);
            isUsed[i] = false;
        }


    }

    public int solution(String nums) {
        Set<Integer> primes = new HashSet<>();

        //String List
        int[] numbers = nums.chars()
                .map(c->c-'0')
                .toArray();
//                .boxed()
//                .collect(Collectors.toList());
        getPrimes(0,numbers,new boolean[numbers.length],primes);
        return primes.size();
    }

    public static void main(String[] args){

        System.out.println(new Solution21().solution("011"));
    }
}
