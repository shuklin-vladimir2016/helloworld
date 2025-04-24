public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Task 2");
        dog = dog + 4;
        cat = cat + 4;
        paper =paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Task 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Task 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Task 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Task 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var summaryBoxerWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Масса двух боксеров " + summaryBoxerWeight);
        var boxerWeightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе двух боксеров " + boxerWeightDifference);

        System.out.println("Task 7");
        var weightReminder = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Остаток от деления двух боксеров " + weightReminder);

        System.out.println("Task 8");
        var commonAmountOfWork = 640;
        var oneEmployeeWorkHoursAmount = 8;
        var employeeAmount = commonAmountOfWork / oneEmployeeWorkHoursAmount;
        System.out.println("Всего работников в компании " + employeeAmount + " человек");
        var newEmployeeAmount = employeeAmount + 94;
        var newCommonAmountOfWork = newEmployeeAmount * oneEmployeeWorkHoursAmount;
        System.out.println("Если в компании работает " + newEmployeeAmount + " человека,то всего " + newCommonAmountOfWork+ " часа работы может быть поделено между сотрудниками ");
    }
}