package programme_1_calculate;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Please enter First Number : ");
            int a = scanner.nextInt();
            System.out.println("Please enter second Number : ");
            int b = scanner.nextInt();
            System.out.println("Please enter a symbol +,-,*,/ :");
            char symbol = scanner.next().charAt(0);
            Calculator calculator = new Calculator();
            calculator.calculateResult(a, b, symbol);
            System.out.println("Would you like to do more calculation Please enter “Y” or “N” :");
            answer = scanner.next().toLowerCase(Locale.ROOT);
        } while (answer.startsWith("y"));
        scanner.close();
    }
}
