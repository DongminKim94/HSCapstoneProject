package com.hausung.hangil.Show;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.hausung.hangil.R;
import com.hausung.hangil.Reservation.SangsangReservationActivity;

public class SangsangSeminarShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sangsang_seminar_show);
        String[] array = {"sangsang_First","sangsang_Second","sangsang_Third"};
        //스터디룸 예약 페이지로 이동
        Button Sangsang_FirsttoReservation = (Button) findViewById(R.id.sangsang_FirsttoReservation);
        Sangsang_FirsttoReservation.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplication(), SangsangReservationActivity.class);
                        intent.putExtra("name","sangsang_First");
                        startActivity(intent);
                    }
                }
        );
        //스터디룸 예약 페이지로 이동
        Button Sangsang_SecondtoReservation = (Button) findViewById(R.id.sangsang_SecondtoReservation);
        Sangsang_SecondtoReservation.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplication(), SangsangReservationActivity.class);
                        intent.putExtra("name","sangsang_Second");
                        startActivity(intent);
                    }
                }
        );
        //스터디룸 예약 페이지로 이동
        Button Sangsang_ThirdtoReservation = (Button) findViewById(R.id.sangsang_ThirdtoReservation);
        Sangsang_ThirdtoReservation.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplication(), SangsangReservationActivity.class);
                        intent.putExtra("name","sangsang_Third");
                        startActivity(intent);
                    }
                }
        );

    }
}
