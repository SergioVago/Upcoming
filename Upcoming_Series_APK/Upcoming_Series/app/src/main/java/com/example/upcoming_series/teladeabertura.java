package com.example.upcoming_series;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class teladeabertura extends Activity {

    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teladeabertura);

        Incia_Splash();

    }

    public void Incia_Splash () {
        setContentView(R.layout.activity_teladeabertura);

        new Thread(new Runnable() {

            @Override
            public void run() {

                counter++;

                try {
                    while (counter == 1 || counter <= 5){
                        Thread.sleep(1000);
                        counter++;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (counter == 6) {

                    Intent it = new Intent(teladeabertura.this, MainActivity.class);
                    startActivity(it);

                    counter++;

                }

            }
        }).start();

    }
}
