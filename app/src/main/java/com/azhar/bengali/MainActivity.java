package com.azhar.bengali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        NumberClickListener clickListener = new NumberClickListener();
//
//        TextView numbers = findViewById(R.id.numbers);
//        numbers.setOnClickListener(clickListener);

        TextView family = findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(intent);
            }
        });
    }


    public void goToPhrasesActivity(View view){
        Intent intent = new Intent(this, PharsesActivity.class);
        startActivity(intent);
    }

    public void goToColorsActivity(View view){
        Intent intent = new Intent(this, ColorsActivity.class);
        startActivity(intent);
    }

//    public void goToFamilyActivity(View view){
//        Intent intent = new Intent(this, FamilyActivity.class);
//        startActivity(intent);
//    }

    public void goToNumbersActivity(View view){
        Intent intent = new Intent(this, NumbersActivity.class);
        startActivity(intent);
    }
}