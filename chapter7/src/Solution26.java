import java.util.Arrays;
import java.util.Comparator;

/**
 * gpt 가 짜준 다음 아래 코드가 젤 좋은거 같아!!!
 */
public class Solution26 {
    /*public String solution(String s){
        String[] arr = s.split("");
        Arrays.sort(arr,Comparator.reverseOrder());

        return Arrays.stream(arr).reduce("",String::concat);
    }*/

    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new StringBuilder(new String(arr))
                .reverse()
                .toString();
    }
    public static void main(String[] args){

        System.out.println(new Solution26().solution("Zbcdefg"));
    }

}
