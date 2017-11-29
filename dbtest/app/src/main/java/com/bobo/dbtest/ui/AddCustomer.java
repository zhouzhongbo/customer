package com.bobo.dbtest.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.bobo.dbtest.R;
import com.bobo.dbtest.database.dao.Customer;

/**
 * Created by zzb on 2017/11/29.
 */

public class AddCustomer extends Activity {

    EditText customerName;
    EditText customerPhone;
    EditText addressArea;
    EditText addressDetail;
    Button addContacter;
    LinearLayout tagContainer;
    LinearLayout selftagContainer;
    Button addTag;
    Button editTag;

    public static Customer customer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer_add);
    }


    @Override
    protected void onResume() {
        super.onResume();
    }


    @Override
    protected void onPause() {
        super.onPause();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void init(){
        customerName = (EditText)findViewById(R.id.customer_name);
        customerPhone = (EditText)findViewById(R.id.customer_phone);
        addressArea = (EditText)findViewById(R.id.address_area);
        addressDetail = (EditText)findViewById(R.id.address_detail);

        addContacter = (Button)findViewById(R.id.add_from_contacts);
        addTag = (Button)findViewById(R.id.add_tag);
        editTag = (Button)findViewById(R.id.edit_tag);

        tagContainer = (LinearLayout)findViewById(R.id.tag_container);
        selftagContainer = (LinearLayout)findViewById(R.id.selftag_container);
    }

    public void onClick(View view){
        int id = view.getId();
        switch (id){
            case R.id.add_from_contacts:
                break;
            case R.id.add_tag:
                break;
            case R.id.edit_tag:
                break;
        }
    }



}
