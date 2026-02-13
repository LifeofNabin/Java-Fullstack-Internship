import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nabin
 */
public class RandomGuessingGame {
    
    
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        
        
        Random random= new Random();
        int randomNum= random.nextInt(100)+1;
         int attempts =0;
         boolean isGuess= false;
         
        
        
        System.out.println("Welcome to the number guessing game  ");
        while(!isGuess){
            System.out.println(" Iam thinking the number between ");
            
            int userGuess=s.nextInt();
            
            
            
            if (userGuess>randomNum){
            System.out.println("number is high ");
            }
            else if (userGuess<randomNum) {
                System.out.println("number is low");
                    }
            else  { 
                    System.out.println("You guseessed corect one ");
                    
                    }
           
        }
    }
    
}
