package com.example.colecoes;

import java.util.*;

public class ConjuntoComportado {
    public static void main(String[] args) {
        //Set<String> listaAprovados = new HashSet<>();
        SortedSet<String> listaAprovados = new TreeSet<>();
        //LinkedHashSet<String> listaAprovados = new LinkedHashSet<>();

        listaAprovados.add("Ryan");
        listaAprovados.add("Gabriela");
        listaAprovados.add("Pedro");
        listaAprovados.add("Lucas");

        for(String candidato: listaAprovados){
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>();

        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(160);

        for(int n: nums){
            System.out.println(n);
        }

    }
}
