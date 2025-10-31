package Lista07;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("Telefonou para a vítima?", "Esteve no local do crime?", "Mora perto da vítima?", "Devia para a vítima?", "Já trabalhou com a vítima?");

        int contador = 0;

        Scanner scanner = new Scanner(System.in);

        for (String pergunta : lista) {
            System.out.println(pergunta);
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("Sim")) {
                contador++;
            }
        }

        scanner.close();

        if (contador == 2) {
            System.out.println("Suspeita");
        } else if (contador == 3 || contador == 4) {
            System.out.println("Cúmplice");
        } else if (contador == 5) {
            System.out.println("Assasino");
        } else {
            System.out.println("Inocente");
        }
    }
}
