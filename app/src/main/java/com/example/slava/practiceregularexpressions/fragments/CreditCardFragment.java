package com.example.slava.practiceregularexpressions.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.slava.practiceregularexpressions.R;

public class CreditCardFragment extends Fragment {

    public static TechnicalPassportFragment getInstance() {
        Bundle args = new Bundle();
        TechnicalPassportFragment fragment = new TechnicalPassportFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_credit_card, container, false);

        return view;
    }
}
