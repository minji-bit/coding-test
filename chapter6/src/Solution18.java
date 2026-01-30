import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 맞췄는데!!! 맨 마지막 return 에서 List 를 Arrray로 변환하는거 못했어
 * 다시풀어보면서 해설도 보는게 좋을거 같아
 */
public class Solution18 {
    public int[] solution(int[] answers){
        int[] one = new int[answers.length];
        int[] two = new int[answers.length];
        int[] three = new int[answers.length];

        for (int i = 0; i < answers.length; i++) {
            one[i] = new int[]{1,2,3,4,5}[i % 5];
            two[i] = new int[]{2,1,2,3,2,4,2,5}[i%8];
            three[i] = new int[]{3,3,1,1,2,2,4,4,5,5}[i%10];
        }

        int oneCnt = 0;
        int twoCnt = 0;
        int threeCnt = 0;
        int answer ;
        for (int i = 0; i < answers.length ; i++) {
            answer = answers[i];
            if(answer == one[i]) oneCnt++;
            if(answer == two[i]) twoCnt++;
            if(answer == three[i]) threeCnt++;
        }

        int max = oneCnt;
        if(max < twoCnt) max = twoCnt;
        if(max < threeCnt) max = threeCnt;

        List<Integer> result = new ArrayList<>();

        if(max == oneCnt) result.add(1);
        if(max == twoCnt) result.add(2);
        if(max == threeCnt) result.add(3);

        result.sort(Comparator.naturalOrder());

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args){
//        System.out.println(Arrays.toString(new Solution18().solution(new int[]{1,3,2,4,2})));
        new Solution18().solution(new int[]{1,3,2,4,2});
    }

}
