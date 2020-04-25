package com.hausung.hangil;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.hausung.hangil.Map.MapActivity;
import com.r0adkll.slidr.Slidr;
import com.r0adkll.slidr.model.SlidrInterface;

import java.util.Calendar;

public class ReservationActivity extends AppCompatActivity {
        private SlidrInterface slidr;

        EditText check_in;
        Button btn;
        Room room;
        Button checkin;

        Calendar c;
        DatePickerDialog dp;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            //스와이프 코드
            slidr = Slidr.attach(this);

            setContentView(R.layout.activity_reservation);

            check_in = findViewById(R.id.checkinText);
            btn = findViewById(R.id.confrimAndToMap);

            checkin = (Button) findViewById(R.id.checkin);

            Calendar calendar = Calendar.getInstance();

            checkin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    c = Calendar.getInstance();
                    int day = c.get(Calendar.DAY_OF_MONTH);
                    int month = c.get(Calendar.MONTH);
                    int year = c.get(Calendar.YEAR);

                    dp = new DatePickerDialog(ReservationActivity.this, new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker datePicker, int Year, int Month, int Date) {

                            check_in.setText(Date + "/" + (Month+1) + "/" + Year);
                        }

                    }, day, month, year);

                    dp.show();
                }


            });

            //send data to database
            room = new Room();

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    boolean check = validateForm();

                    if (check == true) {

                        Toast.makeText(ReservationActivity.this, "Reserved Successfully", Toast.LENGTH_LONG).show();

                        Intent intent = new Intent(ReservationActivity.this, MapActivity.class);
                        startActivity(intent);
                    }

                }
            });

    }

        private boolean validateForm() {

            String ch_in = check_in.getText().toString();

            if (ch_in.isEmpty()) {
                check_in.setError("Field can't be empty");
                return false;
            } else {
                return true;
            }
        }}




