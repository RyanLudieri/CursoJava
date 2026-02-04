package com.example.colecoes;

import java.util.ArrayList;
import java.util.List;

public class LIsta {
    public static void main(String[] args) {
        ArrayList<Usuario> lista =  new ArrayList<>();

        Usuario u1 = new Usuario("Ana");
        lista.add(u1);

        lista.add(new Usuario("Ryan"));
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Manu"));
        lista.add(new Usuario("Manu"));
        lista.add(new Usuario("Bia"));

        System.out.println(lista.get(3)); // acessar pelo indice

        lista.remove(1);
        lista.remove(new Usuario("Manu"));

        System.out.println("Tem? " + lista.contains(new Usuario("Ana")));

        for(Usuario u: lista){
            System.out.println(u.nome);
        }


    }
}
