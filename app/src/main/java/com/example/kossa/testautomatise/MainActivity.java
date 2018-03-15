package com.example.kossa.testautomatise;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.example.kossa.testautomatise.R.id;
import static com.example.kossa.testautomatise.R.layout;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        btn1=(Button) findViewById(id.btn1);
        btn2=(Button) findViewById(id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext()," Vous avez cliquer sur le premier bouton ",Toast.LENGTH_LONG).show();

            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}
