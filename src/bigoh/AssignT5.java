/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bigoh;

/**
 *
 * @author kanav
 */
public class AssignT5 {
    public static void main(String[] args) {
        //Write a program to find the smallest number
        //divisible by all the numbers between 1 to n
        int num=5;
        int ans=1;
       for(int i=2;i<=num;i++){
       
       ans=findLcm(ans,i);
       }
        System.out.println(ans);
    }
     static int findGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGcd(b, a % b);
    }

    static int findLcm(int a, int b) {
        return (a * b) / findGcd(a, b);
    }
}
