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
    Scanner scanObj = new Scanner(System.in);

    Scanner keyIn = new Scanner(System.in);

    public budget(double income, double rent) {
        this.income = income;
        this.rent = rent;
    }

    public void getTransportation() {
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

    public budget(double rent) {
        this.rent = rent;
    }

    public void getGroceries() {
        this.groceries = ((this.income - this.rent) * 0.15);
        System.out.println("You should be spending " + this.groceries + "on groceries per month.");
    }

    public budget(double income, double rent) {
        this.income = income;
        this.rent = rent;
    }

    <<<<<<<HEAD
    //
    =======

    public double getTransportation() {
<<<<<<< HEAD
=======
>>>>>>> 8ef57f8cd1acd1da032cbf50dcaac44a085eef1a
>>>>>>> 572ed4f6f8631848a15ca4a6680860ec7120757a
>>>>>>> 413773dfe22acdde3e6701ad19916ef325d5fe29


    /* 
    if u pay rent: 
    moneyForBudget = income - rent

    else:
    moneyForBudget = income 

    ----
    entertainment = moneyForBudget - getSavings()

    */

    public double getTransportation() {
        return 0;
    }

    public double setSavings() {
        double percentageOfIncome = 0.1;
        this.savings = this.income * percentageOfIncome;
    }

    public double setBills() {

        System.out.println(
                "Please indicate which bills you pay by typing the appropriate letters: /n phone = p /n hydro = h /n wifi = w /n insurance = i /n/n Type here: ");

        String billsInput = scanObj.nextLine();
        // Allocation of a maximum of 25% of total income to bills

        // phone = p
        if (billsInput.contains("p")) {

            this.bills += (this.income * 0.03);
        }

        // hydro = h
        if (billsInput.contains("h")) {
            this.bills += (this.income * 0.1);
        }

        // wifi = w
        if (billsInput.contains("w")) {
            Scanner wifiObj = new Scanner(System.in);
            System.out.println("Enter cost of wifi: ");
            double wifi = keyIn.nextDouble();
            this.bills += wifi;
        }

        // insurance = i
        if (billsInput.contains("i")) {
            this.bills += (this.income * 0.05);
        }

        return this.bills;
    }

}}
}
