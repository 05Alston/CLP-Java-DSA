/**
I/P-> 5
O/P-> 
*
**
***
****
*****     
 */

import java.util.*;

public class Pattern1{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    scn.close();
    String str="";
    for (int i = 1; i <= n; i++) {
      str+="*";
      System.out.println(str);
    }
  }
}
