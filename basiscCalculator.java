import java.util.*;
public class JavaBasics {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter A :");
    int A = sc.nextInt();
 System.out.println("enter B :");   
    int B = sc.nextInt();
    char operator = sc.next().charAt(0);

    switch (operator) {
        case '+' : System.out.println(A+B);
            break;
        case '-' : System.out.println(A-B);
            break;
        case '*' : System.out.println(A*B);
            break;
        case '/' : System.out.println(A/B);
            break;
        default : System.out.println("wrong Operator");
    }
}
}
