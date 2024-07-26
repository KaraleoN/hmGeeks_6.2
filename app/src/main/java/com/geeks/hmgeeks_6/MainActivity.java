package com.geeks.hmgeeks_6;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Spinner categorySpinner;
    private SeekBar priceSeekBar, accessibilitySeekBar;
    private Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categorySpinner = findViewById(R.id.category_spinner);
        priceSeekBar = findViewById(R.id.price_seekbar);
        accessibilitySeekBar = findViewById(R.id.accessibility_seekbar);
        nextButton = findViewById(R.id.next_button);

        // Set up spinner with example data
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.category_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        categorySpinner.setAdapter(adapter);

        // Set up seek bars
        priceSeekBar.setMax(100);
        accessibilitySeekBar.setMax(100);

        // Handle next button click
        nextButton.setOnClickListener(view -> {
            // Handle next button click
        });
    }
}