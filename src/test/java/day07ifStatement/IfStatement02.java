package day07ifStatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        //Example 2:Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz


        Scanner input = new Scanner (System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        int num = input.nextInt();
   if(num%2==0){
       System.out.println("Cift  sayi yazdirin");

   }

   if (num %2!=0) {
       System.out.println("Tek sayi ");

   }

       // 2.yol
        if(num%2==0) {
            System.out.println("Cift  sayi yazdirin");
        }else{
            System.out.println("Tek sayi ");
    }
        }

}
