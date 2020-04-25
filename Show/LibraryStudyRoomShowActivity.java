package com.hausung.hangil.Show;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.hausung.hangil.R;
import com.hausung.hangil.Reservation.LibraryReservationActivity;

public class LibraryStudyRoomShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_librarystudyroom_show);
        String[] array = {"library_First","library_Second","library_Thrid"};
        //스터디룸 예약 페이지로 이동
        Button library_FirsttoReservation = (Button) findViewById(R.id.library_FirsttoReservation);
        library_FirsttoReservation.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        // LibraryReservationActivity로 가는 인텐트 생성
                        Intent intent = new Intent(getApplication(), LibraryReservationActivity.class);
                        intent.putExtra("name","library_First");
                        startActivity(intent);
                    }
                }
        );
        //스터디룸 예약 페이지로 이동
        Button library_SecondtoReservation = (Button) findViewById(R.id.library_SecondtoReservation);
        library_SecondtoReservation.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        // LibraryReservationActivity로 가는 인텐트 생성
                        Intent intent = new Intent(getApplication(), LibraryReservationActivity.class);
                        intent.putExtra("name","library_Second");
                        startActivity(intent);
                    }
                }
        );
        //스터디룸 예약 페이지로 이동
        Button library_ThirdtoReservation = (Button) findViewById(R.id.library_ThirdtoReservation);
        library_ThirdtoReservation.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        // LibraryReservationActivity로 가는 인텐트 생성
                        Intent intent = new Intent(getApplication(), LibraryReservationActivity.class);
                        intent.putExtra("name","library_Thrid");
                        startActivity(intent);
                    }
                }
        );
    }
}
