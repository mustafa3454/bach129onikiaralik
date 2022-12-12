package day07ifStatement;

public class notlar {
    public static void main(String[] args) {

      /*
Javanin kullandigi ve urettigi hersey datadir.
Javada iki turlu Memory vardir
1) Stack Memory ==> small gibi
    i) Kucuk Memory'dir
    ii )Primitiveleri ve Non-Primitivelerin Referance (adreslerini ) tutar
2) Heap Memory ==> Huge gibi
    i) Buyuk Memory'dir
    ii)Non-Primitive datalari icerir

    Java Heap Memory'e yerlestirilen tum Non-Primitive datalar icin
    bir adres (Referance) olusturur.
    Bu adreside Stack Memory'de saklar.
    Herhangi bir sebeple adress (Referance) silinirse Heapdeki Non-Primitive
    datayi Memory'nin temizligini saglayan "Garbage Collector" temizler.


    String s = "Tom";
    String t ="Terry";
    String r = "Tom";
    1) s==t ==> i) Adres ===> farkli
                ii)Deger ===>farkli

    2) s.equals(t) ==> i) Deger ==>farkli
       s.equals(r) ==>  i) Deger ==> Ayni




      /*
       Note: String'lerin esitliklerini kontrol ederken "==" yerine "equals()" kullaniriz.
        Niye ?
                Cunku; "==" sembolu iki String'i karsilastirirken hem adres'lerine hem de degerlerine bakar,
                ikisi de ayni ise siz String'ler esittir der ama biz code yazarken genellikle String'lerin
        adres'leri ile degil degerleri ile ilgileniriz. Bu yuzden String karsilastirmalarinda "==" kullanmayiz.

        "equals()" metho'u ise iki String'i karsilastirirken sadece degerlerine bakar, degerler ayni ise
        bu iki String esittir der degerler farkli ise bu iki String farklidir der ki bu bizim kod yazarken
        ihtiyac duydugumuz seydir.
*/


    }
}
