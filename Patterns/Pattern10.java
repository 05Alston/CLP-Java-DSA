/*
I/P-> 5
O/P->
   *
  * *
 *   *
  * *
   *
___*___
__*_*__
_*___*_
__*_*__
___*___
*/
import java.util.*;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    
         // write ur code here
        int n= scn.nextInt();
        scn.close();
        int i=1;
        boolean flag =true;
        while(i>=1){
            String str ="";
            for(int j=0;j<=n+2;j++){
                str=(j==n/2+2-i||j==n/2+i)?str+"*":str+" ";
            }
            System.out.println(str);
            if(i>n/2)
            flag=false;
            i=(flag)?i+1:i-1;
        }
     }
}
