import java.util.*;
public class JavaBasics {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Double n = sc.nextDouble();
if (n==2) {
System.out.println(" n is Prime ");
}
    boolean isPrime = true;
    for(Double i=2.0; i<=Math.sqrt(n); i++){
        if (n % i == 0) {
            isPrime = false;
        }
    }
if (isPrime == true) {
    System.out.println("n is prime");   
} else {
    System.out.println("n is not prime");
}
}
}
