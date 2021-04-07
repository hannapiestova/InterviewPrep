public class DuplicatesinArray {



    public static int removeduplicatessizenewaaaray(int [] nums){

        int count=0;
        int result=0;

        for(int i=0; i<nums.length; i++){
            count=0;
            for(int j =0; j<nums.length; j++){
                if(nums[i]==nums[j]) count++;
            }

            if(count==1) result++;
        }

        return result;

    }


    public static void main(String[] args) {

        System.out.println(removeduplicatessizenewaaaray(new int[]{1,2,3,3,3,3,2}));
    }
}
