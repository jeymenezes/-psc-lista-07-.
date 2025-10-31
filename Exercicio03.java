package Lista07;

import java.util.*;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);

        List<Double> listaNotas = new ArrayList<>();
        double entrada = 0;

        while (entrada != -1) {
            System.out.println("Digite uma nota (Digite -1 para sair): ");
            entrada = scanner.nextDouble();

            if (entrada != -1) {
                listaNotas.add(entrada);
            }
        }

        scanner.close();

        System.out.println("Quantidade de valores lidos: " + listaNotas.size());
        System.out.println("Valores: " + Arrays.toString(listaNotas.toArray()));

        double soma = 0;

        System.out.println("Valores inverso:");

        for (int i = listaNotas.size() - 1; i >= 0; i--) {
            soma += listaNotas.get(i);

            System.out.println(listaNotas.get(i));
        }

        System.out.println("Soma dos valores: " + soma);
        System.out.println("Média dos valores: " + (soma / listaNotas.size()));

        double contadorMedia = 0, contadorSete = 0;

        for (double valor : listaNotas) {
            if (valor > soma / listaNotas.size()) {
                contadorMedia++;
            }

            if (valor < 7) {
                contadorSete++;
            }
        }

        System.out.println("Valores acima da média: " + contadorMedia);
        System.out.println("Valores abaixo de 7: " + contadorSete);

        System.out.println("O programa foi encerrado!");
    }
}
