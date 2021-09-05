package com.example.languageapp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import android.os.Bundle;

public class NumberClickListener implements View.OnClickListener {

    @Override
   public void onClick(View view)
    {
        Toast.makeText(view.getContext(), "Open the list of numbers",Toast.LENGTH_SHORT).show();
    }
}