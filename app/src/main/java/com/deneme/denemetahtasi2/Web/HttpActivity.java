package com.deneme.denemetahtasi2.Web;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.deneme.denemetahtasi2.R;

import org.jetbrains.annotations.NotNull;
import android.util.Log;
import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HttpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_http);/*
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder()
                .url("https://reqres.in/api/users?page=2")
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {

            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                Log.d("gelen",response.body());
            }
        });
        */
    }
}
