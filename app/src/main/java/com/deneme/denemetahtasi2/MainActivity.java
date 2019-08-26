package com.deneme.denemetahtasi2;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

import com.deneme.denemetahtasi2.fragment.Fragmenta;
import com.deneme.denemetahtasi2.fragment.modell;

public class MainActivity extends AppCompatActivity implements model {
    private String isim;
    Toolbar toolbar;
    private  Bundle bundle=new Bundle();
    @SuppressLint("CommitTransaction")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        modell modell=new modell();
        isim="canimm";
        veriver(isim);
        bundle.putString("asd","asdasda");
        toolbar=(androidx.appcompat.widget.Toolbar)findViewById(R.id.toolbar);
        Fragmenta fragmenta=new Fragmenta();
        fragmenta.setArguments(bundle);
        toolbar.inflateMenu(R.menu.main_actions);
        setSupportActionBar(toolbar);
       /* modell.setModel(new model() {
            @Override
            public String getisim(int sayi) {
                Log.d("asd","sayi");
            }

            @Override
            public void setisim() {

            }
        });*/
    }

    @Override
    public String veriver(String isim) {
        return isim;
    }

    @Override
    public String verial() {
        return isim;
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
