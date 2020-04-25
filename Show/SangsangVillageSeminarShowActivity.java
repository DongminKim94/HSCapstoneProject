package com.hausung.hangil.Show;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.hausung.hangil.R;
import com.hausung.hangil.Reservation.SangsangVillageReservationActivity;

public class SangsangVillageSeminarShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sangsangvillage_seminar_show);
        String[] array = {"sangsangVillage_First","sangsangVillage_Second","sangsangVillage_Third"};
        //스터디룸 예약 페이지로 이동
        Button SangsangVillage_FirsttoReservation = (Button) findViewById(R.id.sangsangVillage_FirsttoReservation);
        SangsangVillage_FirsttoReservation.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplication(), SangsangVillageReservationActivity.class);
                        intent.putExtra("name","sangsangVillage_First");
                        startActivity(intent);
                    }
                }
        );
        //스터디룸 예약 페이지로 이동
        Button SangsangVillage_SecondtoReservation = (Button) findViewById(R.id.sangsangVillage_SecondtoReservation);
        SangsangVillage_SecondtoReservation.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplication(), SangsangVillageReservationActivity.class);
                        intent.putExtra("name","sangsangVillage_Second");
                        startActivity(intent);
                    }
                }
        );
        //스터디룸 예약 페이지로 이동
        Button SangsangVillage_ThirdtoReservation = (Button) findViewById(R.id.sangsangVillage_ThirdtoReservation);
        SangsangVillage_ThirdtoReservation.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplication(), SangsangVillageReservationActivity.class);
                        intent.putExtra("name","sangsangVillage_Third");
                        startActivity(intent);
                    }
                }
        );

    }
}
