package com.deneme.denemetahtasi2.Glide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.deneme.denemetahtasi2.R;

import butterknife.BindView;

public class GlideActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide);
        ImageView foto=findViewById(R.id.imageView);
        ImageView gif=findViewById(R.id.imageView2);
        Glide.with(this).load(R.drawable.idc).into(foto);
        Glide.with(this).load(R.drawable.giphy).into(gif);
    }
}
