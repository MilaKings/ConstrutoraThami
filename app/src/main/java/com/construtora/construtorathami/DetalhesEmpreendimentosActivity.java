package com.construtora.construtorathami;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

import com.construtora.construtorathami.modelo.DadosEmpreendimentos;
import com.construtora.construtorathami.modelo.Empreendimento;

public class DetalhesEmpreendimentosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        int id = intent.getIntExtra(EmpreendimentoAdapter.CHAVE, 0);
        Empreendimento empreendimento = DadosEmpreendimentos.getEmpre(id);

        setContentView(R.layout.activity_detalhes_empreendimentos);

        TextView nome = findViewById(R.id.empreendimento_nome);
        nome.setText(getString(R.string.nome, empreendimento.nome));

        TextView carac = findViewById(R.id.empreendimento_caracteristicas);
        carac.setText(getString(R.string.caracteristicas, empreendimento.caracteristicas));

        TextView data = findViewById(R.id.empreendimento_data_prevista_entrega);
        data.setText(getString(R.string.data_prevista_de_entrega, empreendimento.dataPrevisaEntrega));

        TextView valor = findViewById(R.id.empreendimento_valor);
        valor.setText(getString(R.string.valor, empreendimento.valor));

        TextView prazo = findViewById(R.id.empreendimento_prazo_financeamento);
        prazo.setText(getString(R.string.prazo_de_financiamento, empreendimento.prazoFinanciamento));

        TextView planta = findViewById(R.id.empreendimento_planta);
        planta.setText(getString(R.string.planta, empreendimento.planta));
    }

}
