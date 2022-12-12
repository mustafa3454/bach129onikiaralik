package day02datatypesmethodcreation;

public class Deneme {
    public static void main(String[] args) {

        //Ornek 1: Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturup toplam fiyati ekrana yazdiriniz.
        //


        //Ornek 2: Hucre agirligi ve Amip'in agirligi icin iki tane variable olusturun ve agirliklari farkini ekrana yazdirin


        //Ornek 1:  Sehir ismi icin bir variable   olusturun ve bir deger atayip onu ekrana yazdirin

     //  TOPLAMA ISLEMI YAPAN BIR METHOD YAZINIZ
         int sonuc   = toplama(3,5);
         System.out.println(sonuc);
         int sonuc1= carpma(3,5,6);
           System.out.println(sonuc1);

  double sonuc3=bolme(40,2);
        System.out.println( sonuc3);
    }

        public static int toplama(int  a,int b){
                  return a+b;

    }
  private  static int carpma(int a,int b, int c){
          return a*c*b;

    }

      protected static int bolme(int a,int b ){
          return a/b;
   }

}