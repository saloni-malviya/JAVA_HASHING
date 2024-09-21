/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//..............PROGRAM FOR HASHMAP SIZE, CLEAR, ISeMPTY FUNCTIONS................
package hashing_apna_college;
import java.util.*;
public class Hashmap_size {
    public static void main(String[]args)
    {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("Indore",100);
        hm.put("delhi",200);
        hm.put("Bombay",300);
        hm.put("Indore",400);
        System.out.println(hm);
        System.out.println(hm.size());
        
        hm.clear();
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
    }
}
