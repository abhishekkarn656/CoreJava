package Assignment1;

import java.util.Scanner;

public class QuestionSix {

    public  void discount(){
        int unit_cost=100;
        double discount =0.1;
        int minAmt=1000;
        int quantity;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Ples enter a quantity");
        quantity=sc.nextInt();
        double total_cost = quantity*unit_cost;
        if (total_cost>minAmt){
            double discountAmt=total_cost*discount;
            total_cost=total_cost-discountAmt;
        }
        System.out.println("total cost is "+total_cost);

    }
}
