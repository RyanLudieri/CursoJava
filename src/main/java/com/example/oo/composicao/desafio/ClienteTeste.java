package com.example.oo.composicao.desafio;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        Compra compra1 = new Compra();
        Compra compra2 = new Compra();

        cliente.compras.add(compra1);
        cliente.compras.add(compra2);

        Item item1 = new Item(2);
        Item item2 = new Item(3);
        Item item3 = new Item(4);
        Item item4 = new Item(1);

        compra1.itens.add(item1);
        compra1.itens.add(item2);
        compra2.itens.add(item3);
        compra2.itens.add(item4);

        item1.produto = new Produto("Caneta", 5.0);
        item2.produto = new Produto("Lapis", 3.0);
        item3.produto = new Produto("Caderno", 25.0);
        item4.produto = new Produto("Mochila", 100.0);

        System.out.println("Valor da compra1: " + compra1.obterValorTotal());
        System.out.println("Valor da compra2: " + compra2.obterValorTotal());

        System.out.println("Total gasto pelo cliente: " + cliente.obterValorTotal());
    }
}
