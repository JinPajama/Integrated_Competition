package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

public class UserActivity extends AppCompatActivity {

    @Override
    public void setContentView(View view) {
        super.setContentView(R.layout.user_activity);
        setResult(200);
    }

}
