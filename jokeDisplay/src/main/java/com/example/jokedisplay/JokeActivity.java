package com.example.jokedisplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.jokedisplay.databinding.ActivityJokeBinding;

public class JokeActivity extends AppCompatActivity {

    private String jokeResult;

    private ActivityJokeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityJokeBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent dataReceivedFromJavaLibrary = getIntent();
        jokeResult = dataReceivedFromJavaLibrary.getStringExtra("JOKE_PROVIDER_DATA");

        binding.displayJokeTextView.setText(jokeResult);
    }
}
