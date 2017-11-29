package com.bobo.dbtest.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.bobo.dbtest.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClick(View v){
        int id = v.getId();
        switch (id){
            case R.id.viewc:
                Intent mintent = new Intent(this,CustomerListActivity.class);
                mintent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(mintent);
                break;

            case R.id.addc:
                Intent mintent2 = new Intent(this,AddCustomer.class);
                mintent2.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(mintent2);
                break;
        }
    }
}
