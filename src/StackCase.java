import java.util.Stack;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nabin
 */
public class StackCase {
    public static void main(String[] args) {
        Stack<String> animals= new Stack<>();
        
        animals.push("cat");
        animals.push("dog");
        animals.push("Monkey");
        animals.push("rat");
        
        System.out.println(animals);
        System.out.println(animals.peek());
        System.out.println(animals.pop());
        System.out.println(animals);
    }
    
}
