package calculator;

import java.util.Scanner;

public class ViewCalculator {

    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    Scanner scanner = new Scanner(System.in);

    void run() {
         Calculable calculable = calculableFactory.create(getArgument());
        while (true) {
            System.out.print("Операция (+,*,=) : ");
            String input = scanner.nextLine().toLowerCase();
            switch (input) {
                case "+":
                    calculable.sum(getArgument());
                    break;
                case "*":
                    calculable.multi(getArgument());
                    break;

                case "=":
                    System.out.println("Результат: " + calculable. getResult());
                    System.out.print("Продолжить y/n: ");
                    String nextCircle = scanner.nextLine().toLowerCase();
                    if (nextCircle.equals("n")) {
                        return;
                    } else {
                        calculable = calculableFactory.create(getArgument());
                    }
                    break;

            }
        }
    }

    private ComplexNumber getArgument() {
        System.out.print("Введите комплексное число: ");
        String input = scanner.nextLine();
        while (!input.matches("^[\\d]+\\+[\\d]+[i]$")) {
            System.out.print(input + " - не комплексное число, введите комплексное число: ");
            input = scanner.nextLine();
        }
        String[] arrayStr = input.split("\\+");
        String a = arrayStr[0];
        String b = arrayStr[1].split("[i]")[0];
        return new ComplexNumber(Integer.parseInt(a), Integer.parseInt(b));
    }
}
