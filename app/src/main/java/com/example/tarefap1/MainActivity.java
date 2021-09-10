package com.example.tarefap1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calcular(View view) {
        Intent intent = new Intent(this, Enviar.class);
        intent.putExtra("ano", ((EditText) findViewById(R.id.idAno)).getText().toString());

        startActivity(intent);
    }
}