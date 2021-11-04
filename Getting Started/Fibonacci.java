/*
    1. You've to print first n fibonacci numbers.
    2. Take as input "n", the count of fibonacci numbers to print.
    3. Print first n fibonacci numbers.
*/
import java.util.*;
  
public class Fibonacci{
  
    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number= scan.nextInt();
        if(number<0){
            System.out.println("Enter a valid number..");
            System.exit(0);
        }
        
        int num1 =0, num2=1;
        System.out.print("Fibonacci series for "+number+" terms is: "+num1 +" "+num2);

        while(number!=2){
            int sum = num1 + num2;
            System.out.print(" "+sum);
            num1=num2;
            num2=sum;
            number--;
        }
        scan.close();
    }
}
