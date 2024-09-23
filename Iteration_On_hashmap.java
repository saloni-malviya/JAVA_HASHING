/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashing_apna_college;
import java.util.*;
public class Iteration_On_hashmap {
    public static void main(String[]args)
    {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Kukshi",300);
        map.put("Dhar",600);
        map.put("Indore",1000);
        map.put("Khargone",800);
        
        //Iteration
        Set<String> keys=map.keySet();
        System.out.println(keys);
        
        //Iteration on for each loop
        for(String key:keys)
        {
            System.out.println("key="+key+", value="+map.get(key));
        }
    }
}
