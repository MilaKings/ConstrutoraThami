package com.construtora.construtorathami.modelo;

import android.support.v7.widget.RecyclerView;

import com.construtora.construtorathami.EmpreendimentoAdapter;

import java.util.ArrayList;
import java.util.List;

public class DadosEmpreendimentos {

    private static Empreendimento empre1 = new Empreendimento(1,
            "Jardim Nascente",
            "2 quartos, 1 cozinha, 2 banheiros, com piscina",
            "12/06/2010",
            "R$ 50000.000",
            "5 anos",
            "pronta",
            "Rua Professora Cremilde de Oliveira, 250");

    private static Empreendimento empre2 = new Empreendimento(2,
            "Sol Brilhante",
            "2 quartos, 1 cozinha, 2 banheiros, com piscina",
            "22/06/2010",
            "R$ 110.000",
            "5 anos",
            "na planta",
            "Rua Luiz Gonzaga Valente, 322");

    private static Empreendimento empre3 = new Empreendimento(3,
            "Lua Cheia",
            "2 quartos, 1 cozinha, 2 banheiros, com piscina",
            "22/06/2010",
            "R$ 1100.000",
            "4 anos",
            "na planta",
            "Servidão Olaires Maria dos Santos, 25");

    private static Empreendimento empre4 = new Empreendimento(4,
            "Via dos Aflores",
            "2 quartos, 1 cozinha, 2 banheiros, com piscina",
            "22/06/2010",
            "R$ 21000.000",
            "5 anos",
            "na planta",
            "Rua Santos Saraiva, 1458, Estreito, Florianópolis");

    private static Empreendimento empre5 = new Empreendimento(5,
            "Terra das Rosas",
            "2 quartos, 1 cozinha, 2 banheiros, com piscina",
            "22/06/2010",
            "R$ 6000.000",
            "3 anos",
            "na planta",
            "R. Eng. Agronômico Andrei Cristian Ferreira, s/n - Trindade");
    

    public static List<Empreendimento> getEmpreList() {
        List<Empreendimento> list = new ArrayList<>();
        list.add(empre1);
        list.add(empre2);
        list.add(empre3);
        list.add(empre4);
        list.add(empre5);

        return list;
    }

    public static Empreendimento getEmpre(int id) {
        switch (id) {
            case 1:
                return empre1;
            case 2:
                return empre2;
            case 3:
                return empre3;
            case 4:
                return empre4;
            case 5:
                return empre5;
            default:
                return null;
        }
    }
}