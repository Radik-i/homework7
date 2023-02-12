public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");

        int salary = 15000;
        int total = 0;
        int i =0;
        while (total < 2_459_000) {
            total = total + salary;
            i = i+1;
            System.out.println("Месяц " + i +  " сумма накопления равна " + total + " руб");
        }
        System.out.println();
    }
    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while(i <=10) {
            System.out.print(i +" ");
            i++;
        }
        System.out.println();
        for (int j = 10; j>0; j--) {
            System.out.print(j +" ");
        }
        System.out.println();
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");

        int population = 12_000_000;
        int birthrate = 17;
        int mortality = 8;

        for (int i = 0; i <= 10; i ++) {
            System.out.println("Через "+ i +" лет население страны составит "+ population +" человек");
            population = population+(birthrate-mortality)*(population/1000);
        }
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задача 4");

        double total = 15000;
        int i=0;
        while (total <= 12_000_000) {
            i++;
            total = 1.07 * total;
            System.out.println("Через " + i + " мес на счете Василия " + total + " руб");
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 5");

        double total = 15000;
        int i=0;
        while (total <= 12_000_000) {
            i++;
            total = 1.07 * total;
            if (i % 6 == 0) {
            System.out.println("Через " + i + " мес на счете Василия " + total + " руб");
            }
        }
        System.out.println();
    }

    public static void task6() {
        System.out.println("Задача 6");
        double total = 15000;
        for (int i = 1; i<=(9*12); i++) {
            total = 1.07 * total;
            if (i % 6 == 0) {
                System.out.println("Через " + i + " мес на счете Василия " + total + " руб");
            }
        }
        System.out.println();
    }

    public static void task7() {
        System.out.println("Задача 7");

        int friday = 1;

        while (friday <= 31) {
            System.out.println("Сегодня пятница, "+ friday+"-е число. Необходимо подготовить отчет");
            friday = friday + 7;
        }
        System.out.println("");
    }

    public static void task8() {
        System.out.println("Задача 8");
        int year = 2017;
        int startYear = year - 200+79;
        int finishYear = year + 100;
        while (startYear <= finishYear) {
            System.out.println(startYear);
            startYear = startYear + 79;

        }
        System.out.println("");
    }
}