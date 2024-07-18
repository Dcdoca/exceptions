package com.exceptions.exceptions;

import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1- Listar nomes");
            System.out.println("2- Outra opção");
            System.out.println("3- Sair");

            try {
                option = Integer.parseInt(scanner.nextLine());
                if (option < 1  option > 3) {
                    throw new InvalidOptionException("Opção inválida. Por favor, escolha uma opção entre 1 e 3.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            } catch (InvalidOptionException e) {
                System.out.println(e.getMessage());
            }
        }

        switch (option) {
            case 1:
                listNames(scanner);
                break;
            case 2:
                System.out.println("Outra opção selecionada.");
                break;
            case 3:
                System.out.println("Saindo...");
                break;
        }
    }

    private static void listNames(Scanner scanner) {
        String[] names = {"Lucas", "Enzo", "Eloisa"};
        System.out.println("Escolha um índice para ver o nome correspondente:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(i + "- " + names[i]);
        }

        int index = -1;
        while (true) {
            try {
                index = Integer.parseInt(scanner.nextLine());
                if (index < 0  index >= names.length) {
                    throw new InvalidIndexException("Índice inválido. Por favor, escolha um índice entre 0 e " + (names.length - 1) + ".");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Nome selecionado: " + names[index]);
    }
    class InvalidOptionException extends Exception {
        public InvalidOptionException(String message) {
            super(message);
        }
    }
    
    class InvalidIndexException extends Exception {
        public InvalidIndexException(String message) {
            super(message);
        }
    }
    
}