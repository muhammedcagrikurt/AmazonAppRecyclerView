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

        UrunSepet f2 = new UrunSepet(2,"Akıllı Yatırımcı: Warren Buffett’ın önsözü ve sonsözüyle  - Jason Zweig’in güncel yorumlarıyla zenginleştirilmiş yeni baskı Kağıt Kapak – 3 Mart 2020","182,81 ₺","akilliyatirimci");
        UrunSepet f3 = new UrunSepet(3,"Tutunamayanlar: Bütün Eserleri - 1 Kağıt Kapak – Tıpkı basım, 1 Temmuz 2016","180 ₺","oguzatay");
        UrunSepet f1 = new UrunSepet(1,"Bitmemiş Öyküler Kağıt Kapak – 3 Mart 2020","210 ₺","jrr");
        urunSepetArrayList.add(f1);
        urunSepetArrayList.add(f2);
        urunSepetArrayList.add(f3);

        UrunSepetAdapter urunSepetAdapter = new UrunSepetAdapter(urunSepetArrayList,requireContext());
        binding.button3.setText("Alışverişi Tamamla ("+urunSepetArrayList.size()+" ürün)");
        binding.sepetRecyclerView.setAdapter(urunSepetAdapter);


        return binding.getRoot();
    }
}