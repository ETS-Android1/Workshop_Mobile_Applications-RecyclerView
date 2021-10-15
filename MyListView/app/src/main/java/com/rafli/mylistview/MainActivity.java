package com.rafli.mylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.text.DateFormatSymbols;

public class MainActivity extends AppCompatActivity {

    ListView listViewMonth;
    String[] month;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewMonth = findViewById(R.id.lvMonth);
        month = new DateFormatSymbols().getMonths();
        ArrayAdapter<String> monthAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, month);
        listViewMonth.setAdapter(monthAdapter);
        listViewMonth.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String month = adapterView.getItemAtPosition(1).toString();
                Toast.makeText(getApplicationContext(), "Clicked"+month, Toast.LENGTH_SHORT).show();
            }
        });
    }
}