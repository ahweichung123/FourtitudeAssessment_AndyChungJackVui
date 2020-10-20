package Task1;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author andyc
 */
public class Task1_Basic {
    //Global Variables
    double repayment, rate;
    int principalBorrowed, numOfPayments;
    Scanner scanner = new Scanner(System.in);
    boolean status = true;
    
    public double Calc_Basic(){
        do{
            status = true; //to prevent do-while loop recurse infinitely
            try{
                //User inputs
                System.out.print("\nLoan Amount: RM ");
                principalBorrowed = abs(Integer.parseInt(scanner.nextLine()));
                System.out.print("Repayment Period (years): ");
                numOfPayments = abs(Integer.parseInt(scanner.nextLine())*12);
                System.out.print("Interest Rate (% per annum): ");
                rate = abs((Double.parseDouble(scanner.nextLine())/100)/12);
            }
            catch (NumberFormatException e){
                System.out.println("\nInvalid Input!\n"); //When input is not numeric
                status = false;
            }
        }while(status==false);
        
        //Formula to calculate monthly repayment
        repayment = principalBorrowed * (rate/(1 - Math.pow((1 + rate), (-1) * numOfPayments)));
        return repayment;
    }             
}
