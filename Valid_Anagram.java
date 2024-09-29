/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashing_apna_college;
import java.util.*;
public class Valid_Anagram {
    
        public static boolean anagram(String s, String t)
        {
            HashMap<Character,Integer> map=new HashMap<>();
            for(int i=0;i<s.length();i++)
            {
                char c=s.charAt(i);
                map.put(c,map.getOrDefault(c, 0)+1);
            }
            
            for(int i=0;i<t.length();i++)
            {
                char ch=s.charAt(i);
                if(map.get(ch)!=null)
                {
                    if(map.get(ch)==1)
                    {
                        map.remove(ch);
                    }
                    else
                    {
                        map.put(ch,map.get(ch)-1);
                    }
                }
                else
                {
                    return false;
                   
                          
                }
            }
             return map.isEmpty();
        }
    
        public static void main(String[]args)
        {
            String s="racre";
            String u="race";
            String t="care";
            System.out.println(anagram(s,t));
            System.out.println(anagram(u,t));
        }
}
