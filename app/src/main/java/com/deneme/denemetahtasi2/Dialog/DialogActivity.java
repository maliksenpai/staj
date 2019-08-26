package com.deneme.denemetahtasi2.Dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.deneme.denemetahtasi2.R;
import com.jakewharton.rxbinding3.view.RxView;

import java.util.concurrent.TimeUnit;

import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.Unit;

public class DialogActivity extends AppCompatActivity {
    @OnClick(R.id.Dialog)
    public void dialog(){

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        ButterKnife.bind(this);
        Button buton=findViewById(R.id.Dialog);
        Disposable disposable= RxView.clicks(buton).debounce(2, TimeUnit.SECONDS).subscribe(new Consumer<Unit>() {
            @Override
            public void accept(Unit unit) throws Exception {
                DialogFragment dialogFragment=new DialogFragment();
                dialogFragment.show(getSupportFragmentManager(),"asd");
            }
        });
    }
}
