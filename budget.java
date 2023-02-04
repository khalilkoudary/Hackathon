package Hackathon;

import java.util.Scanner; 

public class budget {
    private double income;
    private double rent;
    private double groceries;
    private double savings;
    private double transportation;
    private double personal;
    private double bills;
    private double moneyToSpend = income-rent-bills;
    Scanner keyIn= new Scanner(System.in);

    public budget(double income, double rent) {
        this.income = income;
        this.rent = rent;
    }

    public void getTransportation(){
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
        
        System.out.println("Please indicate which bills you pay by typing the appropriate letters: /n phone = p /n hydro = h /n wifi = w /n insurance = i /n/n Type here: ");
        
        String billsInput = keyIn.nextLine();
        // Allocation of a maximum of 25% of total income to bills


        // phone = p
        if (billsInput.contains("p")) {
            System.out.println("Enter cost of phone bill: ");
            double phone = keyIn.nextDouble();
            this.bills += phone;
        }

        // hydro = h
        if (billsInput.contains("h")) {
            System.out.println("Enter cost of hydro: ");
            double hydro = keyIn.nextDouble();
            this.bills += hydro;
        }

        // wifi = w
        if (billsInput.contains("w")) {
            System.out.println("Enter cost of wifi: ");
            double wifi = keyIn.nextDouble();
            this.bills += wifi;
        }

        // insurance = i
        if (billsInput.contains("i")) {
            System.out.println("Enter cost of insurance: ");
            double insurance = keyIn.nextDouble();
            this.bills += insurance;
        }
    }

}