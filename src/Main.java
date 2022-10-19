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
        long house = 987_678_965_549L;
        System.out.println(house);
        double frog = 2.786;
        System.out.println(frog);
        boolean age = false;
        System.out.println(age);
        short ice = 569;
        System.out.println(ice);
        var friend = -159;
        System.out.println(friend);
        int lemon = 27897;
        System.out.println(lemon);
        byte moon = 67;
        System.out.println(moon);
        // Задача 3
        System.out.println("Задача 3");
        short LP = 23; // Ученики Людмилы Павловны
        short AN = 27; // Ученики Анны Сергеевны
        short EA = 30; // Ученики Екатерины Андреевны
        short sheets = 480; // Закупленно листов бумаги на 3 класса
        int allStudent = LP + AN + EA;
        int sheetsForStudents = sheets / allStudent;
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

        int whiteColourCans = 2;
        int brownColourCans = 4;
        int cansNumber = 120;
        int schoolRooms = cansNumber / (whiteColourCans + brownColourCans);
        int allWhiteCans = schoolRooms * whiteColourCans;
        int allBrownCans = schoolRooms * brownColourCans;
        System.out.println("В школе, где " + schoolRooms + " классов нужно " + allWhiteCans +" банок белой краски и " + allBrownCans + " банок коричневой краски");

        // Задача 6
        System.out.println("Задача 6");
        int banana = 80;
        int bananas = 5;
        int mmMilk = 105;
        int milk = 2;
        int iceCrimeGram = 100;
        int iceCrime = 2;
        int oneEgg = 70;
        int egg = 4;
        float food = (banana * bananas + mmMilk * milk + iceCrime * iceCrimeGram + egg * oneEgg) / 1000f;
        System.out.println("Вес завтрака " + food + " кг");

        // Задача 7
        System.out.println("Задача 7");
        int lostWeight = 7;
        int lostDayMin = 250;
        int lostDayMax = 500;
        int lostWeightGram = lostWeight * 1000;
        int daysLostMin = lostWeightGram / lostDayMin;
        System.out.println("Если спортсмен будет " + lostDayMin + " грамм в день, ему потребуется " + daysLostMin + " дней.");
        int daysLostMax = lostWeightGram / lostDayMax;
        System.out.println("Если спортсмен будет " + lostDayMax + " грамм в день, ему потребуется " + daysLostMax + " дней.");
        int middleDay = (daysLostMin + daysLostMax) / 2;
        System.out.println("В среднем потребуется " + middleDay + " дней");

        // Задача 8
        System.out.println("Задача 8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        int newMashaSalary = mashaSalary + (mashaSalary * 10) / 100;
        int newDenisSalary = denisSalary + (denisSalary * 10) / 100;
        int newKristinaSalary = kristinaSalary + (kristinaSalary * 10) / 100;
        int oldYearSalaryMascha = mashaSalary * 12;
        int oldYearSalaryDenis = denisSalary * 12;
        int oldYearSalaryKristina = kristinaSalary * 12;
        int newYearSalaryMasha = newMashaSalary * 12;
        int newYearSalaryDenis = newDenisSalary * 12;
        int newYearSalaryKristina = newKristinaSalary * 12;
        int differentYearSalaryMascha = newYearSalaryMasha - oldYearSalaryMascha;
        int differentYearSalaryDenis = newYearSalaryDenis - oldYearSalaryDenis;
        int differentYearSalaryKristina = newYearSalaryKristina -oldYearSalaryKristina;
        System.out.println("Маша теперь получает " + newMashaSalary + " рублей. Годовой доход вырос на " + differentYearSalaryMascha + " рублей.");
        System.out.println("Денис теперь получает " + newDenisSalary + " рублей. Годовой доход вырос на " + differentYearSalaryDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newKristinaSalary + " рублей. Годовой доход вырос на " + differentYearSalaryKristina + " рублей.");














    }
}