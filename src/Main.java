public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он ещё не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("Task 2");
        int temp = 10;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }

        System.out.println("Task 3");
        int speed = 50;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ехать спокойно");
        }

        System.out.println("Task 4");
        age = 25;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }

        System.out.println("Task 5");
        age = 17;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то он не может кататься на аттракционе ");
        }
        if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься на аттракционе в сопровождении взрослого");
        }
        if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься на аттракционе без сопровождения взрослых");
        }

        System.out.println("Task 6");
        int places = 102;
        int sitPlaces = 60;
        int people = 105;
        if (people < sitPlaces) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (people >= sitPlaces && people < places) {
            System.out.println("В вагоне есть стоячие места");
        }
        if (people >= places) {
            System.out.println("Вагон полностью забит");
        }

        System.out.println("Task 7");
        int one = 5;
        int two = 2;
        int three = 3;
        if (one >= two && one >= three) {
            System.out.println("Большее число в переменной one, = " + one);
        } else {
            if (two >= three) {
                System.out.println("Большее число в переменной two, = " + two);
            } else {
                System.out.println("Большее число в переменной three, = " + three);
            }
        }
    }
}