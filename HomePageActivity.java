package com.example.jason.letseat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.concurrent.ExecutionException;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void onClick(View view) throws ExecutionException, InterruptedException {

        Spinner priceSpinner = (Spinner)findViewById(R.id.spinner);
        String sprice = priceSpinner.getSelectedItem().toString();
        Spinner ratingSpinner = (Spinner)findViewById(R.id.spinner2);
        String rating = ratingSpinner.getSelectedItem().toString();

        Search search = new Search(this);
        String result = search.execute("search", sprice, rating).get();
        Intent informationActivity = new Intent(this, InformationActivity.class);
        informationActivity.putExtra("result", result);
        startActivity(informationActivity);
    }
}
