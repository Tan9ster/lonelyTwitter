package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class EditTweetActivity extends Activity {
    TextView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);


        Intent intent = getIntent();
        String message = intent.getStringExtra(LonelyTwitterActivity.EXTRA_MESSAGE);
        Toast.makeText(this, message, LENGTH_SHORT).show();
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setTextSize(40);
        textView.setText(message);
    }
}
