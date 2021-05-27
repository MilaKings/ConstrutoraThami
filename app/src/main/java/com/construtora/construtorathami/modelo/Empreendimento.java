package com.construtora.construtorathami.modelo;

import android.support.v7.widget.RecyclerView;

import com.construtora.construtorathami.EmpreendimentoAdapter;

public class Empreendimento {

    public int id;
    public String nome;
    public String caracteristicas;
    public String dataPrevisaEntrega;
    public String valor;
    public String prazoFinanciamento;
    public String planta;
    public String endereco;

    public Empreendimento(int id, String nome, String caracteristicas, String dataPrevisaEntrega, String valor, String prazoFinanciamento, String planta, String endereco) {

        this.id = id;
        this.nome = nome;
        this.caracteristicas =  caracteristicas;
        this.dataPrevisaEntrega = dataPrevisaEntrega;
        this.valor = valor;
        this.prazoFinanciamento = prazoFinanciamento;
        this.planta = planta;
        this.endereco = endereco;

    }

}
