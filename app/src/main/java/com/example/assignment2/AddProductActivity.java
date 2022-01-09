package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.assignment2.model.Product;

public class AddProductActivity extends AppCompatActivity {

    Button btn, resetBtn;
    Spinner currencySp, productTypeSp, daysp, monthSp, yearSp;
    EditText productNameEd, productPriceEd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);

        btn = findViewById(R.id.addProductbtn);
        resetBtn = findViewById(R.id.resetBtn);
        currencySp = findViewById(R.id.currencysp);
        productTypeSp = findViewById(R.id.productTypeSp);
        daysp = findViewById(R.id.daysp);
        monthSp = findViewById(R.id.monthSp);
        yearSp = findViewById(R.id.yearSp);
        productNameEd = findViewById(R.id.productNameEd);
        productPriceEd = findViewById(R.id.productPriceEd);

        btn.setOnClickListener(v -> {

            String productName = productNameEd.getText().toString();
            String productPrice = productPriceEd.getText().toString();
            String currency = (String) currencySp.getSelectedItem();
            String productType = (String) productTypeSp.getSelectedItem();
            String day = (String) daysp.getSelectedItem();
            String month = (String) monthSp.getSelectedItem();
            String year = (String) yearSp.getSelectedItem();

            Product product = new Product(productName, productPrice, currency, productType, day, month, year);

            Intent i = new Intent(AddProductActivity.this, EmptyActivity.class);
            i.putExtra("addProduct", product);
            startActivity(i);

        });

        resetBtn.setOnClickListener(v -> {
            productNameEd.setText("");
            productPriceEd.setText("");
            currencySp.setSelection(0);
            productTypeSp.setSelection(0);
            daysp.setSelection(0);
            monthSp.setSelection(0);
            yearSp.setSelection(0);
        });
    }
}