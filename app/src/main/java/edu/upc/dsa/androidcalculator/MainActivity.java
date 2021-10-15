package edu.upc.dsa.androidcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipboardManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView;
        textView = findViewById(R.id.Pantalla);
    }

    /*public void onClick(View v){
        Button bt = (Button)v;
        textView.setText(bt.getText());
    }*/
}