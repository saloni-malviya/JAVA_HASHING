/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashing_apna_college;
import java.util.*;
public class Linkhashmap {
    public static void main(String[]args)
    {
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("Agra",1);
        lhm.put("Delhi",2);
        lhm.put("Mandsour",3);
        lhm.put("Bhopal",4);
        System.out.println("The LinkedHashmap values are");
        System.out.println(lhm);
        
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        map.put("Agra",1);
        map.put("Delhi",2);
        map.put("Mandsour",3);
        map.put("Bhopal",4);
        System.out.println("The Hashmap values are");
        System.out.println(map);
        
        
    }
}
