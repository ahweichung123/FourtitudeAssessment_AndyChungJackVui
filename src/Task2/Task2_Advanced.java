package Task2;

/**
 *
 * @author andyc
 */
public class Task2_Advanced {
    public void Verify_ChkDigit(){
        //Local Variables
        Task2_Basic basic = new Task2_Basic();
        int arr [] = new int[10], temp, max=0, count=0;
        
        //For loop to check each number's check digit
        for(int j = 1; j<=1000000; j++){
            temp = basic.Basic_ChkDigit(2, j);
            arr[temp] +=1; //Tally respective number if check digit matched
        }
        
        //For loop to print out each check digits (0-9)
        //Also to get the check digit with most occurances
        for(int k = 0; k<10; k++){
            if(arr[k] > max){
                max = arr[k];
                count++;
            }
            System.out.println(k + " --> " + arr[k]);
        }
        
        //Result printing
        System.out.println((count-1) + " occurs most frequently");
    }
}
