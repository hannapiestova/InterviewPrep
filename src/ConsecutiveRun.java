public class ConsecutiveRun {


    public static int longestRun(int [] nums){
        int result = 1, count=1, current=1;
        int resultDESC =1, countDESC=1, currentDESC=1;


            for(int i =0; i<nums.length-1; i++){

                if(nums[i+1]-nums[i]==1){
                    count++;

                }else{
                    if(count>current) current=count;
                    count=1;
                }

            }
        for(int i =0; i<nums.length-1; i++){

            if(nums[i]-nums[i+1]==1){
                countDESC++;

            }else{
                if(countDESC>currentDESC) currentDESC=countDESC;
                countDESC=1;
            }

        }
            resultDESC = currentDESC>countDESC?currentDESC:countDESC;
            result = current>count?current:count;

            if(result>=resultDESC) {
                return result;
            }else {
                return resultDESC;
            }

    }

    public static void main(String[] args) {
        int [] nums = new int[]{5, 4, 2, 1, 100,101,102};
        System.out.println(longestRun(nums));
        String s ="Sd";

    }
}
