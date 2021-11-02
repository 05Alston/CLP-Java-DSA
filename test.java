import java.util.Scanner;
public class test {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter lower limit");
    int low = scn.nextInt();
    System.out.println("Enter higher limit");
    int high = scn.nextInt();
    boolean flag;
    for (int i=low; i <=high; i++) {
        flag=false;
        for (int j = 2; j*j< i; j++) {
            if (i % j == 0){
            flag=true;
	break;
            }
        }
if (!flag) {System.out.println(i+" is a prime no.");}
    }
    }
}
    