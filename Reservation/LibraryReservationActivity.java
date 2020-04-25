package com.hausung.hangil.Reservation;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.hausung.hangil.Map.MapActivity;
import com.hausung.hangil.R;
import com.hausung.hangil.Room;
import com.r0adkll.slidr.Slidr;
import com.r0adkll.slidr.model.SlidrInterface;

import java.util.Calendar;

public class LibraryReservationActivity extends AppCompatActivity {
    private SlidrInterface slidr;

    EditText check_in;
    Button btn;
    DatabaseReference dbRef;
    Room room;
    Button checkin;

    Calendar c;
    DatePickerDialog dp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //스와이프 코드
        slidr = Slidr.attach(this);

        setContentView(R.layout.activity_library_reservation);

        Intent intent = getIntent(); /*데이터 수신*/
        final String name = intent.getExtras().getString("name"); /*String형*/

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

                dp = new DatePickerDialog(LibraryReservationActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int Year, int Month, int Date) {
                        check_in.setText(Date + "/" + (Month+1) + "/" + Year);
                    }

                }, day, month, year);
                dp.show();
            }


        });


        //send data to database  세미나실 현황 페이지로 이동
        room = new Room();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean check = validateForm();
                if (check == true) {
                    ///////////////////////dbRef 주의/////////////////////////
                    dbRef = FirebaseDatabase.getInstance().getReference().child("LibraryRoom");
                    room.setCheckinDate(check_in.getText().toString().trim()); //체크한 날짜
                    dbRef.child(name).setValue(room);
                    ///////////////////////dbRef 주의/////////////////////////
                    Toast.makeText(LibraryReservationActivity.this, "Library Reserved Successfully", Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(LibraryReservationActivity.this, MapActivity.class);
                    startActivity(intent);
                }
            }
        });


    }  private boolean validateForm() {
        String ch_in = check_in.getText().toString();
        if (ch_in.isEmpty()) {
            check_in.setError("Field can't be empty");
            return false;
        } else {
            return true;
        }
    }
}