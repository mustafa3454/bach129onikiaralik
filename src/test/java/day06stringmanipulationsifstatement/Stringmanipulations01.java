package day06stringmanipulationsifstatement;

public class Stringmanipulations01 {
    public static void main(String[] args) {


        //Example 1: Bir String'in bas ve sonunda space caharacter'i varsa siliniz.
        //             "   Ali Can   "     ==>      "Ali Can"
        String s = "   Ali Can  ";
        System.out.println(s);

        //trim() method'u bir String'in bas ve sonundaki space character'lerini siler, aradaki space'lere dokunmaz
        String sTrimmed = s.trim();
        System.out.println(sTrimmed);

        //Example 2: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //           String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98
        String tv1 = "$456.99";
        String laptop1 = "$875.99";

        String tv2 = tv1.replace("$", "");
        System.out.println(tv2);// 456.99

        String laptop2 = laptop1.replace("$", "");
        System.out.println(laptop2);// 875.99

        Double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println(totalPrice);//1332.98


        //Exampl//e 3: Verilen ismin ilk isminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz
        // "Ali Can" ==> AC
        String name = "   ali cAN   ";
        char first = name.trim().toUpperCase().charAt(0);
        System.out.print(first);

        char second = name.trim().toUpperCase().split(" ")[1].charAt(0); //  [] indeks  koseli  paranterz icin

        System.out.print(second);// C

        System.out.println("  " + first + second);//AC

        //Example 4: Bir String'in hic karakter icermedigini(Bos String) kontrol eden kodu yaziniz
        //   java  method  uretmistir  onu  ve bildiginiz methodu  kullaniniz.Ama  genelde  javaya is yaptirmak gerkir.
        // akliniza  gellmez ise  bakmak  gerekir.

//Example 4: Bir String'in hic karakter icermedigini(Bos String) kontrol eden kodu yaziniz
        String str = "";

//1.YOL: length() kullan
        boolean result1 = str.length() == 0;
        System.out.println("String bos mu ?" + result1);//true /false


//2.YOL: isEmpty() kullan. Java bir konuda method üretmisse, o method u kullanmak en iyisidir
        boolean result2 = str.isEmpty();
        System.out.println("String bos mu ?" + result2);//true


        //Example 5 : Bir Strig'in space haric hicbir character icermedigini kontrol eden kodu yazınız

        String t = "      ";

//1. Yol :
        boolean result3 = t.replace(" ", "").length() == 0;
        System.out.println("Sadece space mi var?" + result3);


//2.YOL:
        boolean result4 = t.replace(" ", "").isEmpty();
        System.out.println("Sadece space mi var?" + result4);//true

//3.YOL:

        // isBlank methodu sadece space iceren String ler icin true verir.Space disinda bir character  icerirse false  verir.
        boolean result5 = t.isBlank();  //
        System.out.println("Sadece space mi var?" + result5);//true


//Example 6: Bir String'de a, e, i character'lerinin ilk gorunumulerinin indexleri toplamini yazdiriniz
//           "Java is easy to learn" ==>


//Example 6: Bir String'de a, i, e karakterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz
//    "Java is easy to learn" ==> 1 + 5 + 8 = 14
        String r = "Java is easy to learn";
        int idxA = r.indexOf('a');
        System.out.println(idxA);//1

        int idxI = r.indexOf('i');
        System.out.println(idxI);//5

        int idxE = r.indexOf('e');
        System.out.println(idxE);//8

        System.out.println("Index'ler toplami:" + (idxE + idxA + idxI));//Index'ler toplami:14

//Example 7: Bir String'de "Java" kelimesinin ilk olarak kacinci index'te kullanildigini gosteren kodu giriniz
//   "Ah Java vah Java sensiz olmuyor Java." ==> 3
        String u = "Ah Java vah Java sensiz olmuyor Java.";
        //indexOf("Java") kullaniminda siz "Java" kelimesinin ilk gorunumundeki ilk harfin (yani J nin) index'ini almis olursunuz

        int idxJava = u.indexOf("Java");
        System.out.println(idxJava);//3


        int idxOFxyz = u.indexOf("xyz");

        System.out.println(idxOFxyz); //-1

        // 8. SORU  Bir stringdeki a i e charakterlerinin son gorunumdeki indexleiniri toplmaiini ekrana yazdiriniz.
//Example 8: Bir String'de a, i, e karakterlerinin son gorunumlerinin indexleri toplamini ekrana yazdiriniz
//    "Java is easy to learn" ==> 18 + 5 + 17 = 40
        String v = "Java is easy to learn";

        int idxOfA = v.lastIndexOf('a');
        System.out.println(idxOfA);//18

        int idxOfI = v.lastIndexOf('i');
        System.out.println(idxOfI);//5

        int idxOfE = v.lastIndexOf('e');
        System.out.println(idxOfE);//17

        System.out.println(idxOfA + idxOfE + idxOfI);//40

        //Note: lastIndexOf() String olmayan bir character icin kullanilirsa her zaman "-1" verir

//  9. soru   Bir stringdeki   tekrarsiz karakterleri  ekrani yazdiriniz?
        //Note: Bazi kodlarin bazi sartlara bagli olarak calismasi gerekir.
//      Bazi kodlari bazi sartlara gore aktive etmek icin "if statement" kullanilir.
//      if you study hard, you will learn Java.


        // soru 10  sayi cirft ise ekrana yazdiriniz?
        int num = 12;
        if (num > 0) {
            System.out.println("pozitif");
        } //if
        // soru 10 sayi -1  ile 10 arasindaki ekrana yazdiriniz?
        int number = 30;
        if (number > -1 && number < 10) {
            System.out.println("number ");
        } //if

        // soru 10 uc basamakli  sayi ise ekrana woow yazdirin

           int n=250;
          n   =Math.abs(n);  // mutlak deger  - li  ifadeler icin  yapiyoruz.
              if (n>99 && n<1000) {
        }
               System.out.println("wooow");


    }
}