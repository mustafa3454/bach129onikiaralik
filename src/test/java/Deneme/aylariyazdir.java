package Deneme;

import java.util.Scanner;

public class aylariyazdir {

    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);
            System.out.println("---------------------\n<AY SIRASI BULMA APP>\n---------------------");


            System.out.print("Bir Ay Yazın: ");
            String monthOfYear = scanner.next().trim();

            if (monthOfYear.equalsIgnoreCase("ocak")) {
                    System.out.println("1");
            } else if (monthOfYear.equalsIgnoreCase("şubat")) {
                    System.out.println("2");
            } else if (monthOfYear.equalsIgnoreCase("mart")) {
                    System.out.println("3");
            } else if (monthOfYear.equalsIgnoreCase("nisan")) {
                    System.out.println("4");
            } else if (monthOfYear.equalsIgnoreCase("mayıs")) {
                    System.out.println("5");
            } else if (monthOfYear.equalsIgnoreCase("haziran")) {
                    System.out.println("6");
            } else if (monthOfYear.equalsIgnoreCase("temmuz")) {
                    System.out.println("7");
            } else if (monthOfYear.equalsIgnoreCase("ağustos")) {
                    System.out.println("8");
            } else if (monthOfYear.equalsIgnoreCase("eylül")) {
                    System.out.println("9");
            } else if (monthOfYear.equalsIgnoreCase("ekim")) {
                    System.out.println("10");
            } else if (monthOfYear.equalsIgnoreCase("kasım")) {
                    System.out.println("11");
            } else if (monthOfYear.equalsIgnoreCase("aralık")) {
                    System.out.println("12");
            } else {
                    System.out.println("Lütfen bir ay adı giriniz");
            }
    }

}




//            if(monthName.equals("January")){
//                    System.out.println(1);
//            }else if(monthName.equals("February")){
//                    System.out.println(2);
//            }else if(monthName.equals("March")){
//                    System.out.println(3);
//            }else if(monthName.equals("April")){
//                    System.out.println(4);
//            }else if(monthName.equals("May")){
//                    System.out.println(5);
//            }else if(monthName.equals("June")){
//                    System.out.println(6);
//            }else if(monthName.equals("July")){
//                    System.out.println(7);
//            }else if(monthName.equals("August")){
//                    System.out.println(8);
//            }else if(monthName.equals("September")){
//                    System.out.println(9);
//            }else if(monthName.equals("October")){
//                    System.out.println(10);
//            }else if(monthName.equals("November")){
//                    System.out.println(11);
//            }else if(monthName.equals("December")){
//                    System.out.println(12);
//            }else{
//                    System.out.println("Invalid month name...");
//            }
//

