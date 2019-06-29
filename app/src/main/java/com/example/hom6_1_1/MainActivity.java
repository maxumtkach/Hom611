package com.example.hom6_1_1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "Lifecycle";
    private TextView textView;
    private final static String EDIT_TEXT_VIEW = "edit_text_view";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);
        textView.append("\n" + "onCreate");
        Log.d(TAG, "onCreate for :" + this);
        if (savedInstanceState == null) {
            Toast.makeText(this, "onCreate TEXT_VIEW is NULL", Toast.LENGTH_LONG).show();
        } else {
            final String textSave = savedInstanceState.getString(EDIT_TEXT_VIEW);
            Toast.makeText(this, "onCreate textSave =" + textSave, Toast.LENGTH_LONG).show();
            textView.setText(textSave);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState for :" + this);
        textView.append("\n" + "onSaveInstanceState");
        EditText editText = findViewById(R.id.edit_text);
        final String stringTextToSave = editText.getText().toString();
        outState.putString(EDIT_TEXT_VIEW, stringTextToSave);
        Toast.makeText(this, "onSaveInstanceState EDIT_TEXT_VIEW = " + stringTextToSave, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart for :" + this);
        textView.append("\n" + "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume for :" + this);
        textView.append("\n" + "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause for :" + this);
        textView.append("\n" + "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop for :" + this);
        textView.append("\n" + "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy for :" + this);
        textView.append("\n" + "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart for :" + this);
        textView.append("\n" + "onRestart");
    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
        Log.d(TAG, "onPostCreate for :" + this);
        textView.append("\n" + "onPostCreate");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(TAG, "onPostResume for :" + this);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.e(TAG, "onKeyDown for :" + this);
        textView.append("\n" + "onKeyDown");
        return super.onKeyDown(keyCode, event);
        // return true;
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        Log.d(TAG, "onKeyLongPress for :" + this);
        textView.append("\n" + "onKeyLongPress");
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d(TAG, "onBackPressed for :" + this);
        textView.append("\n" + "onBackPressed");
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState for :" + this);
        textView.append("\n" + "onRestoreInstanceState");
    }
}



