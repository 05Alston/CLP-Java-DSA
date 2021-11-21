/* 
I/P-> 5
O/P-> 
  *               ' '' ''*'
 ***              ' ''*''*'
*****
 ***
  *    
*/
import java.util.*;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n= scn.nextInt();
        scn.close();
        int i=1;
        while(i!=0){
          String str ="";
          for(int j=1;j<i;j++){
            str+=" ";
          }
          for(int j=n-i;j<i;j++){
            str+="*";
          }
          System.out.println(str);
          i=(i<=(n/2)+1)?i+1:i-1;
        }
        //TODO: Implement pattern
    }
}
