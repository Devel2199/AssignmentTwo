package com.example.nyt;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class CartActivity extends AppCompatActivity {

     public TextView textview;
     public TextView textview2;
     public String aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cart_activity);
      textview = findViewById(R.id.textView);
      textview2 = findViewById(R.id.totalPrice);
      aa = String.valueOf(CartItems.t());

        textview2.setText("Total Price: $" + aa);

        Intent intent = getIntent();

        for (int o=0; o < MainActivity.orderList.size(); o++) {
            textview.setText(textview.getText() + " " + MainActivity.orderList.get(o) + " , "); }

  }

        }




