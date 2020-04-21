package com.hausung.hangil.Reservation;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

<<<<<<< HEAD:HanGil/app/src/main/java/com/hausung/hangil/Reservation/MoreActivity.java
import com.hausung.hangil.R;
=======
import com.r0adkll.slidr.Slidr;
import com.r0adkll.slidr.model.SlidrInterface;
>>>>>>> 73f90ddbb5068dfec5836d7f75f1aa28f587447c:HanGil/app/src/main/java/com/hausung/hangil/MoreActivity.java

public class MoreActivity extends AppCompatActivity {
    private SlidrInterface slidr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);

        //스와이프 코드
        slidr = Slidr.attach(this);
    }
}
