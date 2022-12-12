package day05typecastingstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {


/*
        Example 1: Asagıdaki kurallara gore kullanıcının girdiği password u kontrol ediniz
        1) En az 8 karakter olsun
        2) Space karakteri password de olmasin
        3) En az bir tane buyuk harf olsun
        4) En az bir tane kucuk harf olsun
        5) En az bir tane sembol olsun
        6) En az bir tane rakam olsun
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz...");
      String pwd  =input.nextLine();

     // 1
    boolean first       =pwd.length()>7;
        System.out.println(first);


       //3) En az bir tane buyuk harf olsun
//Note: Buyuk harf olmayanlari sil,kalan karakter sayisina bak,
// karakter sayisi 0 ise buyuk harf yok demektir
// sifirdan buyuk ise buyuk harf vardir

    }


}



