/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashing_apna_college;
import java.util.*;
public class Count_Distnict_element {
    public static void main(String[]args)
    {
        HashSet<Integer> s=new HashSet<>();
        int arr[]={4,3,2,5,6,7,3,4,2,1};
        for(int i=0;i<arr.length;i++)
        {
            s.add(arr[i]);
        }
        
        System.out.println("The count distinct elements are:"+s.size());
    }
}
