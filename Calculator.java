package Hackathon;
import java.util.Scanner;

class Calculator{
       public static void main(String[] argv){
        
        System.out.println("Welcome to your Student-Budget Calculator!");

        Scanner keyIn = new Scanner(System.in);

        System.out.println("Enter your income:");
        double income = keyIn.nextDouble();

        System.out.println("Enter your rent:");
        
        double rent = keyIn.nextDouble();

        budget student = new budget(income, rent);

        student.setBills();

        boolean menu = true;

        while(menu){
            System.out.println("Please select one of the following options by entering a number 1-4:");
            System.out.println("1. Transportation\n2. Food \n3. Savings \n4. Personal \n");

       }

    }

}
