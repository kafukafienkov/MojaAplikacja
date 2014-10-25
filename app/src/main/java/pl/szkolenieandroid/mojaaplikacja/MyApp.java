package pl.szkolenieandroid.mojaaplikacja;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MyApp extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_layout);
        TextView myTextView =(TextView) findViewById(R.id.my_text_view); //rzutowanie jawne TextView --> View
        myTextView.setText("My text before clicking");
    }

    public void buttonAction(View view) {
        TextView myTextView =(TextView) findViewById(R.id.my_text_view); //rzutowanie jawne TextView --> View
        myTextView.setText("After clicking the button");

    }
}
