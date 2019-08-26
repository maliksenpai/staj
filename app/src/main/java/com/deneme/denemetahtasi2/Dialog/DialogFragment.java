package com.deneme.denemetahtasi2.Dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.deneme.denemetahtasi2.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DialogFragment extends androidx.fragment.app.DialogFragment {
    @OnClick(R.id.button2)
    public void kapat(){
        dismiss();
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.dialogfragment,null);
        ButterKnife.bind(this,view);
        return view;
    }
}
