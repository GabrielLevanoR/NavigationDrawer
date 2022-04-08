package com.example.navigationdrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class ProgressBar extends AppCompatActivity {

    protected boolean nbActivo;
    protected static final int TIMER_RUNTIME = 10000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progress_bar);
        final Thread timerThread = new Thread(){
            @Override
            public void run(){
                nbActivo = true;
                try{
                    int espera1 = 0;
                    while(nbActivo && (espera1 < TIMER_RUNTIME)){
                        sleep(200);
                        if(nbActivo){
                            espera1 += 200;
                        }
                    }
                } catch(InterruptedException e){
                } finally{
                    onContinuar();
                }
            }
        };
        timerThread.start();
    }
    public void onContinuar(){

        startActivity(new Intent("com.example.SegundaActividad"));

    }

}