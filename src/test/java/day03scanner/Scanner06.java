package day03scanner;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {
//Kullanicidan alacaginiz 5 basamakli
// bir sayinin ilk iki ve son iki basamagindaki
// rakamlari toplamini yazdiran kodu yaziniz


        Scanner input=new Scanner(System.in);
        System.out.println("5 basamaklı sayı girin: ");
        int number = input.nextInt();
 //  38671
        //1. YOL
        int sonRakam = number %10;
        System.out.println("lastDigit"); // 1
        int temp1=number/10; // 3867
        //
        int sondanIkınciRakam = temp1 % 10;// 7
        int temp2=temp1/10; //386

       //
        int sondanUcuncuRakam = temp2 % 10; // 6
        int temp3=temp2/10;  // 38
       //
        int sondanDorduncuRakam = temp3 % 10; //8
        int temp4=temp3/10; //3
       //
        int sondanBesinciRakam = temp4 % 10;// 0
        int temp5=temp4/10; //0

        System.out.println(sonRakam+sondanIkınciRakam+sondanDorduncuRakam+sondanBesinciRakam);

// 2. YOL   suleyman beyin  kodu  cozumu

        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz

        Scanner scan = new Scanner(System.in);

        System.out.println("5 basamakli bir sayi giriniz...");

           int number1 = input.nextInt();

        //Son rakami al
        int lastDigit = number%10;
        number = number/10;

        //Sondan ikinci rakami al
        int lastSecondDigit = number%10;
        number = number/10;

        //Sondan ucuncu rakami al
        int lastThirdDigit = number%10;
        number = number/10;

        //Sondan dorduncu rakami al
        int lastFourthDigit = number%10;
        number = number/10;

        //Sondan besinci rakami al
        int lastFifthDigit = number%10;

        System.out.println(lastDigit + lastSecondDigit + lastFourthDigit + lastFifthDigit);


















    }

}
