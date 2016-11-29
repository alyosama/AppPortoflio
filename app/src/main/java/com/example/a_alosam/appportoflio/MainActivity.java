package com.example.a_alosam.appportoflio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.button_popular_movies,
            R.id.button_stock_hawk,
            R.id.button_build_it_bigger,
            R.id.button_make_your_app_material,
            R.id.button_go_ubiquitous,
            R.id.button_capstone})
    public void onClicked(View view) {
        String message = "";
        switch (view.getId()) {
            case R.id.button_popular_movies:
            case R.id.button_stock_hawk:
            case R.id.button_build_it_bigger:
            case R.id.button_make_your_app_material:
            case R.id.button_go_ubiquitous:
            case R.id.button_capstone:
                message = ((Button)view).getText().toString();
                break;
        }
        Toast.makeText(this, "You Selected "+message, Toast.LENGTH_SHORT).show();
    }
}
