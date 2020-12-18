package com.azhar.bengali;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class NumberClickListener implements View.OnClickListener {

    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(), "Open the list of number", Toast.LENGTH_LONG).show();
    }

}
