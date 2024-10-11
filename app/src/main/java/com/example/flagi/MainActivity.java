package com.example.flagi;

import static com.example.flagi.R.id.textViewPolecenie;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int licznik = 0;
    private TextView textViewPolecenie;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewPolecenie = findViewById(R.id.textViewPolecenie);
    }

    public void dobraOdpowiedz(View view) {
        view.setVisibility(View.INVISIBLE);
        licznik++;
        if(licznik == 4){
            textViewPolecenie.setText(R.string.podsumowanie);
        }
    }

    public void zlaOdpowiedz(View view) {
        Toast.makeText(this, R.string.info, Toast.LENGTH_SHORT).show();
    }
}