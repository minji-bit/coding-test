/**
 *  solution 해설 코드가 String[] 를 따로 만들지 않아서 더 효율적인거 같다!
 */

public class Solution7_1 {
    public String solution(String str){
        StringBuilder builder = new StringBuilder();
        boolean toUpper = true;
        //공백인가? 공백이면 다음 문자가 무조건 대문자로 바뀌어야!
        for(char ch : str.toCharArray()){
            if(!Character.isAlphabetic(ch)) {
                builder.append(ch);
                toUpper = true;
            }
            else {
                if(toUpper) {
                    builder.append(Character.toUpperCase(ch));
                }
                else{
                    builder.append(Character.toLowerCase(ch));
                }
                toUpper = !toUpper;
            }
        }
        return builder.toString();
    }
    public static void main(String[] args){
        String res = new Solution7_1().solution("Have a nice day");
        System.out.println(res);
    }
}
