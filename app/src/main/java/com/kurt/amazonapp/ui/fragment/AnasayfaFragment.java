package com.kurt.amazonapp.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kurt.amazonapp.R;
import com.kurt.amazonapp.data.entity.CardResim;
import com.kurt.amazonapp.data.entity.Kategori;
import com.kurt.amazonapp.databinding.FragmentAnasayfaBinding;
import com.kurt.amazonapp.ui.adapter.YatayRecyclerViewAdapter;

import java.util.ArrayList;


public class AnasayfaFragment extends Fragment {
    private FragmentAnasayfaBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false);


        binding.kategoriRV.setLayoutManager(new LinearLayoutManager(requireContext()));
        //binding.kategoriRV.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        ArrayList<Kategori> kategoriArrayList = new ArrayList<>();
        ArrayList<CardResim> cardResimArrayList = new ArrayList<>();
        ArrayList<CardResim> cardResimArrayList2 = new ArrayList<>();
        ArrayList<CardResim> cardResimArrayList3 = new ArrayList<>();
        CardResim f1 = new CardResim(1,"django"); //dosya ismi yeterli uzantıya gerek yok
        CardResim f2 = new CardResim(2,"interstellar");
        CardResim f3 = new CardResim(3,"inception");
        CardResim f4 = new CardResim(4,"thehatefuleight");
        CardResim f5 = new CardResim(5,"thepianist");
        CardResim f6 = new CardResim(6,"anadoluda");
        cardResimArrayList.add(f1);
        cardResimArrayList.add(f2);
        cardResimArrayList.add(f3);
        cardResimArrayList.add(f4);
        cardResimArrayList.add(f5);
        cardResimArrayList.add(f6);
        cardResimArrayList.add(f1);
        //
        cardResimArrayList2.add(f2);
        cardResimArrayList2.add(f3);
        cardResimArrayList2.add(f4);
        cardResimArrayList2.add(f5);
        cardResimArrayList2.add(f6);
        //
        cardResimArrayList3.add(f1);
        cardResimArrayList3.add(f2);
        cardResimArrayList3.add(f3);
        cardResimArrayList3.add(f4);
        cardResimArrayList3.add(f5);
        cardResimArrayList3.add(f6);

        Kategori k1 = new Kategori(1,cardResimArrayList);
        Kategori k2 = new Kategori(2,cardResimArrayList2);
        Kategori k3 = new Kategori(3,cardResimArrayList3);
        kategoriArrayList.add(k1);
        kategoriArrayList.add(k2);
        kategoriArrayList.add(k3);

        //CardAdapter cardAdapter = new CardAdapter(cardResimArrayList,this);
        YatayRecyclerViewAdapter yatayRecyclerViewAdapter = new YatayRecyclerViewAdapter(kategoriArrayList,requireContext());
        binding.kategoriRV.setAdapter(yatayRecyclerViewAdapter);
        //binding.kategoriRV.setAdapter(cardAdapter);
























        return binding.getRoot();
    }
}