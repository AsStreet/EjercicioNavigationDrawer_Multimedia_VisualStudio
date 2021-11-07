package com.example.ejercicionavigationdrawer.Fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ejercicionavigationdrawer.R;
import com.example.ejercicionavigationdrawer.databinding.FragmentAsirBinding;

public class AsirFragment extends Fragment {

    private FragmentAsirBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAsirBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}