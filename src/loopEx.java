/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author nabin
 */
public class loopEx {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       
        System.out.println("Enter the number in your mind");
        int n =s.nextInt();
       
        for( int i=0;i<n;i++){
         for(int j=n;j>=0;j--){
            if(i+j<n){
                System.out.print("*" +" ");
            }

            }
          System.out.println();
//        10
    }
    }
}
