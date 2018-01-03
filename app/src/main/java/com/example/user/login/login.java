package com.example.user.login;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    private static Button b;
    private static EditText e1;
    private static EditText e2;
private int count=5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login();
    }

    public void login() {
        b = (Button) findViewById(R.id.button);
        e1 = (EditText) findViewById(R.id.edit1);
        e2 = (EditText) findViewById(R.id.edit2);
        b.setOnClickListener(
                new View.OnClickListener(){
                    public  void onClick(View v)
                    {
                       if(e1.getText().toString().equals("user") && e2.getText().toString().equals("pass"))
                       {
                           Toast.makeText(login.this,"user name and pass mathced"+count,Toast.LENGTH_SHORT).show();
                           Intent i =new Intent("com.example.user.tictak");
                           startActivity(i);
                       }
                       else{
                           Toast.makeText(login.this,"unmatched",Toast.LENGTH_SHORT).show();
                           count--;
                           if(count==0){
                               b.setEnabled(false   );
                           }
                       }
                       }
                    }

        );
    }
}
