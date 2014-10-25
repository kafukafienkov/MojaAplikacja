package pl.szkolenieandroid.mojaaplikacja;

import android.app.Activity;
import android.os.Bundle;


public class MyApp extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.color_buttons);
    }
}
