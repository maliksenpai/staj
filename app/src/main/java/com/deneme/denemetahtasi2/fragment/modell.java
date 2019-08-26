package com.deneme.denemetahtasi2.fragment;

import androidx.databinding.BaseObservable;

import com.deneme.denemetahtasi2.model;

public class modell extends BaseObservable {
    String anan;
    int sen;
    com.deneme.denemetahtasi2.model model;

    public model getModel(){
        return model;
    }
    public void setModel(model model){
        this.model=model;
    }
    public String getAnan() {
        return anan;
    }

    public void setAnan(String anan) {
        this.anan = anan;
    }

    public int getSen() {
        return sen;
    }

    public void setSen(int sen) {
        this.sen = sen;
    }


    }
