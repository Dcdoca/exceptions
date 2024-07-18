package com.exceptions.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

// Exceção personalizada para divisão por zero
class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

// Exceção personalizada para opção inválida no menu
class InvalidOptionException extends Exception {
    public InvalidOptionException(String message) {
        super(message);
    }
}

// Exceção personalizada para índice inválido na escolha de nomes
class InvalidIndexException extends Exception {
    public InvalidIndexException(String message) {
        super(message);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                showMenu(scanner);
            } catch (InvalidOptionException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // Exibe o menu e solicita a opção do usuário
    public static void showMenu(Scanner scanner) throws InvalidOptionException {
        System.out.println("Menu:");
        System.out.println("1 - Escolher nome");
        System.out.println("2 - Fazer divisão");
        System.out.println("3 - Sair");
        System.out.print("Escolha uma opção: ");
        int option;
        try {
            option = scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.next(); // Limpa o scanner
            throw new InvalidOptionException("Opção inválida! Por favor, insira um número inteiro.");
        }

        switch (option) {
            case 1:
                chooseName(scanner);
                break;
            case 2:
                divideNumbers(scanner);
                break;
            case 3:
                System.out.println("Saindo...");
                System.exit(0);
            default:
                throw new InvalidOptionException("Opção inválida! Por favor, escolha uma opção entre 1 e 3.");
        }
    }
 //private static void chooseName(Scanner scanner) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'chooseName'");
   // }

//private static void divideNumbers(Scanner scanner) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'divideNumbers'");
   // }

// Método que seleciona um nome e lança exceção se o índice for inválido
 public static String selectName(String[] names, int index) throws InvalidIndexException {
    if (index < 0 || index >= names.length) {
        throw new InvalidIndexException("Erro: Índice inválido. Por favor, escolha um índice válido.");
    }
    return names[index];
}
}

//}
