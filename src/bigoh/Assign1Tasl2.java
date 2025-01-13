
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bigoh;

import static java.lang.Math.pow;

/**
 *
 * @author kanav
 */
public class Assign1Tasl2 {
    public static void main(String[] args) {
        
        System.out.println(swapFirstLast(981));
    }
    static int swapFirstLast(int num){
    
    if(num<10)return num;//only noe dig
    
    if(num<100){ int temp=num%10;
    num/=10;
    temp*=10;
    temp+=num;
    
    return temp;}
    
    int last=num%10;
    int first=num;
    while(first>=10){
    first/=10;}
    
    int temp=num;
    int count=0;
    while(temp!=0){
    count+=1;
    temp/=10;}
    
    
    int ans=num;
    ans= ans-last;
    ans+=first;
    int mi=(int) (Math.pow(10, count-1)*first);
    int la=(int) (Math.pow(10,count-1)*last);
    
    ans-=mi;
    ans+=la;

return ans;    
    
    
    
    }
    
    
}
