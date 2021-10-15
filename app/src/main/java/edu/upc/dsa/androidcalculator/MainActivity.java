package edu.upc.dsa.androidcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    protected TextView textView;
    private ArrayList<Integer> numsescritos = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.resultado);
    }

    public void onClick1(View v){
        Button bt = (Button)v;
        textView.setText(bt.getText());
    }

    public void onClick2(View v){
        Button bt = (Button)v;
        textView.setText(bt.getText());
    }

    public void onClick3(View v){
        Button bt = (Button)v;
        textView.setText(bt.getText());
    }

    public void onClick4(View v){
        Button bt = (Button)v;
        textView.setText(bt.getText());
    }

    public void onClick5(View v){
        Button bt = (Button)v;
        textView.setText(bt.getText());
    }

    public void onClick6(View v){
        Button bt = (Button)v;
        textView.setText(bt.getText());
    }

    public void onClick7(View v){
        Button bt = (Button)v;
        textView.setText(bt.getText());
    }

    public void onClick8(View v){
        Button bt = (Button)v;
        textView.setText(bt.getText());
    }

    public void onClick9(View v){
        Button bt = (Button)v;
        textView.setText(bt.getText());
    }

    public void onClick0(View v){
        Button bt = (Button)v;
        textView.setText(bt.getText());
    }

    public void operation(View v){
        numsescritos.add(textView.getId());
        Button btoperation = (Button)v;
        textView.setText(btoperation.getText());
    }

}