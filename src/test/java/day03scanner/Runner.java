package day03scanner;

public class Runner {

    public static void main(String[] args) {

    // objet nasil  olusturulur.


         Car myCar=new Car();

        System.out.println(myCar.fiyat);

        System.out.println(myCar.model);
             myCar.dur();
           myCar.hareket();

       Student tomHanks =new Student();

        System.out.println("tomHanks.name");
        System.out.println(tomHanks.grade);
        System.out.println(tomHanks.adrees);

        tomHanks.sdudy();
           tomHanks.feed();
    }
}
