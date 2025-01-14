/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 *
 * @author kanav
 */
public class Task1 {
    public static void main(String[] args) {
        int []values = {2, 4, 6, 2, 8, 10, 4, 12, 14, 6};
       int ans[]=removeDuplicates(values);
        for (int an : ans) {
            System.out.print(an+" ");
        }
    }
    
    
    


    static private int[]  removeDuplicates(int[] values) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   HashSet<Integer> hs= new HashSet<>();
   for(int i:values)hs.add(i);
 
        Integer ans[]= new Integer[hs.size()];
        ans=hs.toArray(ans);
  
     int tempArray[]= new int [hs.size()];
     
     for(int index =0;index<tempArray.length;index++){
     tempArray[index]=ans[index].intValue();
     }
      return tempArray;
    }
}
