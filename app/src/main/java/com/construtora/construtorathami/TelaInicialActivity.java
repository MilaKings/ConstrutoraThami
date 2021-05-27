package com.construtora.construtorathami;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TelaInicialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);
    }

    public void telaNoticias(View view) {
        Intent intent = new Intent(this, NoticiasActivity.class);
        startActivity(intent);
    }

    public void telaEmpreendimentos(View view) {
        Intent intent = new Intent(this, EmpreendimentosActivity.class);
        startActivity(intent);
    }

    public void telaFaleConosco(View view) {
        Intent intent = new Intent(this, FaleConoscoActivity.class);
        startActivity(intent);
    }

    public void telaSobre(View view){
        Intent intent = new Intent(this, SobreActivity.class);
        startActivity(intent);
    }

}
