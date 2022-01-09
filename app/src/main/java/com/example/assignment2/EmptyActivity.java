package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.assignment2.model.Product;

public class EmptyActivity extends AppCompatActivity {

    TextView dataProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);

        dataProduct = findViewById(R.id.dataProduct);

        Bundle bundle = getIntent().getExtras();

        Product product = bundle.getParcelable("addProduct");

        dataProduct.setText(product.toString());
    }
}