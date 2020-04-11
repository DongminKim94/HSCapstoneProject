package com.hausung.hangil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class MyPageSecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage_second);

        //로그아웃 및 로그인 페이지로 이동
        Button logoutAndToStartPage = (Button) findViewById(R.id.logoutAndToStart);
        logoutAndToStartPage.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        //로그아웃 코드 구현
                        FirebaseAuth.getInstance().signOut();
                        //SeminarShowActivity로 가는 인텐트 생성
                        Intent intent = new Intent(getApplication(), StartActivity.class);
                        startActivity(intent);
                    }
                }
        );

        //버전 정보 페이지로 이동
        Button toVersionView = (Button) findViewById(R.id.toVersionView);
        toVersionView.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        //SeminarShowActivity로 가는 인텐트 생성
                        Intent intent = new Intent(getApplication(), VersionViewActivity.class);

                        startActivity(intent);
                    }
                }
        );

        //회원탈퇴 및 로그인 페이지로 이동
        Button deleteAndToStart = (Button) findViewById(R.id.deleteAndToStart);
        deleteAndToStart.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        //SeminarShowActivity로 가는 인텐트 생성
                        Intent intent = new Intent(getApplication(), StartActivity.class);
                        //회원탈퇴 코드 구현
                        startActivity(intent);
                    }
                }
        );
    }
}
