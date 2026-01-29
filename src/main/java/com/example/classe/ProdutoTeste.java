package com.example.classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook");
        p1.preco = 4300.89;
        //p1.desconto = 0.25;

        var p2 = new Produto();
        p2.nome = "Caneta";
        p2.preco = 10.00;
        //p2.desconto = 0.29;

        var p3 = new Produto("Agua", 5.00);

        System.out.println(p1.nome);
        System.out.println(p2.nome);
        System.out.println(p3.nome);

        System.out.println(Produto.desconto);
        Produto.desconto = 0.3;
        System.out.println(Produto.desconto);

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1);
        double precoFinal3 = p3.precoComDesconto();

        System.out.println(precoFinal1);
        System.out.println(precoFinal2);
        System.out.println(precoFinal3);
        double mediaCarrinho = ((precoFinal1 + precoFinal2 + precoFinal3) / 3);
        System.out.printf("Media do carrinho: = R$%.2f.", mediaCarrinho);

    }
}
