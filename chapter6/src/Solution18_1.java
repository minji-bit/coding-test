import java.util.stream.IntStream;

public class Solution18_1 {
    private static final int[][] RULES={
            {1,2,3,4,5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5},
    };
    private int getPicked(int person,int problem){
        int len = RULES[person].length;
        return RULES[person][problem % len];
    }


    public int[] solution(int[] answers){
        int[] corrects = new int[3];
        int max= 0;
        /*
        1. answers 돌면서 각 문제별로 사람별 맞췄는지 비교
        2. max 와 비교
         */
        for (int problem = 0; problem < answers.length; problem++) {
            int answer = answers[problem];
            for (int person = 0; person < 3 ; person++) {
                if(answer == getPicked(person,problem)){
                    if(max < ++corrects[person]){
                        max = corrects[person];
                    }
                }
            }
        }

        final int maxCorrects = max;


        return IntStream.range(0,3)
                .filter(i->maxCorrects==corrects[i])
                .map(i->i+1)
                .toArray();
    }
    public static void main(String[] args){
//        System.out.println(Arrays.toString(new Solution18().solution(new int[]{1,3,2,4,2})));
        new Solution18_1().solution(new int[]{1,3,2,4,2});
    }
}
