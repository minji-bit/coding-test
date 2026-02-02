import java.util.Arrays;

/**
 * 맞았는데 Array 복사 할때 Arrays.copyOfRange(array,from,to) 사용하는게 더 간단함!!
 */
public class Solution23 {
    public int[] solution(int[] array, int[][] commands){
        int[] newArray ;
        int[] result = new int[commands.length];
        for (int i = 0; i <commands.length ; i++) {
            newArray = new int[commands[i][1]-commands[i][0]+1];
            int start = commands[i][0]-1;
            for (int j = 0; j < newArray.length; j++) {
                newArray[j] = array[start++];
            }
            Arrays.sort(newArray);
            result[i] = newArray[commands[i][2]-1];
        }
        return result;
    }
    public static void main(String[] args){
        new Solution23().solution(new int[]{1,5,2,6,3,7,4},new int[][]{{2,5,3},{4,4,1},{1,7,3}});
    }
}
