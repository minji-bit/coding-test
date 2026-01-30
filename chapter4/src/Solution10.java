import java.util.Arrays;

/**
 *  맞았당!!
 */
public class Solution10 {
    public int[] solution(String x){
        StringBuilder sb;
        int zeroCnt = 0;
        int transCnt = 0;
        // arr 순회하면서 0인지? ++갯수, 1만 append
        while(true){
            transCnt++;
            sb = new StringBuilder();
            char[] arr = x.toCharArray();
            for (char c : arr){
                if(c=='0'){
                    zeroCnt++;
                } else{
                    sb.append(1);
                }
            }
            String two = Integer.toString(sb.length(),2);
            x = two;
            if("1".equals(two)) break;
        }

        return new int[]{transCnt,zeroCnt};
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(new Solution10().solution("01110")));
    }

}
