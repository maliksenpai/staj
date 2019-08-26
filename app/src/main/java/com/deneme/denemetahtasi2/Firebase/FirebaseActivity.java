package com.deneme.denemetahtasi2.Firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.SyncStateContract;
import android.util.Log;

import com.deneme.denemetahtasi2.R;
import com.google.android.gms.common.internal.Constants;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.File;
import java.io.IOException;

public class FirebaseActivity extends AppCompatActivity {
    private StorageReference mStorageRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase);
        mStorageRef= FirebaseStorage.getInstance().getReference();
        File file = null;
        try {
            file=File.createTempFile("inen","jpg");
        } catch (IOException e) {
            Log.d("gelen",e.getMessage());
        }
        mStorageRef.getFile(file).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
            @Override
            public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                Log.d("gelen",String.valueOf(taskSnapshot.getBytesTransferred()) + "\n"+ String.valueOf(taskSnapshot.getTotalByteCount()));
            }
        });

    }
}
