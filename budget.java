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

    public double getTransportation() {

    }
}
