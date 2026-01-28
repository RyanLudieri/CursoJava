package com.example.classe;

import java.util.Arrays;

public class DataTeste {
    public static void main(String[] args) {
        Data data1 =  new Data();
        data1.dia = 2;
        data1.mes = 7;
        data1.ano = 2003;

        Data data2 = new Data();
        data2.dia = 20;
        data2.mes = 2;
        data2.ano = 2004;

        String dataFormatada1 = (data1.dia + "/" + data1.mes + "/" + data1.ano);
        String dataFormatada2 = (data2.dia + "/" + data2.mes + "/" + data2.ano);

        System.out.println(dataFormatada1);
        System.out.println(dataFormatada2);

    }
}
