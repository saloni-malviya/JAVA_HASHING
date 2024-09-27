/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//.......Program for Majority element O(n)
//...Given an integer array of size n, find all element that appear more than n/3 times.

package hashing_apna_college;
import java.util.*;
public class Majority_element {
    public static void main(String[]args)
    {
        int arr[]={1,3,2,5,1,3,5,1,1,5,5};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        
        Set<Integer>keys=map.keySet();
        for(Integer i:keys)
        {
            if(map.get(i)>arr.length/3)
            {
                System.out.println("The majority element that appears n/3 times is:"+i);
            }
         
        }
    }
}
