public class Main {
    public static void main(String[] args) {
        int i = 2000000000;
        byte b = -128;
        short sh = 32767;
        long l = 9000000000000000000L;
        float f = 3.4567777777f;
        double d = 3.456777777789;
        boolean t = true;
        char c = 65505;

        double a = 27.12 ;
        long j = 987678965549L;
        double e = 2.786;
        short n = 569;
        short s1 =-159;
        int s2 = 27897;
        byte y = 67;

        int c1 = 23;
        int c2 = 27;
        int c3 = 30;
        int AllPaper = 480;
        int paperForStudent = AllPaper/(c1+c2+c3);

        int bottlesIn2minutes = 16;
        int b1 = bottlesIn2minutes*10;
        int bottlesInDay = bottlesIn2minutes*3*24;
        int bottlesIn3day = bottlesInDay*3;
        int bottlesInMonth = bottlesIn3day*10;

        int brownPaint = 4;
        int whitePaint = 2;
        int count = 120;
        int brownPaintForAllRoom = (count/(brownPaint+whitePaint))*brownPaint;
        int whitePaintForAllRoom =(count/(brownPaint+whitePaint))*whitePaint;
        int AllRoom=count/(brownPaint+whitePaint);

//        Бананы — 5 штук (1 банан — 80 грамм).
//        Молоко — 200 мл (100 мл = 105 грамм).
//        Мороженое-пломбир — 2 брикета по 100 грамм.
//        Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
//        Смешать всё в блендере — и готово.
        int banan = 80;
        int milk = 105;
        int iceCream = 100;
        int agg = 70;
        int weigthInGram= banan*2+milk*2+iceCream*2+agg*4;
        int weigthInKg =weigthInGram/1000;

        //сбросить 7 кг

        int weigthKg = 7;
        int weigthGram = weigthKg*1000;
        int a1 = 250;
        int b2 = 500;
        int A = weigthGram/250;
        int B = weigthGram/500;
        int averageQuantity =(A+B)/2;

//        Маша получает 67 760 рублей в месяц.
//        Денис получает 83 690 рублей в месяц.
//        Кристина получает 76 230 рублей в месяц.
        int kash1=67760;
        int kash2=83690;
        int kash3=76230;

        int thisYear1=kash1*12;
        int thisYear2=kash2*12;
        int thisYear3=kash3*12;

        float increaseSalary=0.1f;

        float increaseSalaryMasha=67760*increaseSalary;
        float increaseSalaryDenis=83690*increaseSalary;
        float increaseSalaryKristina=76230*increaseSalary;

        float newSalaryForMasha=increaseSalaryMasha+kash1;
        float newSalaryForDenis=increaseSalaryDenis+kash2;
        float newSalaryForKristina=increaseSalaryKristina+kash3;



        float nextYear1= increaseSalaryMasha*12;
        float nextYear2= increaseSalaryDenis*12;
        float nextYear3= increaseSalaryKristina*12;
        System.out.println(i);
        System.out.println(b);
        System.out.println(sh);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(t);
        System.out.println(c);
        System.out.println();
        System.out.println(a);
        System.out.println(j);
        System.out.println(e);
        System.out.println(n);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(y);
        System.out.println("На каждого ученика рассчитано " + paperForStudent + " листов бумаги");
        System.out.println();

        System.out.println("За "+"20 минут" + " машина произвела " +b1 + " штук бутылок");
        System.out.println("За " +"сутки" + " машина произвела " +bottlesInDay + " штук бутылок");
        System.out.println("За " +"3 дня" + " машина произвела " +bottlesIn3day + " штук бутылок");
        System.out.println("За " +"месяц" + " машина произвела " +bottlesInMonth + " штук бутылок");
        System.out.println();
        System.out.println("В школе, где "+AllRoom +" классов, нужно "+whitePaintForAllRoom+" банок белой краски и "+brownPaintForAllRoom+" банок коричневой краски");
        System.out.println();
        System.out.println(weigthInGram);
        System.out.println(weigthInKg);
        System.out.println();
        System.out.println(A);
        System.out.println(B);
        System.out.println(averageQuantity);
        System.out.println();
        System.out.println("Маша теперь получает "+newSalaryForMasha+" рублей. Годовой доход вырос на "+nextYear1+" рублей");
        System.out.println("Денис теперь получает "+newSalaryForDenis+" рублей. Годовой доход вырос на "+nextYear2+" рублей");
        System.out.println("Кристина теперь получает "+newSalaryForKristina+" рублей. Годовой доход вырос на "+nextYear1+" рублей");

    }
}
