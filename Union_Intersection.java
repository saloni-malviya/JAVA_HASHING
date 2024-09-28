/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashing_apna_college;
import java.util.*;
public class Union_Intersection {
    public static void main(String[]args)
    {
        HashSet<Integer> set=new HashSet<>();
        int arr1[]={2,3,47,5};
        int arr2[]={2,5,7,8,9};
        
        //union
        for(int i=0;i<arr1.length;i++)
        {
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++)
        {
            set.add(arr2[i]);
        }
        System.out.println("The union elements are:"+set);
        System.out.println("The union of array size is:"+set.size());
        
        //intersection
        set.clear();
        for(int i=0;i<arr1.length;i++)
        {
            set.add(arr1[i]);
        }
        int count=0;
        for(int i=0;i<arr2.length;i++)
        {
            if(set.contains(arr2[i]))
            {
                count++;
                System.out.print("The intersection elements are:"+arr2[i]);
                set.remove(arr2[i]);
                System.out.println();
            }
            
        }
      
        System.out.println("The intersection of array size is:"+count);
    }
}
