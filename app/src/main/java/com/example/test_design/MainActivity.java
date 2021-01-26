package com.example.test_design;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button chats_btn = (Button) findViewById(R.id.chats_btn);
        final Button contacts_btn = (Button) findViewById(R.id.contacts_btn);
        final Button settings_btn = (Button) findViewById(R.id.settings_btn);

        chats_btn.setOnClickListener(this);
        contacts_btn.setOnClickListener(this);
        settings_btn.setOnClickListener(this);
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.chats_btn:
                Intent chats_i = new Intent(MainActivity.this, MainActivity.class);
                startActivity(chats_i);
                break;
            case R.id.contacts_btn:
                Intent contacts_i = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(contacts_i);
                break;
            case R.id.settings_btn:
                Intent settings_i = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(settings_i);
                break;
        }
    }
}
