package com.jitesh.filtr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);
    }

    public void checkLogin(View view) {
        EditText editText1 = (EditText)findViewById(R.id.editText);
        EditText editText2 = (EditText)findViewById(R.id.editText2);

        String username = editText1.getText().toString();
        String password = editText2.getText().toString();

        Intent intent = new Intent(getApplicationContext(), ImagePickActivity.class);
        startActivity(intent);
    }
}
