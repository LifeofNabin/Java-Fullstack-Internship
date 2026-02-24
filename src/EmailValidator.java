/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nabin
 */
public class EmailValidator {
    public static void main(String[] args) {
        String mail="user@example.com";
        
//        check email is valid or not
        


    boolean hasAt=mail.contains("@");
    boolean hasDot=mail.contains(".");
    int atIndex=mail.indexOf("@");
    int dotIndex=mail.indexOf(".");
    
    boolean valid=hasAt && hasDot && atIndex>0 && dotIndex>atIndex+1 && dotIndex<mail.length()-1;
    
    System.out.println(mail+" is valid? "+valid);
    }
}
