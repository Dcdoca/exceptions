package com.exceptions.exceptions;

import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o dividendo: ");
        double dividendo = scanner.nextDouble();

        System.out.print("Informe o divisor: ");
        double divisor = scanner.nextDouble();

        // Verifica se o divisor é zero para prevenir divisão por zero
        if (divisor == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } else {
            double resultado = dividendo / divisor;
            System.out.println("O resultado da divisão é: " + resultado);
        }

        scanner.close();
    }
}
