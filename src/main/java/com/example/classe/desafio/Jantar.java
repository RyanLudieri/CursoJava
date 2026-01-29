package com.example.classe.desafio;

public class Jantar {
    public static void main(String[] args) {
        Comida c1 = new Comida("Macarrão", 0.400);
        Comida c2 = new Comida("Carne Moída", 0.150);
        Pessoa pessoa = new Pessoa("Ryan", 72.8);

        System.out.println("Peso antes da refeição: " + pessoa.peso + "Kg");
        pessoa.comer(c1);
        pessoa.comer(c2);
        System.out.printf("Novo peso de %s: %.3f Kg", pessoa.nome, pessoa.peso);
    }
}
