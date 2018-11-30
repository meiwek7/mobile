package bakhmat.semka.mobile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class SimpleActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.simple_interface);

        Log.d("message","OnCreate");

    }


    protected void onStop(){
        super.onStop();

        Log.d("message","OnStop");

    }

    protected void onDestroy(){

        Log.d("message","OnDestroy");

        super.onDestroy();

    }

    protected void onPause(){
        super.onPause();

        Log.d("message","OnPause");

    }

    protected void onStart(){
        super.onStart();

        Log.d("message","OnStart");

    }

    protected void onResume(){
        super.onResume();

        Log.d("message","OnResume");

    }

    protected void onRestart(){
        super.onRestart();

        Log.d("message","OnRestart");

    }

}
