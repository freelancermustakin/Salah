package com.freelancermustakin.salah;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
import com.freelancermustakin.salah.salahClass.PrayerTimesApp;

@Keep
public class AboutActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        /*TextView tv = findViewById(R.id.about_textview);
        tv.setMovementMethod(new ScrollingMovementMethod());*/
        freelancermustakin();
    }

    private void freelancermustakin() {

    }

    /*@Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(PrayerTimesApp.updateLocale(newBase));
    }*/
}
