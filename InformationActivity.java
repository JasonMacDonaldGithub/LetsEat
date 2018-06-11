package com.example.jason.letseat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Jason on 2017-10-31.
 */
public class InformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information);
        String result = getIntent().getExtras().getString("result");
        CreateEstablishment create = new CreateEstablishment();

        Establishment chosenResult = null;
        chosenResult = create.makeEstablishment(result);
        TextView nameField = findViewById(R.id.editText);
        nameField.setText(chosenResult.getName());
    }

    public void onClickInfo(View view){
        Intent HomePageActivity = new Intent(this, HomePageActivity.class);
        startActivity(HomePageActivity);
    }
}
