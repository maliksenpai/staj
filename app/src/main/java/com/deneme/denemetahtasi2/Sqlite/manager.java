package com.deneme.denemetahtasi2.Sqlite;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

@Database(entities = {database.class},exportSchema = false, version = 1)
public abstract class manager extends RoomDatabase {
    private static final String dbname="tablo";
    private static volatile manager instance;
    static synchronized manager getInstance(Context context){
        if(instance == null){
            instance = create(context);
        }
        return instance;
    }
    private static manager create(final Context context){
        return Room.databaseBuilder(
                context.getApplicationContext(),
                manager.class,
                dbname).build();
    }

    public abstract dbinterface dbinterface();
}
