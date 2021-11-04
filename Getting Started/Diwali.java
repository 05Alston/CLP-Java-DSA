/*
    1. You are given n number of bulbs. They are all switched off. A weird fluctuation in current hits the circuit n times. In the 1st fluctuation all bulbs are toggled, in the 2nd fluctuation every 2nd bulb is toggled, in the 3rd fluctuation every 3rd bulb is toggled and so on. You've to find which bulbs will be switched on after n fluctuations.
    2. Take as input a number n, representing the number of bulbs.
    3. Print all the bulbs that will be on after the nth fluctuation in voltage.

    I/P-> 6 (n, an integer)
    O/P-> 1 (b1 b2 b3 b4 .. all bulbs that will be on after nth wave)
          4

*/
import java.util.*;
  
  public class Diwali{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of bulbs:");
    int n= sc.nextInt();
    sc.close();
    int arr[]= new int[n];
    for(int i=0;i<n;i++){
      arr[i]=1;
    }
    for(int i=2;i<=n;i++){
      for(int j=0;j<n;j+=i){
        if(j==0){j=-1;continue;}
        if(arr[j]==1)
        arr[j]=0;
        else
        arr[j]=1;
      }
    }
    for(int i=0;i<n;i++){
      System.out.print(arr[i]);
    }
   }
  }
