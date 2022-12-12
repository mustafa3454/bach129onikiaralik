package day03scanner;

import java.util.Scanner;

public class Deneme01 {

    public static void main(String[] args) {

        //Kare nin alanini   ve cevresini hesaplayan  kodu ekrana yazdiriniz?

        Scanner scan = new Scanner(System.in);
        System.out.println("Kare'nin bir kenar uzunluğunu giriniz");

        double kenar = scan.nextDouble();
        double alan = kenar*kenar;
        double cevre=4*kenar  ;

        System.out.println("Alan: " + alan);
        System.out.println("cevre = " + cevre);




        // Yaricapi 4 olan dairenin cevresi  ve alanin hesaplayan kod yaziniz?
       //  Daire  ve cevre toplamlarini  ekrana yazdiriniz?

        Scanner input=new Scanner(System.in);
        System.out.println("dairenin yaricapini  giriniz");


        double yaricap =input.nextDouble();

        double daireAl= 3.14*yaricap*yaricap;


        double daireCev=2*3.14*yaricap;
        double toplam=daireAl +daireCev;


        System.out.println("Alan: " + daireAl);
        System.out.println("cevre = " + daireCev);
        System.out.println("daire cevresi toplam" + toplam);




    }

}
