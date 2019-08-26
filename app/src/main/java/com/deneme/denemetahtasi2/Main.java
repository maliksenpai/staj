package com.deneme.denemetahtasi2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.deneme.denemetahtasi2.Bars.BarsActivity;
import com.deneme.denemetahtasi2.Dialog.DialogActivity;
import com.deneme.denemetahtasi2.Firebase.FirebaseActivity;
import com.deneme.denemetahtasi2.Glide.GlideActivity;
import com.deneme.denemetahtasi2.Retrofit.RetrofitActivity;
import com.deneme.denemetahtasi2.Sqlite.RoomActivity;
import com.deneme.denemetahtasi2.Web.HttpActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main extends AppCompatActivity {

    @OnClick(R.id.Dialog)
    public void dialog(){
        startActivity(new Intent(Main.this, DialogActivity.class));
    }
    @OnClick(R.id.Act_Fra)
    public void Actfra(){

    }
    @OnClick(R.id.Bars)
    public void Bars(){
        startActivity(new Intent(Main.this, BarsActivity.class));
    }
    @OnClick(R.id.Glide)
    public void Glide(){
        startActivity(new Intent(Main.this, GlideActivity.class));
    }
    @OnClick(R.id.Firebase)
    public void Firebase(){
        startActivity(new Intent(Main.this, FirebaseActivity.class));
    }
    @OnClick(R.id.RxBinding)
    public void RxBinding(){

    }
    @OnClick(R.id.Web)
    public void Web(){
        startActivity(new Intent(Main.this, HttpActivity.class));
    }
    @OnClick(R.id.Sqlite)
    public void Sqlite(){
        startActivity(new Intent(Main.this, RoomActivity.class));
    }
    @OnClick(R.id.Retrofit)
    public void Retrofit(){
        startActivity(new Intent(Main.this, RetrofitActivity.class));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
    }
}
