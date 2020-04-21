package com.hausung.hangil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.r0adkll.slidr.Slidr;
import com.r0adkll.slidr.model.SlidrInterface;

public class MapActivity extends AppCompatActivity {
    private SlidrInterface slidr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        //스와이프 코드
        slidr = Slidr.attach(this);

        //마이페이지로 이동
        Button toMyPage = (Button) findViewById(R.id.toMyPage);
        toMyPage.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        //MyPageActivity로 가는 인텐트 생성
                        Intent intent = new Intent(getApplication(), MyPageActivity.class);
                        startActivity(intent);
                    }
                }
        );

        //세미나실 현황 페이지로 이동
        Button toSeminarShowPage = (Button) findViewById(R.id.toSeminarShow);
        toSeminarShowPage.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        //SeminarShowActivity로 가는 인텐트 생성
                        Intent intent = new Intent(getApplication(), SeminarShowActivity.class);
                        startActivity(intent);
                    }
                }
        );

    }
}
