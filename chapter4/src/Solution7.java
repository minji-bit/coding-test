/**
 *  solution 해설 코드(7_1)가 String[] 를 따로 만들지 않아서 더 효율적인거 같다!
 */

public class Solution7 {
    public String solution(String str){
        String[] splited = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String strEle : splited){
            char[] arr = strEle.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                if(i % 2 ==0) result.append(Character.toUpperCase(arr[i]));
                else result.append(Character.toLowerCase(arr[i]));
            }
            result.append(" ");
        }
        return result.toString();
    }
    public static void main(String[] args){
        String res = new Solution7().solution("Have a nice day");
        System.out.println(res);
    }
}
