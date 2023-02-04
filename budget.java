package Hackathon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 

public class budget {
    private double income;
    private double rent;
    private double groceries;
    private double savings;
    private double transportation;
    private double personal;
    private double bills;
    private double other;
    private double moneyToSpend = income-rent-bills;
    Scanner keyIn= new Scanner(System.in);

    public budget(double income, double rent) {
        this.income = income;
        this.rent = rent;
    }

    public void setTransportation(){
        boolean input = true;
        while(input){
        System.out.println("Enter 'C' if you own a car, or 'P' if you use public transit");
        String answer = keyIn.nextLine();
        if(answer.toLowerCase().equals("c")){
            this.transportation= (0.15*(this.moneyToSpend));
            System.out.println("It is recommended to allocate around 15% of your income towards transportation if you own a car.\nFor you, that comes to: " + transportation);
            input=false;
        }
        else if(answer.toLowerCase().equals("p")){
            System.out.println("It is recommended to allocate anywhere from 5% to 10% of your income towards transportation if you use public transit.\nFor you, that comes to: " + (0.05*(moneyToSpend))+"-"+(0.10*moneyToSpend));
            input = false;
        }
        else{
            System.out.println("Input cannot be recognized, please try again!");
        }
    }
}


    public void getGroceries() {
        this.groceries = ((this.income - this.rent) * 0.15);
        System.out.println("You should be spending " + this.groceries + "on groceries per month.");
    }


    public void setSavings() {
        double percentageOfIncome = 0.1;
        this.savings = this.income * percentageOfIncome;
    }


    public void setBills() {
        
        boolean[] bills = new boolean[5];
        for(int m=0; m<bills.length;m++){
            bills[m]=false;
        }

        String[] billNames = {"Phone", "Hydro", "WiFi", "Insurance", "Other"};

        for(int i=0; i<billNames.length;i++){
            System.out.println("Enter 1 if you pay for "+billNames[i] +" otherwise, enter 0:");
            int paid = keyIn.nextInt();

            if(paid==1){
                bills[i]=true;
            }
        }
        if (bills[0]==true){
            System.out.println("Enter cost of phone bill: ");
            double phone = keyIn.nextDouble();
            this.bills += phone;
        }
        if(bills[1]==true){
            System.out.println("Enter cost of hydro: ");
            double hydro = keyIn.nextDouble();
            this.bills += hydro;
        }
        if(bills[2]==true){
            System.out.println("Enter cost of wifi: ");
            double wifi = keyIn.nextDouble();
            this.bills += wifi;
        }
        if(bills[3]==true){
            System.out.println("Enter cost of insurance: ");
            double insurance = keyIn.nextDouble();
            this.bills += insurance;
        }
        if(bills[4]==true){
            System.out.println("Enter cost of other expenses: ");
            double other = keyIn.nextDouble();
            this.bills += other;
        }
    }
        
    }

