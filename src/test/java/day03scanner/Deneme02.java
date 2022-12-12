package day03scanner;

import java.util.Scanner;

public class Deneme02 {

    public static void main(String[] args) {

       // Kullanicidan kilosunu ve boyunu alip
        //Vucut kitle indeksini hesaplayan bir program yaziniz.
            //    Ipucu : Vucut
        //Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
        //        ORNEK:
       // INPUT      : Kilo: 71
       // Boy: 1,72
       // OUTPUT  : Vucut Kitle Indeksiniz : 23
//  1. yol
                   Scanner input =new Scanner(System.in);
              System.out.println("vucut kitle indeksi icin boyunuz kac cm ise lutfen   giriniz");


               double boy1= input.nextDouble();

               System.out.println("vucut kitle indeksi icin kilonuzu lutfen   giriniz...");
               double    kilom = input.nextDouble();

                  double  vucutkitle =kilom/(boy1*boy1);

                    System.out.println(boy1);

                    System.out.println(kilom);


                    System.out.println("vucut kitle");




//  2. yol
Scanner scaner = new Scanner(System.in);

System.out.print("Boyunuzu girin(cm) : ");
double b = scaner.nextDouble();

System.out.print("Kilonuzu girin(cm) : ");
double k = scaner.nextDouble();

     b=b/100;double
                    endeks= k/(b*b);

          System.out.println(b);
         System.out.println(k);
        System.out.println(endeks);

                       // 3.yol
        Scanner scan = new Scanner(System.in);
        System.out.print("Boyunuzu giriniz (1,75) : ");
        float boy = scan.nextFloat();

        System.out.print("Kilonuzu giriniz: ");
        float kilo = scan.nextFloat();

        float bki =kilo / (boy*boy);
    System.out.println("Beden Kitle İndeksiniz = " + bki);



    }
}
