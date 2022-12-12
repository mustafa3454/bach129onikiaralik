package day07ifStatement;

import java.util.Scanner;

public class IfStatement05benim {
    public static void main(String[] args) {
        //Example 1: Ay isimleri girilince kacinci ay oldugunu yazan kodu yaziniz
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ay ismi giriniz...");

           String monthName= input.next();
            String ay=input.next();






          if (ay.equalsIgnoreCase("ocak ") ){
            System.out.println(1);
        }else if (ay.equalsIgnoreCase("subat ") ){
            System.out.println(2);
        }else if (ay.equalsIgnoreCase("mart ")){
            System.out.println(3);
        }else if (ay.equalsIgnoreCase("nisan ")){
            System.out.println(4);
        }else if (ay.equalsIgnoreCase("mayis ")){
            System.out.println(5);
        }else if (ay.equalsIgnoreCase("haziran ")){
            System.out.println(6);
        }else if (ay.equalsIgnoreCase("temmuz ")){
            System.out.println(7);
        }else if(ay.equalsIgnoreCase("agustos ") ){
            System.out.println(8);
        }else if (ay.equalsIgnoreCase("eylul ")){
            System.out.println(9);
        }else if( ay.equalsIgnoreCase("ekim ")){
            System.out.println(10);
        }else if(ay.equalsIgnoreCase("kasim")){
            System.out.println(11);
        }else if(ay.equalsIgnoreCase("aralik")){

            System.out.println(12);

          }else{
              System.out.println("LUTFEN  BIR AY ADI GIRINIZ");


    }




        }

    }