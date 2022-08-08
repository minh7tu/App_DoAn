package com.minhtu.huongdanlamdoan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class EatActivity extends AppCompatActivity {
    TextView tvEat,tvCostEat;
    Button btnBuyEat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat);

        //Gắn dữ liệu lên giao diện
        tvEat = (TextView) findViewById(R.id.tvEat);
        tvCostEat = (TextView) findViewById(R.id.tvCostEat);
        btnBuyEat = (Button) findViewById(R.id.btnBuyEat);

        //Xử lý sự kiện khi nhấn button mua
        btnBuyEat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(EatActivity.this,"Sản phẩm :"+tvEat.getText()+"\n"+ "Tổng tiền cần thanh toán là :"+tvCostEat.getText(),Toast.LENGTH_LONG);
                toast.show();
            }
        });

    }
}