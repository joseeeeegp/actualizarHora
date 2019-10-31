package com.example.lesson5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button fecha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fecha=(Button)findViewById(R.id.botoncito);
        fecha.setOnClickListener(this);
        updateTime();
    }

    private void updateTime() {
        fecha.setText(new Date().toString());
    }

    @Override
    public void onClick(View v) {
       updateTime();
    }
}
