public class AdivideB {




    public static void divider(final int a, final int b){
        boolean minusAcheck = false, minusBcheck=false;
        int aCopy=a, bCopy=b;
        if(a<0&&b<0){
            aCopy=-a;
            bCopy=-b;
        }else if(a<0&&b>0){
            aCopy=-a;
            bCopy=b;
            minusAcheck=true;
        }else if(a>0&&b<0){
            aCopy=a;
            bCopy=-b;
            minusBcheck=true;
        }else if(b==0){
            System.out.println("Can not divide by 0");
        }
        int count=0;
        while(aCopy>=bCopy){
            aCopy-=bCopy;
            count++;
        }
        if(minusAcheck){
            count=-count;
            aCopy=-aCopy;
        }else if(minusBcheck){
            count=-count;
            aCopy=aCopy;
        }
        System.out.println("Result is " +count +" and remainder is "+aCopy);

    }


    public static void main(String[] args) {
        divider(10,-3);
    }
}
