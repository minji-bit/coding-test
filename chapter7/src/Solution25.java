import java.util.Arrays;
import java.util.Comparator;

/**
 * 맞았당
 */
public class Solution25 {
    public int solution(int[] citations){
        int[] arr= Arrays.stream(citations)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] <= i+1) return arr[i];
        }
        return 0;
    }
    public static void main(String[] args){
        new Solution25().solution(new int[]{3,0,6,1,5});
    }
}
