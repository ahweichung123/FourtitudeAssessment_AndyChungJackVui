package Task1;

import java.util.Scanner;

/**
 *
 * @author andyc
 */
public class Task1_Driver {

    //Global Variables
    private static int selection = 0;
    final static Task1_Basic basic = new Task1_Basic();
    final static Task1_Advanced adv = new Task1_Advanced();
    
    public static void main(String[] args) {
        //Get user input
        switch (chkOption()){
            case 1 -> System.out.println("The monthly repayment is RM " + Math.round(basic.Calc_Basic()*100.0)/100.0);
            case 2 -> adv.Calc_Adv();
        }
    }
    
    public static int chkOption(){
        Scanner scanner = new Scanner(System.in);
        
        try{
            System.out.println("(1) Monthly Repayment");
            System.out.println("(2) Interest Rate can be offering");
            System.out.print("1 or 2? ");
            
            selection = Integer.parseInt(scanner.nextLine());
        
            switch(selection){
                case 1 -> selection = 1;
                case 2 -> selection = 2;
                default -> {
                    System.out.println("\n\nInvalid Input!");
                    chkOption();
                }
            }
        }
        catch (NumberFormatException e){
            System.out.println("\n\nInvalid Input!");
            chkOption();
        }
        
        return selection;
    }
}