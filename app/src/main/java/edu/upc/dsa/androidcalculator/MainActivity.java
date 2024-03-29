package edu.upc.dsa.androidcalculator;

import static java.lang.StrictMath.cos;
import static java.lang.StrictMath.sin;
import static java.lang.StrictMath.tan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    protected TextView textView;
    private ArrayList<CharSequence> numsescritos = new ArrayList<CharSequence>();
    private ArrayList<Integer> operacion = new ArrayList<Integer>();
    int n = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.resultado);
        textView.setText("");
    }

    public void onClick(View v){
        if (n == 1){
            textView.setText("");
            n = 0;
        }
        Button bt = (Button)v;
        textView.setText(textView.getText().toString()+bt.getText());
    }

    public void operation(View v){
        CharSequence num = textView.getText();
        numsescritos.add(num);
        Button btoperation = (Button)v;
        textView.setText("");
        operacion.add(btoperation.getId());
    }

    public void Equal(View v){
        CharSequence num = textView.getText();
        numsescritos.add(num);
        n = 1;
        if (operacion.get(0)==R.id.suma){
            CharSequence num1c = numsescritos.get(0);
            CharSequence num2c = numsescritos.get(1);
            int num1 = Integer.parseInt((String) num1c);
            int num2 = Integer.parseInt((String) num2c);
            int resultint = num1 + num2;
            String result = Integer. toString(resultint);
            textView.setText(result);
        }
        if (operacion.get(0)==R.id.resta){
            CharSequence num1c = numsescritos.get(0);
            CharSequence num2c = numsescritos.get(1);
            int num1 = Integer.parseInt((String) num1c);
            int num2 = Integer.parseInt((String) num2c);
            int resultint = num1 - num2;
            String result = Integer. toString(resultint);
            textView.setText(result);
        }
        if (operacion.get(0)==R.id.mult){
            CharSequence num1c = numsescritos.get(0);
            CharSequence num2c = numsescritos.get(1);
            int num1 = Integer.parseInt((String) num1c);
            int num2 = Integer.parseInt((String) num2c);
            int resultint = num1*num2;
            String result = Integer. toString(resultint);
            textView.setText(result);
        }
        if (operacion.get(0)==R.id.div){
            CharSequence num1c = numsescritos.get(0);
            CharSequence num2c = numsescritos.get(1);
            double num1 = Double.parseDouble((String) num1c);
            double num2 = Double.parseDouble((String) num2c);
            double resultdoub = num1 / num2;
            String result = Double. toString(resultdoub);
            textView.setText(result);
        }
        if (operacion.get(0)==R.id.sin){
            CharSequence num1c = numsescritos.get(0);
            double num1 = Double.parseDouble((String) num1c);
            double resultdoub = sin(num1);
            String result = Double. toString(resultdoub);
            textView.setText(result);
        }
        if (operacion.get(0)==R.id.cos){
            CharSequence num1c = numsescritos.get(0);
            double num1 = Double.parseDouble((String) num1c);
            double resultdoub = cos(num1);
            String result = Double. toString(resultdoub);
            textView.setText(result);
        }
        if (operacion.get(0)==R.id.tan){
            CharSequence num1c = numsescritos.get(0);
            double num1 = Double.parseDouble((String) num1c);
            double resultdoub = tan(num1);
            String result = Double. toString(resultdoub);
            textView.setText(result);
        }
        numsescritos.clear();
        operacion.clear();
    }
    public void clear(View v){
        numsescritos.clear();
        operacion.clear();
        textView.setText("");
    }
}