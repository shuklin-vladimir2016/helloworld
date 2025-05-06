public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен 18, то он совершеннолетний");
        }
        int age2 = 17;
        if (age2 >= 18) {
            System.out.println("Если возраст человека равен 18, то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен 17, то он ещё не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("Task 2");
        int temp = 4;
        if (temp < 5) {
            System.out.println("На улице 4 градуса, нужно надеть шапку");
        }
        int temp2 = 10;
        if (temp2 > 5) {
            System.out.println("На улице 10 градусов, можно идти без шапки");
        }

        System.out.println("Task 3");
        int speed = 80;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то водителю придется заплатить штраф");
        }
        int speed2 = 50;
        if (speed2 < 60) {
            System.out.println("Если скорость " + speed2 + " км/ч, то водителю можно ехать спокойно");
        }

        System.out.println("Task 4");
        int ageFrom2To6Years = 2;
        if (ageFrom2To6Years >= 2 && ageFrom2To6Years < 6) {
            System.out.println("Если возраст человека равен " + ageFrom2To6Years + ", то ему нужно ходить в детский сад");
        } else {
            System.out.println("Ему не нужно ходить в детский сад");
        }
        int ageFrom7To18Year = 7;
        if (ageFrom7To18Year >= 7 && ageFrom7To18Year < 18) {
            System.out.println("Если возраст человека равен " + ageFrom7To18Year + ", то ему нужно ходить в школу");
        } else {
            System.out.println("Ему не нужно ходить в школу");
        }
        int ageFrom18To24Years = 18;
        if (ageFrom18To24Years >= 18 && ageFrom18To24Years < 24) {
            System.out.println("Если возраст человека равен " + ageFrom18To24Years + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Ему не нужно ходить в университет");
        }
        int ageFromMoreThan24 = 25;
        if (ageFromMoreThan24 > 24) {
            System.out.println("Если возраст человека равен " + ageFromMoreThan24 + ", то ему нужно ходить на работу");
        } else {
            System.out.println("Ему не нужно ходить на работу");
        }

        System.out.println("Task 5");
        int ageFromLessThan5 = 4;
        if (ageFromLessThan5 < 5) {
            System.out.println("Если возраст ребенка равен " + ageFromLessThan5 + ", то он не может кататься на аттракционе");
        } else {
            System.out.println("Если больше 5 лет, то может кататься на аттракционе в сопровождении взрослого");
        }
        int ageFrom5To14 = 7;
        if (ageFrom5To14 > 5 && ageFrom5To14 < 14) {
            System.out.println("Если возраст ребенка равен " + ageFrom5To14 + ", то он может кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка больше 14 лет, то он может кататься без сопровождения взрослых");
        }
        int ageFromMoreThan14 = 14;
        if (ageFromMoreThan14 >= 14) {
            System.out.println("Если возраст ребенка равен " + ageFromMoreThan14 + ", то он может кататься на аттракционе без сопровождения взрослых");
        } else {
            System.out.println("Если меньше 14 лет, то может кататься, но в сопровождеии взрослых");
        }

        System.out.println("Task 6");
        int place = 0;
        if (place > 60) {
            System.out.println("Если место под номером " + place + ", то место стоячее");
        } else {
            System.out.println("Если мест " + place + ", то вагон полностью забит");
        }

        System.out.println("Task 7");
        int One = 1;
        int Two = 2;
        int Three = 3;
        if (Three > One && Three > Two) {
            System.out.println("Большее число = " + Three);
        } else {
            System.out.println("Большее число = " + One);
        }
    }
}