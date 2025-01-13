/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bigoh;

import java.util.HashMap;

/**
 *
 * @author kanav
 */
public class Assign1 {
    public static void main(String[] args) {
        System.out.println(isNameValid("SaieTTouS"));
    }
    
    public static boolean isNameValid(String name){
    HashMap <Character,Integer>hm= new HashMap<>();//HashMap for character count
    
    for(int index=0; index<name.length();index++){
        if(name.charAt(index)=='a'|| name.charAt(index)=='i'||
                name.charAt(index)=='e'|| name.charAt(index)=='o'||name.charAt(index)=='u'){
    hm.put(name.charAt(index),hm.getOrDefault(name.charAt(index), 0)+1);
   
    if(hm.get(name.charAt(index))>1)return false;}
        
        
    
    int firstSindex=name.indexOf('S');
    int secondSindex=name.lastIndexOf('S');// taking first and last  s as there can be more s inbetween
    if(firstSindex==secondSindex )return true;
    else{
    String temp= name.substring(firstSindex, secondSindex);
    int count=0;
    for(char ch:temp.toCharArray()){
        if(ch=='T')count+=1;
    if(count>1)return false;
    }
    
    }
    }
        
    
    
    
    return true;
    
}}
