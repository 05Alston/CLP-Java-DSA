/*
    Take a integer, decimal, string & character as inputs and print them out. 
*/
import java.util.Scanner;
public class TakingInputs {
    public static void main(String[] args) {
        // Write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Integer: ");
        int intNum = scan.nextInt();
        System.out.println("Enter Float: ");
        float floatNum = scan.nextFloat();
        scan.nextLine();
        System.out.println("Enter String: ");
        String str = scan.nextLine();
        System.out.println("Enter Character: ");
        char ch = scan.next().charAt(0);
        scan.close();
        System.out.println("Integer: "+ intNum);
        System.out.println("Float: "+ floatNum);
        System.out.println("String: "+ str);
        System.out.println("Character: "+ ch);
    }
}
