package com.example.classe;

public class Usuario {
    String nome;

    String email;

    public boolean equals(Object objeto) {

        if (objeto instanceof Usuario){
            Usuario outro = (Usuario) objeto;

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        }else{
            return false;
        }
    }

    //hashcode sera abordado em outra aula
    @Override
    public int hashCode() {
        return this.nome.length();
    }


}
