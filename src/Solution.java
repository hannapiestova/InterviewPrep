import java.util.Arrays;

public class Solution {

    static int solution(int[] a) {

        int temp = 0;
        boolean check = true;
        while (check) {
            check = false;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    check = true;
                }
            }
        }

        System.out.println(Arrays.toString(a));

        if(a[a.length-1]<0) {
            return 1;
        }
        for (int i = 0; i < a.length-1; i++) {


            if (a[i + 1] - a[i] <2) {
                continue;
            } else {
                return a[i]+1;

            }
        }

            return a[a.length - 1] + 1;

    }


    public static void main(String[] args) {
        int [] nums = new int[]{1,3,6,4,1,2};
        System.out.println(solution(nums));
    }
}
