package com.example.justjava;


import android.os.Bundle;
/*import android.support.v7.app.AppCompatActivity;*/
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

      int  quantity = 0;       //Global variable which is outside of all the methods

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // This method is called when the plus button is clicked.
    public void increment(View view) {
       // int  quantity = 2;
        quantity = quantity + 1;
       /* quantity = 2 * quantity + quantity;
        quantity = quantity + 2 ;
        quantity = quantity * quantity / 5; */
        display( quantity );

    }

    //This method is called when the minus button is clicked.
    public void decrement(View view) {
       // int  quantity = 2;
        quantity = quantity - 1;
        display( quantity );

    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
      //  int  quantity = 5;
       // display(quantity );
        displayPrice(quantity * 5);
    }



    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}