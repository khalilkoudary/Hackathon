package Hackathon;
import java.util.Scanner;

public class budget {
    private double income;
    private double rent;
    private double groceries;
    private double savings;
    private double transportation;
    private double entertainment; 
    private double bills;

    Scanner keyIn= new Scanner(System.in);

    public budget(double income, double rent){
        this.income= income;
        this.rent = rent;
    }

    public void getTransportation(){
        boolean input = true;
        while(input){
        System.out.println("Enter 'C' if you own a car, or 'P' if you use public transit");
        String answer = keyIn.nextLine();
        if(answer.toLowerCase().equals("c")){
            this.transportation= (0.15*(income-rent));
            System.out.println("It is recommended to allocate around 15% of your income towards transportation if you own a car.\nFor you, that comes to: " + transportation);
            input=false;
        }
        else if(answer.toLowerCase().equals("p")){
            System.out.println("It is recommended to allocate anywhere from 5% to 10% of your income towards transportation if you use public transit.\nFor you, that comes to: " + (0.05*(income-rent))+"-"+(0.10*income));
            input = false;
        }
        else{
            System.out.println("Input cannot be recognized, please try again!");
        }
    }



    }
}
