package Assignment1;

import java.util.Scanner;

public class QuestionEight {
    public  void gcd(){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("plese enter a first number");
        a= sc.nextInt();
        Scanner scan= new Scanner(System.in);
        System.out.println("plese enter a second number");
        b= scan.nextInt();
        int gcd = calculate(a,b);
        System.out.println("GCD is "+ gcd);
    }
    public  int calculate(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
    return a;
    }
}
