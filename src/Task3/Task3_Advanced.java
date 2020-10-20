package Task3;

import java.util.Scanner;

/**
 *
 * @author andyc
 */
public class Task3_Advanced {

    public void Printing() throws Exception{
        //Local declarations
        Scanner scanner = new Scanner(System.in);
        
        //User input
        System.out.println("\nEnter your text: ");
        String temp = scanner.nextLine();
        
        //Result printing
        System.out.println("\nEncrypted: " + encrypt(temp));
        System.out.println("Decrypted: " + decrypt(encrypt(temp)));
    }
    
    //Encryption method
    public static String encrypt (String plainText) throws Exception{
        Lcg lcg = new Lcg (256, 11, 1, 0);
        byte[] bytes = plainText.getBytes("UTF-8");
        int len = bytes.length;
        byte [] xors = new byte [len];
        for(int ix =0; ix < len; ix +=1){
            xors[ix] = (byte) ((int) bytes [ix] ^ ((int) lcg.next()));
        }
        return new String (java.util.Base64.getEncoder().encode(xors), "UTF-8");
    }
    
    //Decryption method, literally reversed the sequence of encryption
    public static String decrypt (String base64EncodedValue) throws Exception{
        Lcg lcg = new Lcg (256, 11, 1, 0);
        byte[] bytes =  java.util.Base64.getDecoder().decode(base64EncodedValue); //First and foremost, decode the encrypted text
        int len = bytes.length;
        byte [] xors = new byte [len];
        for(int ix =0; ix < len; ix +=1){
            xors[ix] = (byte) ((int) bytes[ix] ^ ((int) lcg.next())); //Then, multiply with the same value as encryption
        }
        return new String (xors); //Direct print the array without any additional decryption
    }
}
