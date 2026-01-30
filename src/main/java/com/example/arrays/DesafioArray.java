package com.example.arrays;

import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Infome a quantidade de notas: ");
        double[] notas = new double[scanner.nextInt()];

        for (int i = 0; i < notas.length; i++){
            System.out.printf("Informe a nota %d: ", i + 1);
            notas[i] = scanner.nextDouble();
        }

        scanner.close();

        double soma = 0;

        for (double nota: notas){
            soma += nota;
        }

        double media = soma / notas.length;
        System.out.println("Media das notas: " + media);


    }
}
