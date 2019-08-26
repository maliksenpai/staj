package com.deneme.denemetahtasi2.Retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.deneme.denemetahtasi2.R;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetrofitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);
        RetroInterface retroInterface=ApiClient.getClient().create(RetroInterface.class);
        Call<RetrofitModel> call=retroInterface.verial();
        call.enqueue(new Callback<RetrofitModel>() {
            @Override
            public void onResponse(Call<RetrofitModel> call, Response<RetrofitModel> response) {
                List<Datum> list=new ArrayList<>();
                list=response.body().data;
                List<Datum> finalList = list;
                Observable observable = Observable.create(new ObservableOnSubscribe<RetrofitModel>() {

                    @Override
                    public void subscribe(ObservableEmitter emitter) throws Throwable {
                        for (Datum model: finalList){
                            emitter.onNext(model.firstName);
                        }
                    }
                });
                Observer observer=new Observer() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.d("gelen","basladi");
                    }

                    @Override
                    public void onNext(Object o) {
                        Log.d("gelen",o.toString());
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                };
                observable.subscribe(observer);
            }

            @Override
            public void onFailure(Call<RetrofitModel> call, Throwable t) {
                Log.d("gelen",t.getMessage());
            }
        });
    }
}
