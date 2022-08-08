package com.minhtu.huongdanlamdoan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class RiceActivity extends AppCompatActivity {
    TextView tvRice,tvCostRice;
    Button btnBuyRice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rice);

        //Gắn lên giao diện
        tvRice = (TextView) findViewById(R.id.tvRice);
        tvCostRice = (TextView) findViewById(R.id.tvCostRice);
        btnBuyRice = (Button) findViewById(R.id.btnBuyRice);

        //Sử lý sự kiện mua
        btnBuyRice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(RiceActivity.this,"Sản phẩm :"+tvRice.getText()+"\n"+ "Tổng tiền cần thanh toán là :"+tvCostRice.getText(),Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }

}