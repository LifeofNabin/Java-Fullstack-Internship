/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nabin
 */
public class Patterns {
    public static void main(String[] args) {
        
        pattern1();
        System.out.println("next one");
        pattern2();
        
    }
    public static void pattern1(){
        
        for(int i=0;i<5;i++){
         for(int j=5;j>0;j--){
             System.out.print(" *");
         }
        System.out.println();
        }
        
    }
    public static void pattern2(){
        for (int i =0;i<5;i++){
            for (int j=0;j<5;j++){
              if(i==j){
                  System.out.print("*");
              
              }
            }
            
            System.out.println();
        
        }
        
    }
    
}
