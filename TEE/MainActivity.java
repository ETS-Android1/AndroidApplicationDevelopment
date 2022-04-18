package com.example.aad_tee_j074;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRead, btnInsert, btnDelete, btnUpdate;
        ListView listView;
        EditText edtId, edtName, edtPhone;

        btnInsert = findViewById(R.id.btnInsert);
        btnRead = findViewById(R.id.btnRead);
        btnDelete = findViewById(R.id.btnDelete);
        btnUpdate = findViewById(R.id.btnUpdate);

        edtId = findViewById(R.id.edtId);
        edtName = findViewById(R.id.edtName);
        edtPhone = findViewById(R.id.edtPhone);

        listView = findViewById(R.id.listView);

        DatabaseHelper dbHelper = new DatabaseHelper(this);

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = edtId.getText().toString();
                String name = edtName.getText().toString();
                String phone = edtPhone.getText().toString();

                dbHelper.addEntry(id,name,phone);
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = edtId.getText().toString();

                dbHelper.deleteEntry(id);
            }
        });

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProfileModel pm = new ProfileModel();
                String id = edtId.getText().toString();
                String name = edtName.getText().toString();
                String phone = edtPhone.getText().toString();
                pm.id = id;
                pm.name = name;
                pm.phone = phone;
                dbHelper.updateEntry(pm);
            }
        });

        btnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<ProfileModel> arrModel = dbHelper.retrieveEntry();
                ArrayList<String> arrProfile = new ArrayList<>();

                for (int i=0; i<arrModel.size(); i++){
                    //Log.d("Id:"+arrProfile.get(i).id,", Name: "+arrProfile.get(i).name);
                    arrProfile.add(arrModel.get(i).id+"  "+arrModel.get(i).name+"  "
                            +arrModel.get(i).phone);
                }

                ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(),
                        android.R.layout.simple_list_item_1,arrProfile);
                listView.setAdapter(adapter);

            }
        });

    }
}
