package Deneme;

import java.util.Scanner;

public class Karecevresialani {
//1)Dikdörtgenin alanini ve cevresini hesaplayan methodu olusturunuz ve kullaniniz

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("lütfen dikdortgenin kısa kenarını giriniz...");
        int en = input.nextInt();

        System.out.println("lütfen dikdortgenin uzun kenarını giriniz...");
        int boy = input.nextInt();

        int alan = AlanHesapla(en,boy);
        System.out.println("dikdortgenin alanı=" + alan);

        int cevre = CevreHesapla(en,boy);
        System.out.println("dikdortgenin cevresi=" + cevre);
    }

    public static  int AlanHesapla(int kisaKenar, int uzunKenar) {
        int alan = kisaKenar * uzunKenar;
        return alan;
    }

    public static int CevreHesapla(int kisaKenar, int uzunKenar){
        int cevre = 2*(kisaKenar+uzunKenar);
        return cevre;

   //Scanner input = new Scanner(System.in);
        //System.out.println("Lütfen Uzun kenarı giriniz");
        //    int longEdge = input.nextInt();
        //
        //System.out.println("Lütfen kısa kenarı giriniz");
        //    int shortEdge = input.nextInt();
        //
        //System.out.println("Dikdörtgenin Alanı = " + (longEdge*shortEdge) );
        //System.out.println("Dikdörtgenin Çevresi = " + (2*longEdge+2*shortEdge)

    }


}
