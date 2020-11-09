package com.example.viewstub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ViewStub viewStub;
    Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        viewStub=(ViewStub)findViewById(R.id.viewstub);
        try{
            viewStub.inflate();
        }
        catch (Exception e){}
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        try {
            switch (view.getId()) {
                case R.id.button1:
                    viewStub.setVisibility(View.VISIBLE);
                    break;
                case R.id.button2:
                    viewStub.setVisibility(View.INVISIBLE);
                    break;

            }
        }
        catch (Exception e){}

    }
}