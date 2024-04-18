package jv.practice;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner myNum = new Scanner(System.in)) {
            System.out.println(" --- Selecione um número do menu --- \n");
            System.out.println("#1 - Trbe Lanche \n");
            System.out.println("#2 - McTrbe \n");
            System.out.println("#3 - TrbeWooper \n");
            System.out.println("#4 - X-Trybe \n");
            System.out.println("#5 - Triplo Trybe com JS \n");

            int numero = myNum.nextInt();

            switch (numero) {
                case 1:
                    System.out.println("1 - Trybe Lanche Feliz SELECIONADO \n");
                    break;
                case 2:
                    System.out.println("2 - McTrybe Feliz SELECIONADO \n");
                    break;
                case 3:
                    System.out.println("3 - TrybeWooper SELECIONADO \n");
                    break;
                case 4:
                    System.out.println("4 - X-Trybe SELECIONADO \n");
                    break;
                case 5:
                    System.out.println("5 - Triplo Trybe com JS SELECIONADO \n");
                    break;
                default:
                    System.out.println("Não temos esta opção ainda :( \n");
                    break;
            }
        }
    }
}