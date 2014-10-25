package pl.szkolenieandroid.mojaaplikacja;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Bartek on 25.10.14.
 */
public class NewActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_layout);

        Log.i("New activity", ">>> onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("New activity", ">>> onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("New activity", ">>> onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("New activity", ">>> onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("New activity", ">>> onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("New activity", ">>> onDestroy");
    }
}
