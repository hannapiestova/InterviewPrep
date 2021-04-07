import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class primeNumbers {




    public static boolean checkifprime(int n){
        if(n<2) return false;
        for(int i = 2 ; i<=n; i++){
            if(i==n) return true;
            if(n%i==0) break;
        }
        return false;
    }

    public static void findPrimeNumbersBefore(int n){

        for(int i=2; i<n; i++){
            checkifprime(i);
        }


    }

    public static void main(String[] args) {
        System.out.println(LocalDate.now().plusDays(1).format(DateTimeFormatter.ofPattern("MMMM dd, yyyy")));

    }
}
