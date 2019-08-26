package com.deneme.denemetahtasi2.Sqlite;

import android.os.AsyncTask;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "tablo")
public class database {
    @PrimaryKey(autoGenerate = true)
    int id;
    @ColumnInfo(name = "isim")
    String isim;
    @ColumnInfo(name = "soyisim")
    String soyisim;
    public database(String isim,String soyisim){
        this.isim=isim;
        this.soyisim=soyisim;
    }

}
