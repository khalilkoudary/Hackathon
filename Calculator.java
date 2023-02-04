package Hackathon;
import java.util.Scanner;

class Calculator{
    public static void main(String[] argv){
        Scanner keyIn = new Scanner(System.in);

        System.out.println("Enter your income:");
        double income = keyIn.nextDouble();

        System.out.println("Enter your rent:");
        double rent = keyIn.nextDouble();

        budget student = new budget(income, rent);

        student.getTransportation();

    }

}
