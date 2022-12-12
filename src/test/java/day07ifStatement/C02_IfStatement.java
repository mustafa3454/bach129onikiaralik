package day07ifStatement;

import java.util.Scanner;

public class C02_IfStatement {


    public static void main(String[] args) {

        //Kullanici gun numarasini girsin kod gun ismini yazsin
//  1 ==> Pazar 2 ==>Pazartesi    5== >Persembe...

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen  gun numarasi giriniz.. \n 1: pazar 2: pazartesi  3:sali 4: carsamba 5:persembe 6 : cuma 7:cumartesi");
        byte gunNO= input.nextByte();

        if (gunNO==1) {
            System.out.println("pazar");

        }else {
        if (gunNO == 2) {
          System.out.println("pazartesi" );

      }else
      if (gunNO == 3) {
          System.out.println("sali");
      }else
      if (gunNO == 4) {
          System.out.println("carsamba");
      }else
      if (gunNO == 5) {
          System.out.println("persembe");
      }else
          if (gunNO == 6) {
              System.out.println("cuma");
          } else
              if (gunNO == 7) {
                  System.out.println("cumartesi");
              } else
                  System.out.println("lutfen bir numara giriniz");
              }
          }


      }