package com.example.oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    List<Item> itens = new ArrayList<>();

    Double obterValorTotal(){
        double total = 0;

        for(Item item: this.itens){
            total += item.qtd * item.produto.preco;
        }
        return total;
    }
}
