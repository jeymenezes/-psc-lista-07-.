package Lista07;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        int contador[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};

        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o salario: ");
            double salario = scanner.nextDouble();

            if (salario <= 299) {
                contador[0]++;
            } else if (salario <= 399) {
                contador[1]++;
            } else if (salario <= 499) {
                contador[2]++;
            } else if (salario <= 599) {
                contador[3]++;
            } else if (salario <= 699) {
                contador[4]++;
            } else if (salario <= 799) {
                contador[5]++;
            } else if (salario <= 899) {
                contador[6]++;
            } else if (salario <= 999) {
                contador[7]++;
            } else {
                contador[8]++;
            }
        }

        scanner.close();

        int a = 200, b = 299;

        for (int i = 0; i < contador.length; i++) {
            if (a >= 1000) {
                System.out.println("$1000 em diante, tem " + contador[i] + " funcionarios.");
            } else {
                System.out.println("$" + a + " - $" + b + " tem " + contador[i] + " funcionarios");
            }

            a += 100;
            b += 100;
        }
    }
}
