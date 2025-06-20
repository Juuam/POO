package CalculaDouble;

import java.util.Scanner;

public class SomaDouble{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Linha 1
        CalcularDouble calculadora = new CalcularDouble(); // Linha 2

        System.out.println("Digite o primeiro número:"); // Linha 3
        double numero1 = scanner.nextDouble(); // Linha 4

        System.out.println("Digite o segundo número:"); // Linha 5
        double numero2 = scanner.nextDouble(); // Linha 6

        double soma = calculadora.somar(numero1, numero2); // Linha 7

        System.out.println("A soma é: " + soma); // Linha 8

        scanner.close(); // Linha 9
    }
}