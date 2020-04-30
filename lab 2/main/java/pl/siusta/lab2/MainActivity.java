package pl.siusta.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSendMessage1(View view){
        EditText messageView = (EditText) findViewById(R.id.message);
        String messageText = messageView.getText().toString();
        Intent intent1 = new Intent(this, Main2Activity.class);
        intent1.putExtra(Main2Activity.EXTRA_MESSAGE, messageText);
        startActivity(intent1);
    }
    public void onSendMessage2(View view){
        EditText messageView = (EditText) findViewById(R.id.message);
        String messageText = messageView.getText().toString();
        Intent intent2 = new Intent(this, Main3Activity.class);
        intent2.putExtra(Main3Activity.EXTRA_MESSAGE_2, messageText);
        startActivity(intent2);
    }

}
