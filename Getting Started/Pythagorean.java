/**
    1. You are required to check if a given set of numbers is a valid pythagorean triplet.
    2. Take as input three numbers a, b and c.
    3. Print true if they can form a pythagorean triplet and false otherwise.

    I/P-> 5 3 4
    O/P-> true
 */
import java.util.*;
  
  public class Pythagorean{
  public static void main(String[] args) {
    // write your code here  
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter three numbers: ");
    float a = scn.nextFloat();
    float b = scn.nextFloat();
    float c= scn.nextFloat();
    scn.close();
    if(a>b&&a>c){
      c=a+c;
      a=c-a;
      c=c-a;
    } 
    else if(b>c){
      c=b+c;
      b=c-b;
      c=c-b;
    }

    if(a*a+b*b==c*c)
    System.out.println("The numbers "+a+", "+b+" and "+c+" are pythagorean triplets.");
    else
    System.out.println("The numbers "+a+", "+b+" and "+c+" are not pythagorean triplets.");
  }
}