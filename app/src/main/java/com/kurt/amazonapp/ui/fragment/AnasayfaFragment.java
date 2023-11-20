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
        ArrayList<Kategori> kategoriArrayList = new ArrayList<>();
        ArrayList<CardResim> cardResimArrayList = new ArrayList<>();
        ArrayList<CardResim> cardResimArrayList2 = new ArrayList<>();
        ArrayList<CardResim> cardResimArrayList3 = new ArrayList<>();
        ArrayList<CardResim> cardResimArrayList4 = new ArrayList<>();
        CardResim c1 = new CardResim(1,"muthiskasimgulumse"); //dosya ismi yeterli uzantıya gerek yok
        //CardResim c2 = new CardResim(1,"muthiskasimgulumse");
        cardResimArrayList.add(c1);
        //cardResimArrayList.add(c2);
        //
        CardResim cr1 = new CardResim(1,"gulumsetenkasim");
        CardResim cr2 = new CardResim(2,"gulumsetenkasim");
        CardResim cr3 = new CardResim(3,"kitapkategori");
        cardResimArrayList2.add(cr1);
        cardResimArrayList2.add(cr2);
        cardResimArrayList2.add(cr3);
        //
        CardResim cresim1 = new CardResim(1,"uspa");
        CardResim cresim2 = new CardResim(2,"kedi");
        CardResim cresim3 = new CardResim(4,"samsung");
        CardResim cresim4 = new CardResim(5,"dockers");
        cardResimArrayList3.add(cresim1);
        cardResimArrayList3.add(cresim2);
        cardResimArrayList3.add(cresim3);
        cardResimArrayList3.add(cresim4);
        //
        CardResim cardresim1 = new CardResim(1,"puma"); //dosya ismi yeterli uzantıya gerek yok
        cardResimArrayList4.add(cardresim1);
        //
        Kategori k1 = new Kategori(1,cardResimArrayList);
        Kategori k2 = new Kategori(2,cardResimArrayList2);
        Kategori k3 = new Kategori(3,cardResimArrayList3);
        Kategori k4 = new Kategori(4,cardResimArrayList4);
        kategoriArrayList.add(k1);
        kategoriArrayList.add(k2);
        kategoriArrayList.add(k3);
        kategoriArrayList.add(k4);

        YatayRecyclerViewAdapter yatayRecyclerViewAdapter = new YatayRecyclerViewAdapter(kategoriArrayList,requireContext());
        binding.kategoriRV.setAdapter(yatayRecyclerViewAdapter);

        return binding.getRoot();
    }
}