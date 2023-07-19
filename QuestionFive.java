package Assignment1;

import java.util.Scanner;

public class QuestionFive {
    public void user(){
        int roll;
        String name;
        String a;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ples enter a name");
        name=sc.nextLine();
        System.out.println("ples enter a roll");
        roll=sc.nextInt();
        Scanner scan = new Scanner(System.in);
        System.out.println("ples enter a interest");
        a=scan.nextLine();
        System.out.println("Hey, my name is"+name+"and my roll number is "+roll+ "My feild of intrest are "+a);
    }
}
