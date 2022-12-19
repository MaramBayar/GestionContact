package com.issat.gestioncontact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    private TextView tvusername;
    private Button btn_add, btn_show, btn_logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tvusername = findViewById(R.id.tv_username_home);
        btn_add = findViewById(R.id.btn_add_home);
        btn_show = findViewById(R.id.btn_show_home);
        btn_logout= findViewById(R.id.btn_logout);

        Intent x = this.getIntent();
        Bundle b = x.getExtras();
        String ph = b.getString("USER");

        tvusername.setText("Hello "+ph);

        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home.this,MainActivity.class);
                startActivity(i);
            }
        });

        btn_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, Show.class);
                startActivity(i);
            }
        });

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, Add.class);
                startActivity(i);
            }
        });
    }
}