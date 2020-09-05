package com.valchan.mapaprog2;

import java.util.ArrayList;

public class Senha {
    String tipo;
    Integer numero;
    
    public Senha() {}

    public Senha(String tipo, int numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return this.tipo + "-" + this.numero;
    }
    
    public void setSenha(ArrayList list, String tipo) {
        this.tipo = tipo;
        this.numero = list.size();
        int i = list.size();
        Boolean hasEqual;
        do {
            i++;
            this.numero = i;
            hasEqual = list.contains(this.toString());
        } while(hasEqual);
        list.add(this.toString());
    }
}
