import java.util.*;
public class JavaBasics {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    int Income = sc.nextInt();
    int tax;

    if (Income < 500000){
        System.out.println("NO Tax Applicable on your Income");
        tax = 0;
    }
    else if (Income > 500000 && Income < 1200000) {
            System.out.println("10% Tax");
            tax = (int) (Income * 0.1);
        }
    else {
        System.out.println("20% Tax");
         tax =(int) (Income * 0.2);
    }
    System.out.println("Your Payable Tax is " + tax);
}
}
