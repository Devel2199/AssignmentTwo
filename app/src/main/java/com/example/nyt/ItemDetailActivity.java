package com.example.nyt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ItemDetailActivity extends AppCompatActivity {
    private TextView headlineTextView;
    private TextView contentTextView;
    private ImageView imageView;
    private TextView summaryView;
    private TextView quantity;
    private Button increase;
    private Button decrease;
    int number = 1;
    private Button addToOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);


        Intent intent = getIntent();


        int itemID = intent.getIntExtra("ItemID", 0);

        MenuItems menuItems = ItemsDatabase.getMenuItemsById(itemID);


        headlineTextView = findViewById(R.id.detailHeadline);
        contentTextView = findViewById(R.id.detailContent);
        imageView = findViewById(R.id.detailImage);
        summaryView = findViewById(R.id.detailSummary);
        increase = findViewById(R.id.add);
        decrease = findViewById(R.id.minus);
        quantity = findViewById(R.id.quantity);
        addToOrder = findViewById(R.id.addOrder);


        quantity.setText("" + number);
        headlineTextView.setText(menuItems.getHeadline());
        contentTextView.setText(menuItems.getContent());
        summaryView.setText(menuItems.getSummary());
        imageView.setImageResource(menuItems.getImageDrawableId());


        addToOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addToCartActivity();
                Toast.makeText(getApplicationContext(),"Item(s) added to Cart, return back Home",Toast.LENGTH_LONG).show();
            }
        });

        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseNumber();
            }
        });

        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decreaseNumber();
            }
        });
    }

    public void increaseNumber() {
        number = number + 1;
        display(number);
    }

    public void decreaseNumber() {
        number = number - 1;
        display(number);
    }

    public void display(int number) {
        TextView displayInteger = findViewById(R.id.quantity);
        displayInteger.setText("" + number);

    }

    public void addToCartActivity() {

        String foodName = (String) headlineTextView.getText();
        String foodPrice = (String) summaryView.getText();
        int price = Integer.parseInt(foodPrice);
        int t = price * number;

        MainActivity.orderList.add(new CartItems(foodName, price, number, t));

        for (int i = 0; i < MainActivity.orderList.size(); i++) {
            System.out.println(MainActivity.orderList.get(i));
        }
        System.out.println(t);




    }


}

