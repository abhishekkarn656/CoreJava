package Assignment1;

import java.util.Scanner;

public class QuestionNine {
    public void fact(){
        int a;
        int fact =1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        a= sc.nextInt();
        for (int i=1;i<=a;i++){
            fact=fact*i;
        }
        System.out.println("factorial is "+fact);
    }
}
