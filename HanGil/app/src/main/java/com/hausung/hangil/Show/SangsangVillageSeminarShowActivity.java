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
        setContentView(R.layout.activity_sangsagnvillage_seminar_show);

        //세미나실 예약 페이지로 이동
        Button toReservationPage = (Button) findViewById(R.id.toReservation);
        toReservationPage.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        //ReservationActivity로 가는 인텐트 생성
                        Intent intent = new Intent(getApplication(), SangsangVillageReservationActivity.class);

                        startActivity(intent);
                    }
                }
        );
    }
}
