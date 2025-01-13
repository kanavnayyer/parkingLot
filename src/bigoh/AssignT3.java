/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bigoh;

/**
 *
 * @author kanav
 */
public class AssignT3 {
    public static void main(String[] args) {
        System.out.println(tellPrime(99));
    }
    static boolean isPrime(int num){
        int temp=num;
        
        while(temp!=0){
        int temprem=temp%=10;
        if(temprem==2|| temprem==3 || temprem==5|| temprem==7)temp/=10;
        else{
        return false;}
        
        }
        return true;
    }
    
   
    static int tellPrime(int num){
    
//        if(isPrime(num))return num;
//        else{
//            num-=1;
//        isPrime(num);}
  
        while(!isPrime(num)){
        num-=1;}
    
    return num;
    }
}
