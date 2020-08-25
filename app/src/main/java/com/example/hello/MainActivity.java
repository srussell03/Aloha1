package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.hello.R;

public class MainActivity extends AppCompatActivity {
    private TextView greetingTextView;
    private boolean isHello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        greetingTextView = (TextView) findViewById(R.id.textView3);
        initializeGreeting();
    }
    private void initializeGreeting()
    {
        isHello = true;
    }
    public void changeGreeting(View v)
    {
        if(isHello)
        {
            isHello = false;
            greetingTextView.setText(R.string.goodbye);
        }
        else
        {
            isHello = true;
            greetingTextView.setText(R.string.hello);
        }
    }
}