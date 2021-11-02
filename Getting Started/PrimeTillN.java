/* 
    1. You've to print all prime numbers between a range. 
    2. Take as input "low", the lower limit of range.
    3. Take as input "high", the higher limit of range.
    4. For the range print all the primes numbers between low and high (both included).
*/
import java.util.*;

public class PrimeTillN{
    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter starting number: ");
        int low = scan.nextInt();
        if(low<=0){
            System.out.println("Enter a number greater than 1.");
        }
        else{
            System.out.println("Enter ending number: ");
            int high = scan.nextInt();
            scan.close();
            for(int j=low;j<=high;j++){
                int count=0;
                for(int i=2;i*i<j;i++){
                    if(j%i==0){
                        count ++;
                    }
                }
                if(count==0){
                    System.out.println(j);
                }
            }
        }
    }
}