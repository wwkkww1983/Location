package com.location.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.location.R;

public class ModifyIndexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify_index);
    }

    public void btnPerson(View view){
        Intent intent = new Intent(this, ModifyActivity.class);
        intent.putExtra("mode", "person");
        startActivity(intent);
    }

    public void btnLocation(View view){
        Intent intent = new Intent(this, ModifyActivity.class);
        intent.putExtra("mode", "location");
        startActivity(intent);
    }


}
