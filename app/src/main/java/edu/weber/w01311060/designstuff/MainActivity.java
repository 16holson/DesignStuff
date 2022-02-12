package edu.weber.w01311060.designstuff;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btn = findViewById(R.id.btnLaunch);
        TextView timerText = findViewById(R.id.timerText);
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                FireMissilesDialog dialog = new FireMissilesDialog();
                dialog.setCancelable(false);
                dialog.show(getSupportFragmentManager(), "FireDialog");
            }
        });

        CountDownTimer timer = new CountDownTimer(10000, 1000)
        {
            @Override
            public void onTick(long l)
            {
                timerText.setText("Time remaining: " + l/1000);
            }

            @Override
            public void onFinish()
            {
                timerText.setText("Timer Complete");
                FireMissilesDialog dialog = new FireMissilesDialog();
                dialog.setCancelable(false);
                dialog.show(getSupportFragmentManager(), "FireDialog");
            }
        }.start();
    }



}