/*
I/P-> 5 
O/P->
    *
   **
  ***
 ****
*****         
*/
import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // write ur code here
        int n= scn.nextInt();
        scn.close();
        for(int i=1;i<=n;i++){
            String str ="";
            for(int j=n-i;j>0;j--){
                str+=" ";
            }
            for(int j=1;j<=i;j++){
                str+="*";
            }
            System.out.println(str);
        }

    }
}
