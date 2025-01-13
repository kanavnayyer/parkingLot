/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bigoh;

/**
 *
 * @author kanav
 */
public class AssignT4 {
    public static void main(String[] args) {
       String url="“https://ww.bigohtech.com/”"; 
        System.out.println(isValidURL(url));}
   

    static String isValidURL(String url){
       
        if(!url.contains("http"))return"No";
        if(!url.contains("www."))return"No";
        
        
if(url.contains(" "))return "No";
return"yes";
}
}
