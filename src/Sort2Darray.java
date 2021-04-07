public class Sort2Darray {

    //2 2 3 5
    //5 3 0 3
    //3 5 5 8

    public static void sort2D(int[][] arr){
        boolean check = true;
        int temp =0;
        while(check){
            check = false;
             int i =0;
                for(int j =0; j<arr[i].length; j++){
                    if(j==arr[i].length-1){
                        if(i==arr.length-1) break;
                        int nextRow=i+1;
                        if(arr[i][j]>arr[nextRow][0]){
                            temp=arr[i][j];
                            arr[i][j]=arr[nextRow][0];
                            arr[nextRow][0]=temp;
                            check=true;
                        }
                        i++;
                        j=-1;

                    }else if(arr[i][j]>arr[i][j+1]){
                        temp=arr[i][j];
                        arr[i][j]=arr[i][j+1];
                        arr[i][j+1]=temp;
                        check =true;
                    }
                }


        }
    }

    public static void main(String[] args) {
      int arr[][] = new int[][]{{1,4,6}, {2,5,45}, {3,5,22}};
        sort2D(arr);
        for(int i = 0; i<arr.length; i++){
            for(int j =0; j<arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }

    }
}
