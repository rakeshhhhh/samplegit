package com.example.mark;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.atomic.DoubleAccumulator;

public class MainActivity extends AppCompatActivity {
EditText t1,t2,t3,t4;
TextView v1,v2;
Button b;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t4=findViewById(R.id.t4);
        v1=findViewById(R.id.v1);
        v2=findViewById(R.id.v2);
        b=findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double a=Double.parseDouble(t2.getText().toString());
                Double b=Double.parseDouble(t3.getText().toString());
                Double c=Double.parseDouble(t4.getText().toString());
                Double total=a+b+c;
                Double per=(total/300)*100;
                v1.setText("Total"+total);
                v2.setText("Percentage"+per);
//                Toast.makeText(MainActivity.this,"Total is"+total,Toast.LENGTH_SHORT).show();
//               Toast.makeText(MainActivity.this,"percentage is"+per,Toast.LENGTH_SHORT).show();
                if(per>50){
                    Intent i=new Intent(getApplicationContext(), MainActivity2.class);
          //          #i.putExtra("a",per)
                    startActivity(i);
                }
                else{
                    Intent i1=new Intent(getApplicationContext(), MainActivity3.class);
                    startActivity(i1);
                }
            }
        });

    }
}
