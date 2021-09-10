package com.example.tarefap1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Enviar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enviar);

        String ano = getIntent().getStringExtra("ano");
        ((TextView) findViewById(R.id.idAno)).setText(ano);
    }

    private TextView resultado;

    public void verificar(View view) {
        EditText ano = (EditText) findViewById(R.id.idAno);

        int valor = Integer.parseInt(ano.getText().toString());

        if ((valor % 4 == 0) && (valor % 100 != 0) && (valor % 400 == 00)) {
            resultado.setText("O ano é Bissexto");
        } else {
            resultado.setText("O ano não é bissexto");
        }
    }
}



