package com.minhtu.huongdanlamdoan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {
    ImageButton ibtnRice,ibtnPho,ibtnEat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Gắn control lên giao diện
        ibtnRice = (ImageButton) findViewById(R.id.ibtnRice);
        ibtnPho = (ImageButton) findViewById(R.id.ibtnPho);
        ibtnEat = (ImageButton) findViewById(R.id.ibtnEat);

        //Sự kiện điều khiển các imagebutton trên giao diện
        ibtnRice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,RiceActivity.class);
                startActivity(intent);
            }
        });

        ibtnPho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,PhoActivity.class);
                startActivity(intent);
            }
        });

        ibtnEat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,EatActivity.class);
                startActivity(intent);
            }
        });
    }
}