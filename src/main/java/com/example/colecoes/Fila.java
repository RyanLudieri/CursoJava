package com.example.colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Ana"); // retorna erro caso a fila esteja cheia
        fila.offer("Bia"); // retorna false caso nao consiga adicionar na fila cheia
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        System.out.println(fila.peek());
        System.out.println(fila.peek()); // retorna null quando a fila esta vazia
        System.out.println(fila.element()); // retorna exceção quando a fila esta vazia
        System.out.println(fila.element());



        System.out.println(fila.poll());
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll()); // poll retorna null
        System.out.println(fila.remove()); // remove lança uma exceção

//        fila.size();
//        fila.clear();
//        fila.isEmpty();
//        fila.contains(...);

    }
}
