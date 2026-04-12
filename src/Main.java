public class Main {
    public static void main(String[] args) {
        int integerNumber = 2000000000;
        byte byteNumber = -128;
        short shortNumber = 32767;
        long longNumber = 9000000000000000000L;
        float floatNumber = 3.4567777777f;
        double doubleNumber = 3.456777777789;
        boolean booleanValue = true;
        char charSymbol = 65505;

        double doubleNumeric = 27.12;
        long longNumeric = 987678965549L;
        double doubleNum = 2.786;
        short shortNumeric = 569;
        short shortNum = -159;
        int integerNumeric = 27897;
        byte byteNumeric = 67;

        int studentsClass1 = 23;
        int studentsClass2 = 27;
        int studentsClass3 = 30;
        int AllPapers = 480;
        int papersForStudent = AllPapers / (studentsClass1 + studentsClass2 + studentsClass3);

        int bottlesIn2minutes = 16;
        int hoursInDay = 24;
        int bottlesIn20minutes = bottlesIn2minutes * 10;
        int bottlesInDay = bottlesIn2minutes * 3 * hoursInDay;
        int bottlesIn3day = bottlesInDay * 3;
        int bottlesInMonth = bottlesIn3day * 10;

        int brownPaint = 4;
        int whitePaint = 2;
        int numberOfСlasses = 9;
        int brownPaintForAllRoom = brownPaint * numberOfСlasses;
        int whitePaintForAllRoom = whitePaint * numberOfСlasses;
//        Бананы — 5 штук (1 банан — 80 грамм).
//        Молоко — 200 мл (100 мл = 105 грамм).
//        Мороженое-пломбир — 2 брикета по 100 грамм.
//        Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
//        Смешать всё в блендере — и готово.
        int banan = 80;
        int milk = 105;
        int iceCream = 100;
        int agg = 70;
        int weigthInGram = banan * 2 + milk * 2 + iceCream * 2 + agg * 4;
        int weigthInKg = weigthInGram / 1000;

        //сбросить 7 кг

        int weigthKg = 7;
        int weigthGram = weigthKg * 1000;
        int weigth1 = 250;
        int weigth2 = 500;
        int quantity1 = weigthGram / weigth1;
        int quantity2 = weigthGram / weigth2;
        int averageQuantity = (quantity1 + quantity2) / 2;

//        Маша получает 67 760 рублей в месяц.
//        Денис получает 83 690 рублей в месяц.
//        Кристина получает 76 230 рублей в месяц.
        int kash1 = 67760;
        int kash2 = 83690;
        int kash3 = 76230;

        int thisYear1 = kash1 * 12;
        int thisYear2 = kash2 * 12;
        int thisYear3 = kash3 * 12;

        float increaseSalary = 0.1f;

        float increaseSalaryMasha = 67760 * increaseSalary;
        float increaseSalaryDenis = 83690 * increaseSalary;
        float increaseSalaryKristina = 76230 * increaseSalary;

        float newSalaryForMasha = increaseSalaryMasha + kash1;
        float newSalaryForDenis = increaseSalaryDenis + kash2;
        float newSalaryForKristina = increaseSalaryKristina + kash3;


        float nextYear1 = increaseSalaryMasha * 12;
        float nextYear2 = increaseSalaryDenis * 12;
        float nextYear3 = increaseSalaryKristina * 12;

        System.out.println(integerNumber);
        System.out.println(byteNumber);
        System.out.println(shortNumber);
        System.out.println(longNumber);
        System.out.println(floatNumber);
        System.out.println(doubleNumber);
        System.out.println(booleanValue);
        System.out.println(charSymbol);
        System.out.println();
        System.out.println(doubleNumeric);
        System.out.println(longNumeric);
        System.out.println(doubleNum);
        System.out.println(shortNumeric);
        System.out.println(shortNum);
        System.out.println(integerNumeric);
        System.out.println(byteNumeric);
        System.out.println();

        System.out.println("На каждого ученика рассчитано " + papersForStudent + " листов бумаги");
        System.out.println();

        System.out.println("За " + "20 минут" + " машина произвела " + bottlesIn20minutes + " штук бутылок");
        System.out.println("За " + "сутки" + " машина произвела " + bottlesInDay + " штук бутылок");
        System.out.println("За " + "3 дня" + " машина произвела " + bottlesIn3day + " штук бутылок");
        System.out.println("За " + "месяц" + " машина произвела " + bottlesInMonth + " штук бутылок");
        System.out.println();

        System.out.println("В школе, где " + numberOfСlasses + " классов, нужно " + whitePaintForAllRoom + " банок белой краски и " + brownPaintForAllRoom + " банок коричневой краски");
        System.out.println();

        System.out.println(weigthInGram);
        System.out.println(weigthInKg);
        System.out.println();
        System.out.println(quantity1);
        System.out.println(quantity2);
        System.out.println(averageQuantity);
        System.out.println();
        System.out.println("Маша теперь получает " + newSalaryForMasha + " рублей. Годовой доход вырос на " + nextYear1 + " рублей");
        System.out.println("Денис теперь получает " + newSalaryForDenis + " рублей. Годовой доход вырос на " + nextYear2 + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryForKristina + " рублей. Годовой доход вырос на " + nextYear3 + " рублей");

    }
}