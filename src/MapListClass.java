
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Vector;
        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nabin
 */
public class MapListClass {
    public static void main(String[] args) {
        Map<Integer,String> mp= new HashMap<>();
        
        
        mp.put(101,"Cambridge");
        System.out.println(mp);
        
        
        ArrayList <String> al=new ArrayList<>();
        al.add("Stall1");
        al.add("Stall2");
        al.add("Stall3");
        
        System.out.println("These are the stall:\n"+al);
        
//        chefs continuously stores the dishes list
        Vector<String> dish= new Vector<>();
        dish.add("Momo");
        
        
    }
    
    
}
