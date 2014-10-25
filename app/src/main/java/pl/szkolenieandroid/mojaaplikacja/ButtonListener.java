package pl.szkolenieandroid.mojaaplikacja;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Bartek on 25.10.14.
 */
public class ButtonListener extends Activity implements View.OnClickListener, View.OnLongClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_layout);
        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(this);
        button.setOnLongClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Button has been clicked", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onLongClick(View v) {
        Toast.makeText(this, "Button has been clicked long", Toast.LENGTH_SHORT).show();
        return true;
    }
}