public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte age = 19;
        if (age>=18){
            System.out.println("Если возраст человека равен " +age+ ", то он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека равен " +age+ ", он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        byte temperature = -23;
        if (temperature<=5){
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        byte seed = 60;
        if (seed<=60){
            System.out.println("Если скорость "+seed+" , то можно ездить спокойно");
        }
        else {
            System.out.println("Если скорость "+seed+" , то придется заплатить штраф");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte age = 19;
        boolean fromTwoToSix = age >= 2 && age<=6;
        boolean fromSevenToEighteen = age >= 7 && age<=18;
        boolean fromEighteenToTwentyFour = age >= 18 && age<=24;
        boolean moreThanTwentyFour = age>24;
        if (fromTwoToSix){
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в детский сад.");
        }
        else {
            if (fromSevenToEighteen) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в в школу.");
            }
            else {
                if (fromEighteenToTwentyFour){
                    System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в университет.");
                }
                else {
                    if (moreThanTwentyFour) {
                        System.out.println("Если возраст человека равен "+age+", то ему нужно ходить на работу.");
                    }
                }
            }
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        byte age = 17;
        boolean upToFive = age<5;
        boolean fromFiveToFourteen = age >= 5 && age<=14;
        if (upToFive){
            System.out.println("Если возраст ребенка равен "+age+",то ему нельзя кататься на аттракционе!");
        }
        else {
            if (fromFiveToFourteen){
                System.out.println("Если возраст ребенка равен "+age+",то ему можно кататься на аттракционе в сопровождении!");
            }
            else {
                System.out.println("Если возраст ребенка равен "+age+",то ему можно кататься без сопровождения взрослого!");
            }
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        short passenger = 132;
        short passengerSeats = 102;
        byte seating = 60;
        boolean standingPlaces = seating<passenger&&passenger<passengerSeats;
        if (passenger<seating){
            System.out.println("Еще есть сидячие места");
        }
        else {
            if (passenger==seating){
                System.out.println("Сидячие места заняты, есть еще стоячие");
            }
            else {
                if (standingPlaces){
                    System.out.println("Есть ещё стоячие места");
                }
                else {
                    System.out.println("Вогон забит, мест не осталось. Пассажиров больше на "+(passenger-passengerSeats)+" человек");
                }

            }
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one=1;
        int two=2;
        int three=3;
        if (one>two){
            if (one>=three){
                System.out.println("Больше всех число "+one);
            }
            else {
                System.out.println("Больше всех число "+three);
            }
        } else if (two>one) {
            if (two>=three){
            System.out.println("Больше всех число "+two);
            }
            else {
            System.out.println("Больше всех число "+three);
            }
        } else if (one>three) {
            System.out.println("Больше всех число "+one);
        } else if (three>one) {
            System.out.println("Больше всех число "+three);
        }else {
            System.out.println("Все числа одинаковые");
        }

    }
}