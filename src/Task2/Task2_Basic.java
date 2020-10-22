package Task2;

import java.util.Scanner;

/**
 *
 * @author andyc
 */
public class Task2_Basic {
    
    //Global Variables
    public long input;

    public int Basic_ChkDigit(int option, int adv){
        int sum = 0;
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
            return sum = ChkDigit(Integer.toString(adv));
            //return sum;
        }

        //Returning result back to driver class (for option '1')
        System.out.println("The generated value is " + input + sum);
        return sum;
    }
    
    public int ChkDigit(String temp){
        int sum = 0;
        //Sum of each digit (Starting from most left)
        for(int i=0; i<temp.length(); i++){
            char digit = temp.charAt(i);
            sum+= Integer.parseInt(String.valueOf(digit));
            if(sum%2==0){
                sum = sum/2;
            }
            else{
                sum = (sum - 1)/2;
            }
        }
        return sum;
    }
    
    public void Access_Basic(int option){
        int chkDigit;
        Task2_Basic basic = new Task2_Basic();
        
        //Accessing Task1_Basic
        do{
            chkDigit = basic.Basic_ChkDigit(1, -1);
        }while(chkDigit==-1);
        System.out.println("The check digit is " + chkDigit);
    }
}
