/* 
    1. You've to print all prime numbers between a range. 
    2. Take as input "low", the lower limit of range.
    3. Take as input "high", the higher limit of range.
    4. For the range print all the primes numbers between low and high (both included).
*/
import java.util.*;
import java.lang.Math;

public class PrimeTillN{
    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter starting number: ");
        int low = scan.nextInt();
        System.out.println("Enter ending number: ");
        int high = scan.nextInt();
        scan.close();
        for(int j=low;j<=high;j++){
            int count=0;
            for(int i=2;i<Math.abs(j);i++){
                if(j%i==0){
                    count ++;
                }
            }
            if(j==0||Math.abs(j)==1)
            continue;
            if(count==0){
                System.out.println(j);
            }
        }
    }
}