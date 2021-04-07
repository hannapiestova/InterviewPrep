public class BinarySearch {

    public static void sort(int[] arr) {
        boolean check = true;
        int temp = 0;
        while (check) {
            check=false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    check = true;
                }
            }
        }

    }

    public static void binarySearch(int[] arr, int key) {
        sort(arr);
        int index=0;
        int low = 0;
        int high=arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<key){
                low=mid+1;
            }else if(arr[mid]>key){
                high=mid-1;
            }else{
                index=mid;
                break;
            }
        }
        if(low>high){
            System.out.println("Element not found");
        }else {
            System.out.println("Element found position = " + index);
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1234,2,4,5,4,5};
        binarySearch(arr, 4);
    }
}
