package com.example.mamun.customtoasterexample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button topButton,bottomButton,leftButton,rightButton,centerButton,customButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topButton =  (Button) findViewById(R.id.topButton);
        bottomButton =  (Button) findViewById(R.id.bottomButton);
        leftButton =  (Button) findViewById(R.id.leftButton);
        rightButton =  (Button) findViewById(R.id.rightButton);
        centerButton =  (Button) findViewById(R.id.centerButton);
        customButton =  (Button) findViewById(R.id.customButton);

        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                LayoutInflater layoutInflater = getLayoutInflater();

                v = layoutInflater.inflate(R.layout.custom_toast,null);
                Toast toast = new Toast(context);
                toast.setView(v);
                toast.setGravity(Gravity.TOP,0,0);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();



            }
        });

        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                LayoutInflater layoutInflater = getLayoutInflater();

                v= layoutInflater.inflate(R.layout.custom_toast,null);

                Toast toast = new Toast(context);
                toast.setView(v);
                toast.setGravity(Gravity.BOTTOM,0,0);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();
            }
        });
        leftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                LayoutInflater layoutInflater = getLayoutInflater();

                v= layoutInflater.inflate(R.layout.custom_toast,null);

                Toast toast = new Toast(context);
                toast.setView(v);
                toast.setGravity(Gravity.LEFT,0,0);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();
            }
        });

        rightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                LayoutInflater layoutInflater = getLayoutInflater();

                v= layoutInflater.inflate(R.layout.custom_toast,null);

                Toast toast = new Toast(context);
                toast.setView(v);
                toast.setGravity(Gravity.RIGHT,0,0);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();
            }
        });

        centerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                LayoutInflater layoutInflater = getLayoutInflater();

                v= layoutInflater.inflate(R.layout.custom_toast,null);

                Toast toast = new Toast(context);
                toast.setView(v);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();
            }
        });
        customButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                LayoutInflater layoutInflater = getLayoutInflater();

                v= layoutInflater.inflate(R.layout.custom_toast,null);

                Toast toast = new Toast(context);
                toast.setView(v);
                toast.setGravity(Gravity.CENTER,120,120);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();
            }
        });



    }
}
