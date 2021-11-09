/**
    1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
    2. Take as input n and k.
    3. Print the rotated number.
    4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
    n = 12340056
    k = 3
    r = 05612340

    I/P-> 562984
          2
    O/P-> 845629
*/

import java.util.*;

public class Rotate {
    public static void main(String[] args) {
        // write your code here  
        int count=0,mul=1,div=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = sc.nextInt();
        int temp=n;
        while(temp>0){
            temp/=10;
            count++;
        }
        temp=n;
        System.out.println("Enter number of times to rotate number:");
        int k = sc.nextInt();
        sc.close();
        k%=count;

        if(k<0){
            k+=count;
        }

        while(count>0){
            if(count>k){mul*=10;}
            else{div*=10;}
            count--;
        }
        int rot =n/div+ (n%div)*mul;
        System.out.println(rot);

       }
}
