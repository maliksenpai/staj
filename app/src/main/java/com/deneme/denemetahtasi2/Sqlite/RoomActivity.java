package com.deneme.denemetahtasi2.Sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import com.deneme.denemetahtasi2.R;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.schedulers.ExecutorScheduler;
import io.reactivex.rxjava3.internal.schedulers.SingleScheduler;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class RoomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);
        manager manager= com.deneme.denemetahtasi2.Sqlite.manager.getInstance(this);
//        manager.dbinterface().hepsinial();
        database database=new database("aszxcd","asd");
        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                manager.dbinterface().yaz(database);
                List<database> veriler=new ArrayList<>();
                veriler=manager.dbinterface().hepsinial();
                List<database> finalveriler = veriler;
                Observable observable=Observable.create(new ObservableOnSubscribe<database>() {

                    @Override
                    public void subscribe(ObservableEmitter emitter) throws Throwable {
                        for(database veri:finalveriler){
                            emitter.onNext(veri.isim);
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
                        Log.d("gelen",e.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        Log.d("gelen","bitti");
                    }
                };
                observable.subscribe(observer);
            }
        });
    }
}
