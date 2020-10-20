package Task3;

import java.util.Scanner;

/**
 *
 * @author andyc
 */
public class Task3_Basic {
    //Global Variables
    Scanner scanner = new Scanner(System.in);
    Lcg Lcg = new Lcg(65536, 137, 1, 0);
    long temp;
    
    public void Test_Basic(){
        int count = 0;
        
        System.out.println("\nPrime Numbers: ");
        
        //Loop to get numbers from Lcg class
        for (int i=0; i<1200; i++){
            temp = Lcg.next();
            
            //Only printing prime numbers
            if(Check_Prime(temp) == true){
                count++;
                if(count<=10 || count == 100){
                    System.out.println(count + ". " + temp);
                }
            }
        }
    }
    
    //Method to check if a number is prime
    public boolean Check_Prime (long num){
        boolean flag = false;
        
        //Prime number cannot be 0 or 1
        if(num == 0 || num == 1){
            flag = true;
        }
        
        //Prime number can only be divided by itself
        for(int i = 2; i <= num/2; i++){
            if(num % i == 0){
                flag = true;
                break;
            }
        }

        return !flag;
    }
}
