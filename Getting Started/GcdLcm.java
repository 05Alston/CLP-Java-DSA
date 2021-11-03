/*
    1. You are required to print the Greatest Common Divisor (GCD) of two numbers.
    2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers.
    3. Take input "num1" and "num2" as the two numbers.
    4. Print their GCD and LCM.

    I/P-> 36
          24
    O/P-> 12
          72
*/

import java.util.*;
    
public class GcdLcm{
    
      public static void main(String[] args) {
            // write your code here  
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two numbers:");
            int num1= sc.nextInt();
            int num2= sc.nextInt();
            sc.close();
            int lcm=num2;
            int gcd=num1;
            if(num1>num2){
                  lcm=num1;
                  gcd=num2;
            }
            for(; gcd>0; gcd--){
                  if(num1%gcd==0 && num2%gcd==0){
                        System.out.println(gcd);
                        break;
                  }
            }
            for(;lcm<=num1*num2; lcm++){
                  if(lcm%num1==0 && lcm%num2==0){
                  System.out.println(lcm);
                  break;
                  }
            }
      }
}
