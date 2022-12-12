package day03scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        //Kullanidan  adresinizi aliniz ekrani yazdirin.

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen adresinizi giriniz");

   String adres= input.nextLine(); // adres  satirinin hepsini almak icin
   String adres1= input.next(); // ilk    kelime  String  icin    kullanilir.

        System.out.println(adres);

    }

}
