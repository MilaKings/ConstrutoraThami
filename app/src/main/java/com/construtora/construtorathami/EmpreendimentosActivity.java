package com.construtora.construtorathami;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
;import com.construtora.construtorathami.modelo.DadosEmpreendimentos;

public class EmpreendimentosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_empreendimentos);

        RecyclerView listaTelaEmpreendimentos = findViewById(R.id.lista_tela_empreendimentos);
        EmpreendimentoAdapter adapter = new EmpreendimentoAdapter(this, DadosEmpreendimentos.getEmpreList());
        listaTelaEmpreendimentos.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();

        // Inflate the menu; this adds items to the action bar if it is present.
        inflater.inflate(R.menu.menu_tela_empreendimentos, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_mapa:
                Intent vaiParaMapa = new Intent(this, MapaActivity.class);
                startActivity(vaiParaMapa);
                break;

            case R.id.menu_youtube:
                Intent vaiParaYoutube = new Intent(this, YoutubeActivity.class);
                startActivity(vaiParaYoutube);
                break;
        }


        return super.onOptionsItemSelected(item);
    }

}
