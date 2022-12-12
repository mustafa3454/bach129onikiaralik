package day07ifStatement;

import java.util.Scanner;

public class IfStatement04 {


    //Example 1: Gun sayisini verdiginizde gun ismini yazan kodu yaziniz

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        byte num = input.nextByte();

        if (num == 1) {
            System.out.println("Dimache");

        } else if (num == 2) {
            System.out.println("lundi");
        } else if (num == 3) {
            System.out.println("mardi");


        } else if (num == 4) {
            System.out.println("mecredi");


        } else if (num == 5) {
            System.out.println("jeudi");
        } else if (num == 6) {
            System.out.println("vendredi");
        } else if (num == 7) {
            System.out.println("samedi" );
        }else{
            System.out.println("Hatalı giriş yaptınız. Lütfen1 ile 7 arasında bir sayı giriniz...");
    }

}
}