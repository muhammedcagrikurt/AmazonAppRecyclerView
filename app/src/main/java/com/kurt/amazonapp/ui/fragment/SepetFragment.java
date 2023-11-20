package com.kurt.amazonapp.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kurt.amazonapp.R;
import com.kurt.amazonapp.data.entity.UrunSepet;
import com.kurt.amazonapp.databinding.FragmentSepetBinding;
import com.kurt.amazonapp.ui.adapter.UrunSepetAdapter;

import java.util.ArrayList;


public class SepetFragment extends Fragment {

    private FragmentSepetBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSepetBinding.inflate(inflater,container,false);

        binding.sepetRecyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));

        ArrayList<UrunSepet> urunSepetArrayList = new ArrayList<>();
        UrunSepet f1 = new UrunSepet(1,"Django","32","django"); //dosya ismi yeterli uzantıya gerek yok
        UrunSepet f2 = new UrunSepet(2,"Interstellar","32","interstellar");
        UrunSepet f3 = new UrunSepet(3,"Inception","16","inception");
        UrunSepet f4 = new UrunSepet(4,"The Hateful Eight","28","thehatefuleight");
        UrunSepet f5 = new UrunSepet(5,"The Pianist","18","thepianist");
        UrunSepet f6 = new UrunSepet(6,"Anadoluda","10","anadoluda");
        urunSepetArrayList.add(f1);
        urunSepetArrayList.add(f2);
        urunSepetArrayList.add(f3);
        urunSepetArrayList.add(f4);
        urunSepetArrayList.add(f5);
        urunSepetArrayList.add(f6);

        UrunSepetAdapter urunSepetAdapter = new UrunSepetAdapter(urunSepetArrayList,requireContext());

        binding.sepetRecyclerView.setAdapter(urunSepetAdapter);





        return binding.getRoot();
    }
}