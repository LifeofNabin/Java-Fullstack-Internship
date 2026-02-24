/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nabin
 */
public class ErrorHandling {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
            int ave=a/b;
        }
        catch(ArithmeticException e ){
            System.out.println("Error Handled");
        }      
    }
}
