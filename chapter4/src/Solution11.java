/**
 *  맞았당!!
 */
public class Solution11 {
    public boolean solution(String s){
        String str = s.toLowerCase().replace('p',' ').replace('y',' ');
        int cnt=0;
        for(char ch : str.toCharArray()){
            if(ch==' ') cnt++;
        }
        return cnt % 2 == 0 ;
    }
    public static void main(String[] args){
        System.out.println(new Solution11().solution("pPoooyY"));
    }
}
