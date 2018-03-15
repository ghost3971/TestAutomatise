package com.example.kossa.testautomatise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    Button btn1;
    EditText txt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn1=(Button) findViewById(R.id.btn3);
        txt=(EditText) findViewById(R.id.txt);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nom=txt.getText().toString();
                if (nom.equals(""))
                    Toast.makeText(getApplicationContext(),"Désolé !!!\n la zone de saisie est vide .",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(),"Bonjour et bienvenue à vous "+nom,Toast.LENGTH_LONG).show();
            }
        });
    }


    public void test(){

    }
}
