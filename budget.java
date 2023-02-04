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

    public budget(double rent) {
        this.rent = rent;
    }

    public void getGroceries() {
        this.groceries = ((this.income - this.rent) * 0.15);
        System.out.println("You should be spending " + this.groceries + "on groceries per month.");

    public budget(double income, double rent) {
        this.income  = income;
        this.rent = rent;
    }

    // 


    /* 
    if u pay rent: 
    moneyForBudget = income - rent

    else:
    moneyForBudget = income 

    ----
    entertainment = moneyForBudget - getSavings()

    */ 



    public double getTransportation(){
        return 0;
    }
    


    public double setSavings() {
        double percentageOfIncome = 0.1;
        this.savings = this.income * percentageOfIncome;
        return this.savings;
    }

    public double setBills() {
        
        System.out.println("Please indicate which bills you pay by typing the appropriate letters: /n phone = p /n hydro = h /n wifi = w /n insurance = i /n/n Type here: ");
        
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
            double wifi = scanObj.nextDouble();
            this.bills += wifi;
        }

        // insurance = i
        if (billsInput.contains("i")) {
            this.bills += (this.income * 0.05);
        }

        return this.bills;
    }





}
