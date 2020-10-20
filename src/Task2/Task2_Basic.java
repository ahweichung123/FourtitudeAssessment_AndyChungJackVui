package Task2;

import java.util.Scanner;

/**
 *
 * @author andyc
 */
public class Task2_Basic {
    
    //Global Variables
    private static long input;
    private static int sum = 0, digit;

    public int Basic_ChkDigit(int option, int adv){
        //Local Variables
        Scanner scanner = new Scanner (System.in);
        
        if(option == 1){
            //User's Input
            try{
                System.out.print("\nEnter number: ");
                input = scanner.nextLong();
            }
            catch (Exception e){
                System.out.println("Invalid Input\n");
                return -1;
            }
            //Access ChkDigit method with user input (for option '1')
            ChkDigit(Long.toString(input));
        }
        else{
            //Access ChkDigit method with predefined values (for option '2')
            ChkDigit(Integer.toString(adv));
            return sum;
        }

        //Returning result back to driver class (for option '1')
        System.out.println("The generated value is " + input + sum);
        return sum;
    }
    
    public static String ChkDigit(String temp){
        //Sum of each digit (Starting from most left)
        for(int i=0; i<temp.length(); i++){
            digit = (int) temp.charAt(i);
            sum+= Character.getNumericValue(digit);
            if(sum%2==0){
                sum = sum/2;
            }
            else{
                sum = (sum - 1)/2;
            }
        }
        return Integer.toString(sum);
    }
}
