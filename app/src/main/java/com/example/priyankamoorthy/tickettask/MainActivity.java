package com.example.priyankamoorthy.tickettask;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import static android.content.ContentValues.TAG;

public class MainActivity extends Activity {

    private EditText et_name,et_email;
    private Button bt_login;
    private DatabaseReference databaseUsers;
    private String userId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseUsers = FirebaseDatabase.getInstance().getReference("user");

        et_name = (EditText) findViewById(R.id.name);
        et_email = (EditText) findViewById(R.id.email);
        bt_login = (Button) findViewById(R.id.login);

        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addUser();
            }
        });
    }

    public void addUser(){
        String name = et_name.getText().toString().trim();
        String email  = et_email.getText().toString().trim();

        if(!TextUtils.isEmpty(name) && !TextUtils.isEmpty(email)){

           userId =  databaseUsers.push().getKey();

           User user = new User(userId,name,email);

           databaseUsers.child(userId).setValue(user);

            Toast.makeText(this, "User added", Toast.LENGTH_LONG).show();

        }else{
            Toast.makeText(this, "Enter valid name and email", Toast.LENGTH_LONG).show();
        }
    }


    }

