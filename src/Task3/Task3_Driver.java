package Task3;

import java.util.Scanner;

/**
 *
 * @author andyc
 */
public class Task3_Driver {

    //Global Variables
    private static int selection = 0;
    final static Task3_Basic basic = new Task3_Basic();
    final static Task3_Advanced adv = new Task3_Advanced();
    
    public static void main(String[] args) throws Exception{
        //Get user input
        switch (chkOption()){
            case 1 -> basic.Test_Basic();
            case 2 -> adv.Printing();
        }
    }
    
    public static int chkOption(){
        Scanner scanner = new Scanner(System.in);
        
        try{
            System.out.println("(1) Verify prime numbers");
            System.out.println("(2) Decryption");
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
