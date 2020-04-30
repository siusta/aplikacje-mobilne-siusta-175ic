package pl.siusta.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spinner1;
    Spinner spinner2;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner1 = (Spinner)findViewById(R.id.spinner);
        spinner2 = (Spinner)findViewById(R.id.spinner2);
        textView = (TextView)findViewById(R.id.textView);
    }

    public void add(View view){
        int tmp1,tmp2;
        tmp1=Integer.parseInt(String.valueOf(spinner1.getSelectedItem()));
        tmp2=Integer.parseInt(String.valueOf(spinner2.getSelectedItem()));
        textView.setText(String.valueOf(tmp1+tmp2));
    }
    public void sub(View view){
        int tmp1,tmp2;
        tmp1=Integer.parseInt(String.valueOf(spinner1.getSelectedItem()));
        tmp2=Integer.parseInt(String.valueOf(spinner2.getSelectedItem()));
        textView.setText(String.valueOf(tmp1-tmp2));
    }
    public void mul(View view){
        int tmp1,tmp2;
        tmp1=Integer.parseInt(String.valueOf(spinner1.getSelectedItem()));
        tmp2=Integer.parseInt(String.valueOf(spinner2.getSelectedItem()));
        textView.setText(String.valueOf(tmp1*tmp2));
    }
    public void div(View view){
        double tmp1,tmp2;
        tmp1=Double.parseDouble(String.valueOf(spinner1.getSelectedItem()));
        tmp2=Double.parseDouble(String.valueOf(spinner2.getSelectedItem()));
        if(tmp2==0)textView.setText("nie sądzę");
        else textView.setText(String.format("%.5f",tmp1/tmp2));
    }
}
