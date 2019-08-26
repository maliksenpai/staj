package com.deneme.denemetahtasi2.Retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;

public interface RetroInterface {
    @GET("users?page=2")
    Call<RetrofitModel> verial();
}
