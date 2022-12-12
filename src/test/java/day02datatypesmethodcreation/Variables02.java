package day02datatypesmethodcreation;

public class Variables02 {

    /*
           Non-Primitive Data Types: String bir non-primitive data type'dir.
                                     Uretilen her bir class ayni zamanda bir "non-primitive data type" dir.
                                     Bu yuzden "non-primitive data type" lar sinirsiz sayidadir denebilir.
                                     Non-primitive data type'larin isimleri buyuk harfle baslar
                                     Non-primitive data type'larin tamami icin Java memory'de ayni miktarda yer ayirir.

          Interview Sorusu: "primitive" ve "non-primitive" data type'lari arasindaki fark nedir?
                            1)"primitive" ler sadece bizim atadigimiz degeri icerir,//inclut la valeur,
                              "non-primitive" ler bizim atadigimiz deger ve method'lar icerir.//Contient des valeurs et des méthodes
                            2) "primitive" ler kucuk harfle baslar,//  "primitive  ils commencent par une lettre minuscule
                             "non-primitive" ler buyuk harfle baslar.//non-primitive commence par une lettre majuscule
                            3) "primitive" leri Java uretmistir ve 8 tanedir,/ /8 et fixe
                               "non-primitive" leri Java ve developerlar uretebilir, sinirsiz sayidadir.//Les développeurs peuvent produire, un nombre illimité.
                            4) "primitive" ler memory'de data type'ina gore yer kaplar,//Il occupe de l'espace en mémoire selon le type de données,
                               "non-primitive" ler icin Java memory'de hep ayni buyuklukte yer ayirir.//Il alloue toujours la même taille en mémoire Java.
        */
    public static void main(String[] args) {

        //Ornek 1:  Sehir ismi icin bir variable   olusturun ve bir deger atayip onu ekrana yazdirin
        String cityName = "Montpellier";

          String  isim=  "MUSTAFA";

        System.out.println(cityName);

    }


}

