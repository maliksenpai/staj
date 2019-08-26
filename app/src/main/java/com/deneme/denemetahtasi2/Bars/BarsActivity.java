package com.deneme.denemetahtasi2.Bars;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.deneme.denemetahtasi2.R;
import com.google.android.material.bottomnavigation.BottomNavigationMenu;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BarsActivity extends AppCompatActivity {
    Toolbar toolbar;
    BottomNavigationView bottomNavigationView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bars);
        toolbar=(androidx.appcompat.widget.Toolbar) findViewById(R.id.toolbar);
        bottomNavigationView=(BottomNavigationView)findViewById(R.id.bar);
        toolbar.inflateMenu(R.menu.main_actions);
        textView=findViewById(R.id.textView2);
        setSupportActionBar(toolbar);
        BottomNavigationView.OnNavigationItemSelectedListener listener= new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.item1:
                        textView.setText("item1");
                        return true;
                    case R.id.item2:
                        textView.setText("item2");
                        return true;
                    case R.id.item3:
                        textView.setText("item3");
                        return true;
                }
                return true;
            }
            };
        bottomNavigationView.setOnNavigationItemSelectedListener(listener);
        }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_actions,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this,String.valueOf(item.getItemId()), Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }
}
