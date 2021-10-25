/*
    1. You've to display the digits of a number in reverse.
    2. Take as input "n", the number for which digits have to be display in reverse.
    3. Print the digits of the number line-wise, but in reverse order.
 */
import java.util.*;

public class Reverse {
    public static void main(String[] args) {
       // write your code here   
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a number: ");
        int n= scan.nextInt();
        while(n!=0){
            System.out.print(n%10);
            n/=10;
        }
        scan.close();
    }
}
