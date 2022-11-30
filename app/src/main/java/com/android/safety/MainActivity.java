package com.android.safety;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.android.safety.databinding.ActivityLoginBinding;
import com.android.safety.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        handleClickListeners();
    }

    private void handleClickListeners() {
        binding.layoutHeader.ivBack.setOnClickListener(view -> {
            finish();
        });
        binding.btnShuttleSchedule.setOnClickListener(view -> {
            Intent startShuttle = new Intent(this, ShuttleScheduleActivity.class);
            startActivity(startShuttle);
        });
    }
}