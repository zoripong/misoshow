package kr.hs.emirim.uuuuri.haegbook.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import kr.hs.emirim.uuuuri.haegbook.R;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(IntroActivity.this, MainActivity.class);
                intent.putExtra("SHOW NOTIFICATION", true);
                startActivity(intent);
                finish();

            }
        }, 2000);
    }
}