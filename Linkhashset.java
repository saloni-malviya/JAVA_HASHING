/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashing_apna_college;
import java.util.*;
public class Linkhashset {
    public static void main(String[]args)
    {
        LinkedHashSet<String> lh=new LinkedHashSet<>();
        lh.add("Mango");
        lh.add("bnana");
        lh.add("watermalon");
        lh.add("papaya");
        lh.add("grapes");
        System.out.println(lh);
        
        HashSet<String> set=new HashSet<>();
        set.add("Mango");
        set.add("bnana");
        set.add("watermalon");
        set.add("papaya");
        set.add("grapes");
        System.out.println(set);
    }
}
