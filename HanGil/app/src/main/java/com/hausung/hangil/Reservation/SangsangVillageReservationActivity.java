package com.hausung.hangil.Reservation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.hausung.hangil.Map.MapActivity;
import com.hausung.hangil.R;

public class SangsangVillageReservationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sangsagnvillage_reservation);

        //세미나실 현황 페이지로 이동
        Button confrimAndToMap = (Button) findViewById(R.id.confrimAndToMap);
        confrimAndToMap.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        //MapActivity로 가는 인텐트 생성
                        Intent intent = new Intent(getApplication(), MapActivity.class);
                        //파이어베이스에 정보 저장하기
                        startActivity(intent);
                    }
                }
        );
    }
}