package day03scanner;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Scanner01 {
//  Kullanidan data alip kullanacagiz .

    public static void main(String[] args) {


        //1.adim: Scanner Class'dan object olustur
        Scanner input = new Scanner(System.in);
        //2.adim: Kullaniciya ne istediginize dair mesaj veriniz
        System.out.println("Lutfen yasinizi giriniz...");
        //3.adim: Uygun method'u kullanarak kullanicinin verdigi data'yi memory'e yerlestiriniz


              byte age = input.nextByte();
                System.out.println(age);


    }
}

    /*
     Objenin ismini input yaptik. Cunku bu objenin kullanimdan  alinan  data  bilgilarini  benim
     yazacagim  kodlarimin icine  koyacagiz.
    */

       //Object nasil olusturuluyor?
// object olusturmak icin hangi classs i kullanacagini java ya soylemelisin
// once class in ismini yazacaksin
// sonra object 'e isim verceksin "Object ismi"
// Java da her seye bir isim vermek gerekiyor.
// sonra atama operatoru koymalisin =
// ondan sonra "new keyword" yazmalisin // new keyword, "object yaratmak" demek
// obje olusturuken en son constructer olusturacaksin
// class ismi ve parantez bize constructer un ismini verecek
// bir onceki car class da olutrudugumuz hersey obie de olacaktir. Kalipta fiyat varsa obje de olmali.
// kalipta hareket etse fonksiyonu varsa objeden olmalı.
// classda durma fonksiyonunu varsa objede  kullanılabilir.


