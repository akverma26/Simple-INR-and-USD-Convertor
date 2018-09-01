package com.ankitkumar.currencyconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    int k=0;
    Double x=0.0143193420690715049984;
    String s="$ ";

    public void convert(View view) {
        EditText amountstr = (EditText)findViewById(R.id.amount);
        Double amount = Double.parseDouble(amountstr.getText().toString());
        amount=amount*x;
        Toast.makeText(MainActivity.this, s + String.format("%.3f",amount) , Toast.LENGTH_LONG).show();
    }

    public void invert(View view) {
        ImageView im=(ImageView) findViewById(R.id.ruImageView);
        ImageView im2=(ImageView) findViewById(R.id.dolImageView);
        if(k==0) {
            k=1;
            im.setImageResource(R.drawable.dol);
            im2.setImageResource(R.drawable.ru);
            x=69.8377363254000071213056;
            s="₹ ";
        }
        else {
            k=0;
            im.setImageResource(R.drawable.ru);
            im2.setImageResource(R.drawable.dol);
            x=0.0143193420690715049984;
            s="$ ";
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
