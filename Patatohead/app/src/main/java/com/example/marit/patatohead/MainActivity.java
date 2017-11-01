package com.example.marit.patatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    CheckBox ch13, ch14, ch15, ch16, ch17, ch18, ch19, ch20, ch21, ch22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickCheckbox(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case R.id.checkBox13:
                if (checked)
                    
        }
    }
}
