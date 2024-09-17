/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//....PROGRAM FOR CREATE HASHSET, AND PERFORM ALL OPERATIONS LIKE ADD, REMOVE,CONTAINS,SIZE....
package hashing_apna_college;
import java.util.*;
public class Basic_Hashset {
    public static void main(String[]args)
    {
        HashSet<Integer> s=new HashSet<>();
        //add element in hashmap
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        System.out.println(s);
     
        
        //check contain element or not
        if(s.contains(2))
        {
            System.out.println("set contains 2");
        }
        
        
        
        //remove element in hashset
        s.remove(2);
        
        //size of hashmet
        System.out.println(s.size());
        
        //clear hashmap
        s.clear();
        
        System.out.println(s.size());
        System.out.println(s.isEmpty());
       
        
    }
}
