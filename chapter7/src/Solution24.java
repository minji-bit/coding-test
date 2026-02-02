import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 맞았당!!  set.stream().mapToInt(Integer::intValue).sorted().toArray() 이렇게 하면 코드가 더 짧아짐!
 */
public class Solution24 {
    public int[] solution(int[] numbers){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                set.add(numbers[i]+numbers[j]);
            }
        }

        int[] result = set.stream().mapToInt(Integer::intValue).toArray();

        Arrays.sort(result);
        return result;
    }
    public static void main(String[] args){
        new Solution24().solution(new int[]{5,0,2,7});
    }

}
