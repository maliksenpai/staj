package com.deneme.denemetahtasi2.Retrofit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static Retrofit retrofit=null;
    private static String Base_Url= "https://reqres.in/api/";
    public static Retrofit getClient(){
        if(retrofit== null){retrofit = new Retrofit.Builder()
                .baseUrl(Base_Url)
                .addConverterFactory(GsonConverterFactory.create())
                .client(new OkHttpClient())
                .build();
            return retrofit;    }
        return retrofit;
    }
}
