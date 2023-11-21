package com.kurt.amazonapp.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.kurt.amazonapp.data.entity.CardResim;
import com.kurt.amazonapp.data.entity.Kategori;
import com.kurt.amazonapp.databinding.YatayRecyclerviewBinding;

import java.util.List;

public class YatayRecyclerViewAdapter extends RecyclerView.Adapter<YatayRecyclerViewAdapter.YatayRecyclerViewHolder> {
    private List<Kategori> kategoriList;
    private Context context;
    public YatayRecyclerViewAdapter(List<Kategori> kategoriList, Context context) {
        this.kategoriList = kategoriList;
        this.context = context;
    }
    public class YatayRecyclerViewHolder extends RecyclerView.ViewHolder{
        private YatayRecyclerviewBinding yatayRecyclerviewBinding;
        public YatayRecyclerViewHolder(YatayRecyclerviewBinding yatayRecyclerviewBinding) {
            super(yatayRecyclerviewBinding.getRoot());
            this.yatayRecyclerviewBinding=yatayRecyclerviewBinding;
        }
    }
    @NonNull
    @Override
    public YatayRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        YatayRecyclerviewBinding binding = YatayRecyclerviewBinding.inflate(LayoutInflater.from(context),parent,false);
        return new YatayRecyclerViewHolder(binding);
    }
    @Override
    public void onBindViewHolder(@NonNull YatayRecyclerViewHolder holder, int position) {
        Kategori kategori = kategoriList.get(position);
        YatayRecyclerviewBinding recyclerviewBinding = holder.yatayRecyclerviewBinding;
        recyclerviewBinding.yatayRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL));
        CardAdapter cardAdapter = new CardAdapter(kategori.getCardResimList(),recyclerviewBinding.yatayRecyclerView.getContext());
        recyclerviewBinding.yatayRecyclerView.setAdapter(cardAdapter);
    }
    @Override
    public int getItemCount() {
        return kategoriList.size();
    }


}
