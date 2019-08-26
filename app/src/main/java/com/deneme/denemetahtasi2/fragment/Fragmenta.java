package com.deneme.denemetahtasi2.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.deneme.denemetahtasi2.R;
import com.deneme.denemetahtasi2.model;

public class Fragmenta extends DialogFragment implements model {
    String asd="";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments()!=null){
            String asd=getArguments().getString("asd");
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragmenta,container,false);
        final Button buton=view.findViewById(R.id.button);
       // buton.setText(asd);
        model verial;
        verial=(model)getActivity();
        String sdf=verial.verial();
        buton.setText(sdf);
       // buton.setText(getArguments().getString("asd"));
//        Log.d("gelenler",getArguments().getString("asd"));
        return view;
    }

    @Override
    public String veriver(String veri1) {
        return null;
    }

    @Override
    public String verial() {
        return null;
    }
}
