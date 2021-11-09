/*
    1. You are given a number following certain constraints.
    2. The key constraint is if the number is 5 digits long, it'll contain all the digits from 1 to 5 without missing any and without repeating any. e.g. 23415 is a 5 digit long number containing all digits from 1 to 5 without missing and repeating any digit from 1 to 5.Take a look at few other valid numbers - 624135, 81456273 etc.Here are a few invalid numbers - 139, 7421357 etc.
    3. The inverse of a number is defined as the number created by interchanging the face value and index of digits of number.e.g. for 426135 (reading from right to left, 5 is in place 1, 3 is in place 2, 1 is in place 3, 6 is in place 4, 2 is in place 5 and 4 is in place 6), the inverse will be 416253 (reading from right to left, 3 is in place 1, 5 is in place 2,2 is in place 3, 6 is in place 4, 1 is in place 5 and 4 is in place 6) More examples - inverse of 2134 is 1243 and inverse of 24153 is 24153    
    4. Take as input number "n", assume that the number will follow constraints.
    5. Print it's inverse.

    I/P-> 28346751 
    O/P-> 73425681
*/

import java.util.*;
import java.lang.Math;

public class Inverse{
  static boolean isValid(int n, int c){
    boolean isValid = false;
    for(int i=0;i<c;i++){
      for(int j=1; j<=c;j++){
        if(n%10==j)
        isValid=true;
      }
      n/=10;
      if(!isValid)
      return false;
    }
    return true;
  }
  public static void main(String[] args) {
    // write your code here  
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number:");
    int n = sc.nextInt();
    sc.close();
    int count=0;
    int temp =n;
    while(temp>0){
      temp/=10;
      count++;
    }
    if(!isValid(n,count)){
      System.out.println("Invalid input.");
      System.exit(0);
    }
    double inv=0;
    for(int i=1;i<=count;i++){
      inv = inv + (i)*Math.pow(10, n%10-1);
      n/=10;
    }
    System.out.println((int)inv);

  }
}