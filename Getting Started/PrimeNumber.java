/*
    1. You've to check whether a given number is prime or not.
    2. Take a number "t" as input representing count of input numbers to be tested.
    3. Take a number "n" as input "t" number of times.
    4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.
*/
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // write ur code here
        System.out.println("Enter number of times you want program to run: ");
        int t = scn.nextInt();
        while(t!=0){
            int count=0;
            System.out.println("Enter a number: ");
            int number = scn.nextInt();
            if(number<=0){System.out.println("Give a number greater than 1.");continue;}
            for(int i=2;i*i<number;i++){
                if(number%i==0){
                    count ++;
                }
            }
            if(count==0){
                System.out.println("Prime.");
            }
            else
            System.out.println("Not prime");
            t--;
        }
        scn.close();
     }
}
