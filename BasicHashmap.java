/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//.....PROGRAM FOR CREATE HASHMAP, AND PERFORM ALL OPERATIONS LIKE ADD, REMOVE,GET,CONTAINS.... 
package hashing_apna_college;
import java.util.*;
public class BasicHashmap {
    public static void main(String[]args)
    {
        HashMap<String,Integer> map=new HashMap<>();
        //add an element
        map.put("delhi",700);
        map.put("bombay",200);
        map.put("pune",400);
        map.put("indore",300);
        System.out.println(map);
        
        //remove an element
        System.out.println(map.remove("bombay"));
        System.out.println(map);
        
        //check contains element or not
        System.out.println(map.containsKey("pune"));
        
        //get an element
        int population=map.get("delhi");
        System.out.println(population);
        System.out.println(map.get("pune"));
    }
}
