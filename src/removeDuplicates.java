import java.util.StringTokenizer;

public class removeDuplicates {


    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 4, 4, 1};
        System.out.println(removeExtraspaces("   Hello       my    dear      friend        "));


    }



    public static void indexLastDistinct(int [] nums ){
        boolean check=true;
        System.out.println(nums.length-1);
        for(int i=nums.length-2 ; i>=0; i--) {
            check = true;
            for(int j=nums.length-1; j>i; j--){
                if(nums[i]==nums[j]){
                    check=false;
                    break;
                }
            }
            if(check) System.out.println(i);
        }


    }
    public static void indexFisrstDistinct(int [] nums ){
        boolean check=true;
        System.out.println(0);
        for(int i=1; i<nums.length; i++) {
            check = true;
            for(int j=0; j<i; j++){
                if(nums[i]==nums[j]){
                    check=false;
                    break;
                }
            }
            if(check) System.out.println(i);
        }


    }


    public static void removeDuplicates(int [] nums){
        int length = nums.length;
        for(int i=0; i<length; i++){
            for(int j=i+1; j<length; j++){
                if(nums[i]==nums[j]){
                    nums[j]=nums[length-1];
                    length--;
                    j--;
                }
            }
        }

        for(int i =0; i<length; i++){
            System.out.println(nums[i]);
        }

    }


    public static int indexofelementwitheqsumonsides(int [] nums ){
        int lsum=0;
        int rsum=0;
        for(int i=1 ; i<nums.length-1; i++){
            lsum=0;
            rsum=0;
            for(int l =0; l<i; l++){
                lsum+=nums[l];
            }
            for(int r=i+1; r<nums.length; r++){
                rsum+=nums[r];
            }
            if(rsum==lsum) return i;
        }

        return -1;

    }

    public static String removeExtraspaces(String str){
        StringTokenizer t = new StringTokenizer(str);
        String res="";
        while(t.hasMoreTokens()){
            res+=t.nextToken()+" ";
        }
        return res.trim();
    }
}
