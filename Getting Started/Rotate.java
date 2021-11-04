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
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = sc.nextInt();
        int temp=n;
        while(n>0){
            n/=10;
            count++;
        }
        n=temp;
        int arr[] = new int[count];
        for(int i= count-1;i>-1;i--){
            arr[i]=n%10;
            n/=10;
        }
        System.out.println(count);
        for(int j=0;j<count;j++){
            System.out.print(arr[j]);
        }
        System.out.println();
        System.out.println("Enter number of times to rotate number:");
        int k = sc.nextInt();
        sc.close();

        if(Math.abs(k)>count){
            k%=count;
        }

        if(k>0){
            for(int i=count-k;i<count;i++){
                System.out.print(arr[i]);
            }
            for(int i=0;i<count-k;i++){
                System.out.print(arr[i]);
            }
        }
        else{
            k=count-Math.abs(k);
            for(int i=count-k;i<count;i++){
                System.out.print(arr[i]);
            }
            for(int i=0;i<count-k;i++){
                System.out.print(arr[i]);
            }
        }

       }
}
