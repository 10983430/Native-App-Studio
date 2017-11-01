package com.example.marit.patatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickCheckbox(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case R.id.checkBox13:
                ImageView imgView = (ImageView)findViewById(R.id.imageView2);
                if (checked) {
                    imgView.setVisibility(View.VISIBLE);
                }
                else {
                    imgView.setVisibility(View.GONE);
                }
                break;
            case R.id.checkBox14:
                ImageView imgView7 = (ImageView)findViewById(R.id.imageView7);
                if (checked) {
                    imgView7.setVisibility(View.VISIBLE);
                }
                else {
                    imgView7.setVisibility(View.GONE);
                }
                break;
            case R.id.checkBox15:
                ImageView imgView3 = (ImageView)findViewById(R.id.imageView3);
                if (checked) {
                    imgView3.setVisibility(View.VISIBLE);
                }
                else {
                    imgView3.setVisibility(View.GONE);
                }
                break;
            case R.id.checkBox16:
                ImageView imgView8 = (ImageView)findViewById(R.id.imageView8);
                if (checked) {
                    imgView8.setVisibility(View.VISIBLE);
                }
                else {
                    imgView8.setVisibility(View.GONE);
                }
                break;
            case R.id.checkBox17:
                ImageView imgView4 = (ImageView)findViewById(R.id.imageView4);
                if (checked) {
                    imgView4.setVisibility(View.VISIBLE);
                }
                else {
                    imgView4.setVisibility(View.GONE);
                }
                break;
            case R.id.checkBox18:
                ImageView imgView9 = (ImageView)findViewById(R.id.imageView9);
                if (checked) {
                    imgView9.setVisibility(View.VISIBLE);
                }
                else {
                    imgView9.setVisibility(View.GONE);
                }
                break;
            case R.id.checkBox19:
                ImageView imgView5 = (ImageView)findViewById(R.id.imageView5);
                if (checked) {
                    imgView5.setVisibility(View.VISIBLE);
                }
                else {
                    imgView5.setVisibility(View.GONE);
                }
                break;
            case R.id.checkBox20:
                ImageView imgView10 = (ImageView)findViewById(R.id.imageView10);
                if (checked) {
                    imgView10.setVisibility(View.VISIBLE);
                }
                else {
                    imgView10.setVisibility(View.GONE);
                }
                break;
            case R.id.checkBox21:
                ImageView imgView6 = (ImageView)findViewById(R.id.imageView6);
                if (checked) {
                    imgView6.setVisibility(View.VISIBLE);
                }
                else {
                    imgView6.setVisibility(View.GONE);
                }
                break;
            case R.id.checkBox22:
                ImageView imgView11 = (ImageView)findViewById(R.id.imageView11);
                if (checked) {
                    imgView11.setVisibility(View.VISIBLE);
                }
                else {
                    imgView11.setVisibility(View.GONE);
                }
                break;
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        ImageView imgView11 = (ImageView)findViewById(R.id.imageView11);
        Integer sta11 = imgView11.getVisibility();
        outState.putInt("sta11", sta11);

        ImageView imgView10 = (ImageView)findViewById(R.id.imageView10);
        Integer sta10 = imgView10.getVisibility();
        outState.putInt("sta10", sta10);

        ImageView imgView9 = (ImageView)findViewById(R.id.imageView9);
        Integer sta9 = imgView9.getVisibility();
        outState.putInt("sta9", sta9);

        ImageView imgView8 = (ImageView)findViewById(R.id.imageView8);
        Integer sta8 = imgView8.getVisibility();
        outState.putInt("sta8", sta8);

        ImageView imgView7 = (ImageView)findViewById(R.id.imageView7);
        Integer sta7 = imgView7.getVisibility();
        outState.putInt("sta7", sta7);

        ImageView imgView6 = (ImageView)findViewById(R.id.imageView6);
        Integer sta6 = imgView6.getVisibility();
        outState.putInt("sta6", sta6);

        ImageView imgView5 = (ImageView)findViewById(R.id.imageView5);
        Integer sta5 = imgView5.getVisibility();
        outState.putInt("sta5", sta5);

        ImageView imgView4 = (ImageView)findViewById(R.id.imageView4);
        Integer sta4 = imgView4.getVisibility();
        outState.putInt("sta4", sta4);

        ImageView imgView3 = (ImageView)findViewById(R.id.imageView3);
        Integer sta3 = imgView3.getVisibility();
        outState.putInt("sta3", sta3);

        ImageView imgView2 = (ImageView)findViewById(R.id.imageView2);
        Integer sta2 = imgView2.getVisibility();
        outState.putInt("sta2", sta2);

    }

    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

        ImageView imgView11 = (ImageView)findViewById(R.id.imageView11);
        int nu11 = inState.getInt("sta11");
        imgView11.setVisibility(nu11);

        ImageView imgView10 = (ImageView)findViewById(R.id.imageView10);
        int nu10 = inState.getInt("sta10");
        imgView10.setVisibility(nu10);

        ImageView imgView9 = (ImageView)findViewById(R.id.imageView9);
        int nu9 = inState.getInt("sta9");
        imgView9.setVisibility(nu9);

        ImageView imgView8 = (ImageView)findViewById(R.id.imageView8);
        int nu8 = inState.getInt("sta8");
        imgView8.setVisibility(nu8);

        ImageView imgView7 = (ImageView)findViewById(R.id.imageView7);
        int nu7 = inState.getInt("sta7");
        imgView7.setVisibility(nu7);

        ImageView imgView6 = (ImageView)findViewById(R.id.imageView6);
        int nu6 = inState.getInt("sta6");
        imgView6.setVisibility(nu6);

        ImageView imgView5 = (ImageView)findViewById(R.id.imageView5);
        int nu5 = inState.getInt("sta5");
        imgView5.setVisibility(nu5);

        ImageView imgView4 = (ImageView)findViewById(R.id.imageView4);
        int nu4 = inState.getInt("sta4");
        imgView4.setVisibility(nu4);

        ImageView imgView3 = (ImageView)findViewById(R.id.imageView3);
        int nu3 = inState.getInt("sta3");
        imgView3.setVisibility(nu3);

        ImageView imgView2 = (ImageView)findViewById(R.id.imageView2);
        int nu2 = inState.getInt("sta2");
        imgView2.setVisibility(nu2);
    }

}
