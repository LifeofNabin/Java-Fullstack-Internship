import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nabin
 */
public class ExpeseAdder {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("please enter the expenses list");
        int n =sc.nextInt();
        double[] expenses= new double[n];
        System.out.println(expenses);
        
        
        for(int i=0;i<n;i++){
            System.out.println("Enter the expenses"+i+":");
            expenses[i]=sc.nextDouble();
        
        }
        double total=0;
        for (int i=0;i<n;i++){
            total+=expenses[i];
        
        }
        System.out.println("total expenses is :"+total);
        
        if (total>300)
            System.out.println("you need to do some saving ");
        else
            System.out.println("chill you can spend more ");
    }
    
}
