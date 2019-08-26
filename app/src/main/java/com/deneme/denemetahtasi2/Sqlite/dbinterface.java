package com.deneme.denemetahtasi2.Sqlite;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface dbinterface {
    @Query("Select * from tablo")
    public List<database> hepsinial();
    @Insert()
    public void yaz(database database);
}
