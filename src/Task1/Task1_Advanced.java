package Task1;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author andyc
 */
public class Task1_Advanced {
    //Global Variables
    double repayment = 0.0, rate = 0.0, possibleRepayment, lowestRepayment;
    int principalBorrowed, numOfPayments;
    Scanner scanner = new Scanner(System.in);
    boolean status = true;
    
    public void Calc_Adv(){
        do{
            status = true; //to prevent do-while loop recurse infinitely
            try{
                //User inputs
                System.out.print("\nLoan Amount: RM ");
                principalBorrowed = abs(Integer.parseInt(scanner.nextLine()));
                System.out.print("Repayment Period (years): ");
                numOfPayments = abs(Integer.parseInt(scanner.nextLine())*12);
                System.out.print("Possible Repayment (per month): RM ");
                possibleRepayment = abs((Double.parseDouble(scanner.nextLine())));
            }
            catch (NumberFormatException e){
                System.out.println("\nInvalid Input!\n"); //When input is not numeric
                status = false;
            }
        }while(status==false);
        
        //Formula to calculate interest rate (per annum)
        //rate will keep increasing, until the formula meets the user's possible monthly repayment
        do{
            rate += 0.01;
            repayment = principalBorrowed * ((rate/1200)/(1 - Math.pow((1 + (rate/1200)), (-1) * numOfPayments)));
        }while(repayment<=possibleRepayment);
        
        //Result printing
        System.out.println("The interest rate would be " + (Math.round(rate*100.0)/100.0) + " per annum");
 
        //Calculate lowest monthly repayment using rate 0.01 (Alternative option for customer)
        lowestRepayment = principalBorrowed * ((0.01/1200)/(1 - Math.pow((1 + (0.01/1200)), (-1) * numOfPayments)));
        System.out.printf("\nLowest Possible Monthly Installment (rate: 0.01): RM %.2f\n", lowestRepayment);
    }
    
}
