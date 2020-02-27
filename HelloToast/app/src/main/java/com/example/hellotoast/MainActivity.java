package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCounter = 0;
    Button btn;
    TextView txv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btnCount);
        txv = (TextView) findViewById(R.id.txtCount);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter++;
                txv.setText(Integer.toString(mCounter));
            }
        });
    }

    public void HelloToast(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),"HelloToast",Toast.LENGTH_LONG);
        toast.show();
    }
}
