package com.construtora.construtorathami;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FaleConoscoActivity extends AppCompatActivity {

    EditText textoMensagem;
    Button botaoEnviar;
    String mensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fale_conosco);

        textoMensagem = (EditText) findViewById(R.id.txtMensagem);
        botaoEnviar = (Button) findViewById(R.id.botaoEnviar);

        botaoEnviar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                textoMensagem = (EditText) findViewById(R.id.txtMensagem);
                mensagem = textoMensagem.getText().toString();
                enviarEmail(mensagem);
            }
        });
    }

    private void enviarEmail(String mensagem) {
        String[] destinatario = new String[]{"empreendimentos.thami@gmail.com"};
        String assunto = ("Uma mensagem do aplicativo Construtora Thami!");
        Intent emailIntent = new Intent(Intent.ACTION_SEND);

        //seta os textos do destinatário, assunto e corpo do email
        emailIntent.putExtra(Intent.EXTRA_EMAIL, destinatario);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, assunto);
        emailIntent.putExtra(Intent.EXTRA_TEXT, mensagem);

        //indica qual vai ser o tipo de aplicativo utilizado para o envio da mensagem
        emailIntent.setType("message/rfc822");

        //texto da aba que abre perguntando qual aplicativo vai ser utilizado
        startActivity(Intent.createChooser(emailIntent, "Escolha seu aplicativo de e-mail:"));
    }

}
