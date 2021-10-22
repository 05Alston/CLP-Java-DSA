/*
    Print the following pattern in Java:
    *****
       *
      *
     *
    *****
*/

public class PrintZ {
    public static void main(String[] args) {
        int n = 12;
        // Write your code here
        for (int i = n; i > 0; i--) {
            if (i == n || i == 1) {
                for (int j = n; j > 0; j--) {
                    System.out.print('*');
                }
                System.out.println();
            } 
            else {
                for (int j = i; j > 0; j--) {
                    System.out.print(' ');
                    if (j == 2) {
                        System.out.print('*');
                    }
                }
                System.out.println();
            }
        }
    }
}
