/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashing_apna_college;
import java.util.*;
public class Iteration_on_hashset {
    public static void main(String[]args)
    {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        
        Iterator it=set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
        
        //using loop
        System.out.println("using loop");
        for(Integer i:set)
        {
            System.out.println(i);
        }
    }
}
