package com.example.dailyhelper.fragmentUI.diary;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dailyhelper.R;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class MainMenuDiaryFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return (ViewGroup)inflater.inflate(R.layout.fragment_diary, container, false);
    }
}