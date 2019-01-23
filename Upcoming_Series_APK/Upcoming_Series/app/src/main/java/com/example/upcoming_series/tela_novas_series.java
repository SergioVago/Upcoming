package com.example.upcoming_series;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class tela_novas_series extends AppCompatActivity {

    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_novas_series);

        b = (Button) findViewById(R.id.btn_adicionar);
        final EditText nomeserie = (EditText) findViewById(R.id.inpt_nome_serie);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(tela_novas_series.this, MainActivity.class);
                intent.putExtra("name",nomeserie.getText().toString());
                startActivity(intent);

            }
        });


    }

}

