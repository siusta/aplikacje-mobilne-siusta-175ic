package pl.siusta.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE_2 = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent =getIntent();
        String messageText = intent.getStringExtra(EXTRA_MESSAGE_2);
        TextView messageView = (TextView) findViewById((R.id.message));
        messageView.setText((messageText));
    }

    public void goToMain(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void goToOne(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
