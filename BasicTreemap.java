/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashing_apna_college;
import java.util.*;
public class BasicTreemap {
    public static void main(String[]args)
    {
        TreeMap<String,Integer> tm=new TreeMap<>();
        tm.put("Agra",1);
        tm.put("Delhi",2);
        tm.put("Mandsour",3);
        tm.put("Bhopal",4);
        System.out.println("The Treemap values are");
        System.out.println(tm);
        
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        map.put("Agra",1);
        map.put("Delhi",2);
        map.put("Mandsour",3);
        map.put("Bhopal",4);
        System.out.println("The Hashmap values are");
        System.out.println(map);
        
    }
}
