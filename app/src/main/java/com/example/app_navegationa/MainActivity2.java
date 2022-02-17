package com.example.app_navegationa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        configureBackButton();

    }

    private void configureBackButton() {
        Button backButton = (Button) findViewById(R.id.backButton2);
        backButton.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}