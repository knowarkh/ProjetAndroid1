package com.example.stuff.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public double convertEuroToBitcoin(double montant){
        double rep = 0;
        double euro = montant;
        double bitcoin = 5442.11;
        if (montant>=0){
            rep = euro/bitcoin;
        }else{
            System.out.println("Valeure impossible");
        }
        return rep;
    }

    public double convertBitcoinToEuro(double montant){
        double rep = 0;
        double bitcoin = montant;
        double euro = 0.00018;
        if (montant>=0){
            rep = bitcoin*euro;
        }else{
            System.out.println("Valeure impossible");
        }
        return rep;
    }

}
