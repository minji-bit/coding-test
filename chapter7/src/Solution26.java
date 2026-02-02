import java.util.Arrays;
import java.util.Comparator;

/**
 * 내 코드가 더 좋아 보이는디
 * 해설 코드도 참고만 해보기
 */
public class Solution26 {
    public String solution(String s){
        String[] arr = s.split("");
        Arrays.sort(arr,Comparator.reverseOrder());

        return Arrays.stream(arr).reduce("",String::concat);
    }
    public static void main(String[] args){

        System.out.println(new Solution26().solution("Zbcdefg"));
    }

}
