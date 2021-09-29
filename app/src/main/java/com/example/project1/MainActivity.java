package com.example.project1;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn;
TextView edt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btnClick);
        edt = findViewById(R.id.viewWinner);
        Bundle a = getIntent().getExtras();
        if(a!=null){ edt.setText(a.get("Win").toString());}
        btn.setOnClickListener(view -> {
            Toast.makeText(MainActivity.this, "Welcome", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
           intent.putExtra("Value",edt.getText().toString());
            startActivity(intent);


        });
    } //архитектура проекта
}
