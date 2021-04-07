import java.util.Arrays;


public class PushZerostoEnd {


    public static void pushZeros(int[] arr){
        int j =0;
        int temp=0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=0) {

                if (i > j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }

        }
        System.out.println(Arrays.toString(arr));


    }

    public static void main(String[] args) {
        int[] arr = new int[]{19,0,0,0,0,8,0,5,9,2};

        pushZeros(arr);
    }
















    /*
      int temp = 0;

        for(int i=0, j=0; i<arr.length; i++){
            if(arr[i]!=0){
                if(i>j){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
     */
}
