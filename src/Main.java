public class Main {
    public static void main(String[] args) {
        int age = 17;
        if (age >= 18) {
            System.out.println("Он совершеннолетний");
        } else{
            System.out.println("Он не достиг совершеннолетия, нужно немного подождать");
        }

        int temperature = 6;
        if (temperature > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }

        int speed = 50;
        if (speed > 60) {
            System.out.println("Превышения скорости нет");
        } else {
            System.out.println("Скорость превышена");
        }

        int ageHuman = 25;
        if (ageHuman > 2 && ageHuman < 6) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в детский сад");
        } else if (ageHuman > 7 && ageHuman < 17) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в школу");
        }
        else if (ageHuman >= 18 && ageHuman < 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то его место в университете");
        }
        else {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить на работу");
        }

        int ageChild = 15;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен" + ageChild + ", то ему нельзя кататься на аттракционе, ");
        } else if(ageChild > 5 && ageChild <= 14) {
            System.out.println("Если ребенку " + ageChild + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        else  {
            System.out.println ("Если ребенку " + ageChild + ", то он может кататься без сопровождения взрослого.");
        }

        int places = 102;
        int placeSit = 60;
        int fullPeoples = 60;

        if (places > fullPeoples) {
            placeSit = placeSit - fullPeoples;
            System.out.println("В вагоне есть" + placeSit + "сидячих мест");
        } else if (placeSit<fullPeoples) {
                places = places - fullPeoples;
        System.out.println("В вагоне есть " + places + "стоячих места");

        }else{
            System.out.println("Вагон уже полностью забит");
        }
        int one = 10;
        int two = 20;
        int three = 30;
        if (three > one && three >= two)
            System.out.println("Большее число " + three);
        else if (two > one && two >= three) {
            System.out.println("Большее число " + two);
        }
        else {
            System.out.println("Большее число " + one);
        }
    }
}