package com.example.oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    List<Compra> compras = new ArrayList<>();

    Double obterValorTotal(){
        double total = 0;

        for(Compra compra: this.compras){
            total += compra.obterValorTotal();
        }

        return total;
    }
}
