package com.example.upcoming_series;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1 = (TextView) findViewById(R.id.txtSerie1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String str = intent.getStringExtra("name");
        t1.setText(str);


    }

    public void abrir_tela_novas_series(View V) {
        Intent tela = new Intent(MainActivity.this, tela_novas_series.class);
        startActivity(tela);
    }


}
