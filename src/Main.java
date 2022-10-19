public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя рабата");
        // Задача 1
        System.out.println("Задача 1");
        int box = 2;
        System.out.println("Значение переменной box с типом int равно " + box );
        byte carBox = 4;
        System.out.println("Значение переменной carBox с типом byte равно " + carBox );
        short pool = 8237;
        System.out.println("Значение переменной pool с типом short равно " + pool );
        long mail = 73612;
        System.out.println("Значение переменной mail с типом short равно " + mail );
        float team = 123;
        System.out.println("Значение переменной team с типом short равно " + team );
        double wolf = 345;
        System.out.println("Значение переменной wolf с типом short равно " + wolf );
// Задача 2
        System.out.println("Задача 2");
       float cat = 27.12f;
        System.out.println(cat);
        long house = 987_678_965_549l;
        System.out.println(house);
        double frog = 2.786;
        System.out.println(frog);
        boolean age = 6 > 10;
        System.out.println(age);
        short ice = 569;
        System.out.println(ice);
        var friend = -159;
        System.out.println(friend);
        int limon = 27897;
        System.out.println(limon);
        byte moon = 67;
        System.out.println(moon);
        // Задача 3
        System.out.println("Задача 3");
        short LP = 23; // Ученики Людмилы Павловны
        short AN = 27; // Ученики Анны Сергеевны
        short EA = 30; // Ученики Екатерины Андреевны
        short sheets = 480; // Закупленно листов бумаги на 3 класса
        int allstuden = LP + AN + EA;
        int sheetsForStudents = sheets / allstuden;
        System.out.println("На каждого ученика рассчитано " + sheetsForStudents +" листов бумаги");
        // Задача 4
        System.out.println("Задача 4");
        int bottles = 16;
        int time = 2;
        int manufacturers = bottles / time;
        int time2 = 20;
        int bottles1 = manufacturers * time2;
        System.out.println("За " + time2 + " минут машина произвела бутылок " + bottles1 + " штук");

        int time3 = 24 * 60;
        int bottles2 = manufacturers * time3;
        System.out.println("За сутки машина произвела бутылок " + bottles2 + " штук");
        int time4 = 24 * 3 * 60;
        int bottles3 = manufacturers * time4;
        System.out.println("За три дня машина произвела бутылок " + bottles3 + " штук");
        int time5 = 24 * 30 * 60;
        int bottles4 = manufacturers * time5;
        System.out.println("За месяц машина произвела бутылок " + bottles4 + " штук");
        // Задача 5
        System.out.println("Задача 5");

        int cansNuber = 120;
        int whiteColourCans = 2;
        int brownColourCans = 4;
        int schoolRooms = cansNuber / (whiteColourCans + brownColourCans);
        int allWhiteCans = schoolRooms * whiteColourCans;
        int allBrownCans = schoolRooms * brownColourCans;
        System.out.println("В школе, где " + schoolRooms + " классов нужно " + allWhiteCans +" банок белой краски и " + allBrownCans + " банок коричневой краски");

        // Задача 6
        System.out.println("Задача 6");
        int banan = 80;
        int bananas = 5;
        int mmMilk = 105;
        int milk = 2;
        int iceCrimeGram = 100;
        int iceCrime = 2;
        int oneEgg = 70;
        int egg = 4;
        float food = (banan * bananas + mmMilk * milk + iceCrime * iceCrimeGram + egg * oneEgg) / 1000f;
        System.out.println("Вес завтрака " + food + " кг");











    }
}