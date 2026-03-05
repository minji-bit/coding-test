/**
 * 2번째에 맞았당!!
 */
public class Solution12 {
    public int solution(String s){
        final String[] arr = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
        };

        for (int i = 0; i < arr.length; i++) {
            s = s.replaceAll(arr[i],String.valueOf(i));
        }
        return Integer.parseInt(s);
    }
    public static void main(String[] args){
        System.out.println(new Solution12().solution("one4seveneight"));
    }
}
