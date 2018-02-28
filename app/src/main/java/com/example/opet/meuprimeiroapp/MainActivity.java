package com.example.opet.meuprimeiroapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textResultado;
    private EditText editNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textResultado = findViewById(R.id.textResultado);
        editNome = findViewById(R.id.editNome);
    }


    public void click(View v){
        String data = editNome.getText().toString();
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
    }
}
