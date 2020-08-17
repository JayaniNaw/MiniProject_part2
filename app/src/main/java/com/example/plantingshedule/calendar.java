package com.example.plantingshedule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

public class calendar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final DatePicker simpleDatePicker;
        Button submit;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        TextView text2 = findViewById(R.id.title2);
        text2.setText(R.string.ctext);

        TextView text3 = findViewById(R.id.btn2);
        text3.setText(R.string.button2);

        // initiate the date picker and a button
        simpleDatePicker = (DatePicker) findViewById(R.id.simpleDatePicker);
        submit = (Button) findViewById(R.id.btn2);
        // perform click event on submit button
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get the values for day of month , month and year from a date picker
                String day = "Day = " + simpleDatePicker.getDayOfMonth();
                String month = "Month = " + (simpleDatePicker.getMonth() + 1);
                String year = "Year = " + simpleDatePicker.getYear();
                // display the values by using a toast
                Toast.makeText(getApplicationContext(), day + "\n" + month + "\n" + year, Toast.LENGTH_LONG).show();
            }
        });

        Button btntwo = findViewById(R.id.btn2);
        btntwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Calculation.class);
                startActivity(intent);
            }
        });
    }
}