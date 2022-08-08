package com.minhtu.huongdanlamdoan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PhoActivity extends AppCompatActivity {
    TextView tvPho,tvCostPho;
    Button btnBuyPho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pho);

        //Gắn lên giao diện
        tvPho = (TextView) findViewById(R.id.tvPho);
        tvCostPho = (TextView) findViewById(R.id.tvCostPho);
        btnBuyPho = (Button) findViewById(R.id.btnBuyPho);

        //Sử lý sự kiện mua
        btnBuyPho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(PhoActivity.this,"Sản phẩm :"+tvPho.getText()+"\n"+ "Tổng tiền cần thanh toán là :"+tvCostPho.getText(),Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
}