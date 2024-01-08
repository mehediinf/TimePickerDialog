package com.example.timepickerdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonShow;
    private TextView textView;

    private TimePickerDialog timePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonShow = findViewById(R.id.button_Id);
        textView = findViewById(R.id.textView_Id);

        buttonShow.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        TimePicker timePicker = new TimePicker(this);

        int currentHour = timePicker.getCurrentHour();
        int currentMinute = timePicker.getCurrentMinute();


        timePickerDialog = new TimePickerDialog(MainActivity.this,

                new TimePickerDialog.OnTimeSetListener(){


                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        textView.setText(hourOfDay +":"+ minute);
                    }
                },currentHour,currentMinute,true

        );
        timePickerDialog.show();

    }
}