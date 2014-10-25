package pl.szkolenieandroid.mojaaplikacja;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MyApp extends Activity {

    private int clickCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_layout);
        beforeClickingTheButton();

        Log.i("MyActivity", "onCreate");
    }

    private void beforeClickingTheButton() {
        TextView myTextView =(TextView) findViewById(R.id.my_text_view); //rzutowanie jawne TextView --> View
        myTextView.setText("My text before clicking");
    }

    public void buttonAction(View view) {
        clickCounter++;
        String value = "Count" + clickCounter;
        afterClickingTheButton(value);
    }

    private void afterClickingTheButton(String value) {
        TextView myTextView =(TextView) findViewById(R.id.my_text_view); //rzutowanie jawne TextView --> View
        myTextView.setText(value);
    }

}
