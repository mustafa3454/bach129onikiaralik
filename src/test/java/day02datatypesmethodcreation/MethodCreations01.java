package day02datatypesmethodcreation;

public class MethodCreations01 {

        /*
                Java'da method nasil olusturulur?

                1)main method'un disinda olusturulur //    method  nasil olusturulur .Comment créer une méthode.
                2)Access Modifier    +      Return Type +     Method Ismi +         () +     {}
                                                            //Nom de la méthode
                Olusturulan method'lar nasil kullanilir
                2)method'un ismini + () yazin
                3)Islem yapacaginiz sayilari parantezin icine koyun
         */

              public static void main(String[] args) {

            int sonuctop = toplama(30, 50);
                  System.out.println("sonuctop = " + sonuctop);

        long carpmaSonucu = multiply(3, 6);
                  System.out.println("carpmaSonucu = " + carpmaSonucu);

        int ucluSonuccarp = firstTwoMultiplyThirdAdd(2, 5, 8);
                  System.out.println("ucluSonuccarp = " + ucluSonuccarp); 

        double kup = getCube(5);

                  System.out.println("kup = " + kup);
         
        double sonu3alan=dikAlan(4,5);
                  System.out.println("sonu3alan = " + sonu3alan);

               int sonu4cevre=dikcevre(4,5);
                  System.out.println("sonu4cevre = " + sonu4cevre);
             
             double sonucdairealan=dairealan(5);
                  System.out.println("sonucdairealan = " + sonucdairealan);
             
                
                  
                  double sonucdairecevre=dairecevre(5);
                  System.out.println("sonucdairecevre = " + sonucdairecevre);
              }

      public static int toplama(int a, int b){
        return a+b;

        
        
        
    }
//   public , protecdet ,privete   methodlari  hepsi kullanilir.
     protected static long multiply(int a, int b){

           return a*b;
    }

    //Ornek 1: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method'u olusturunuz ve kullaniniz.
            private static int firstTwoMultiplyThirdAdd(int a, int b, int c){

                       return a*b+c;
    }

    //Ornek 2: Verilen bir ondalik sayinin kupunu hesaplayan methodu olusturup kullaniniz.
    //Note: Access Modifier'i default yapmak access modifier'i yazmayiniz
    static double getCube(double a){

        return a*a*a;
    }
        //  odev
        //1)Dikdirtgenin alanini hesaplayan methodu olusturunuz ve kullaniniz    //  a*b
        //2)Dikdirtgenin cevresini hesaplayan methodu olusturunuz ve kullaniniz   // 2(a+b)

         //
        //4)Dairenin alaninio hesaplayan methodu olusturunuz ve kullaniniz


    // //2)Dikdirtgenin cevresini hesaplayan methodu olusturunuz ve kullaniniz   // 2(a+b)
          public static  double dikAlan(double a, double b) {
                          return a * b;
                       
  
  
   }
////1)Dikdirtgenin alanini hesaplayan methodu olusturunuz ve kullaniniz    //  a*b
                         public static  int dikcevre(int a ,int b ){
                               return 2*(a+b);
                  
}

    //3)Dairenin cevresini hesaplayan methodu olusturunuz ve kullaniniz
          protected  static double dairealan(double r){

                        return 3.14*r*r;     
 }

        protected  static double dairecevre(double r){
                      return 2*3.14*r;     
}

}

