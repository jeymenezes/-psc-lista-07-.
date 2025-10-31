package Lista07;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> lista = new ArrayList<>();
        String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" };

        for (int i = 0; i < 12; i++) {
            System.out.println("Digite a temperatura do mês " + (i + 1) + ": ");
            lista.add(scanner.nextDouble());
        }

        scanner.close();

        double soma = 0;

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i) + " - " + meses[i]);
            soma += lista.get(i);
        }

        System.out.println(soma / lista.size());
    }
}
