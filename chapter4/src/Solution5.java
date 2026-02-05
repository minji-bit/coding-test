import java.util.Arrays;

/**
 * 맞았당!! 아래 해설 코드 참고하기
 */
public class Solution5 {

    /*
    public int[] solution(long n) {
        String str = Long.toString(n);
        String reversed = new StringBuilder(str).reverse().toString();
        char[] arr = reversed.toCharArray();
        int[] result = new int[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[i] - '0';
        }
        return result;
    }
     */
    public int[] solution(long n) {
        //1. 문자열로 만들기
        StringBuilder sb = new StringBuilder().append(n);
        //2. reverse
        sb.reverse();
        //3. charArray 로 만들기
        char[] arr = sb.toString().toCharArray();

        //4. char[] -> int[]
        int[] answer= new int[arr.length];
        for (int i = 0; i < answer.length ; i++) {
            answer[i] = arr[i] - '0';
        }

        return answer;
    }
    public static void main(String[] args){
        int[] res = new Solution5().solution(12345);
        System.out.println(Arrays.toString(res));
    }
}


