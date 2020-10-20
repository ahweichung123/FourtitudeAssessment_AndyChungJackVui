package Task2;

import java.util.Scanner;

/**
 *
 * @author andyc
 */
public class Task2_Driver {

    //Global Variables
    private static int selection = 0;
    final static Task2_Basic basic = new Task2_Basic();
    final static Task2_Advanced adv = new Task2_Advanced();
    private static int chkDigit;
   
    //Main Method
    public static void main(String[] args){
        
        //Get user input
        switch (chkOption()){
            case 1 -> Access_Basic(1);        
            case 2 -> adv.Verify_ChkDigit();
        }
    }
    
    public static int chkOption(){
        Scanner scanner = new Scanner(System.in);
        
        try{
            System.out.println("(1) Insert number");
            System.out.println("(2) Verify check digit distribution");
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
    
    public static void Access_Basic(int option){
        //Accessing Task1_Basic
        do{
            chkDigit = basic.Basic_ChkDigit(1, -1);
        }while(chkDigit==-1);
        System.out.println("The check digit is " + chkDigit);
    }
}
