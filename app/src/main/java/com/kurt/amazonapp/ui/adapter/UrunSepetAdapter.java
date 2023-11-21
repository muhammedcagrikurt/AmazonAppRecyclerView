package com.kurt.amazonapp.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kurt.amazonapp.data.entity.UrunSepet;
import com.kurt.amazonapp.databinding.CardUrunBinding;

import java.util.List;

public class UrunSepetAdapter extends RecyclerView.Adapter<UrunSepetAdapter.CardUrunHolder> {
    private List<UrunSepet> urunSepetList;
    private Context context;
    public UrunSepetAdapter(List<UrunSepet> urunSepetList, Context context) {
        this.urunSepetList = urunSepetList;
        this.context = context;
    }
    public class CardUrunHolder extends RecyclerView.ViewHolder{
        private CardUrunBinding cardUrunBinding;
        public CardUrunHolder(CardUrunBinding cardUrunBinding) {
            super(cardUrunBinding.getRoot());
            this.cardUrunBinding=cardUrunBinding;
        }
    }
    @NonNull
    @Override
    public CardUrunHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardUrunBinding binding = CardUrunBinding.inflate(LayoutInflater.from(context),parent,false);
        return new CardUrunHolder(binding);
    }
    @Override
    public void onBindViewHolder(@NonNull CardUrunHolder holder, int position) {
        UrunSepet urun = urunSepetList.get(position);
        CardUrunBinding urunBinding = holder.cardUrunBinding;
        urunBinding.textViewUrunAd.setText(urun.getAd());
        urunBinding.textViewUrunFiyat.setText(urun.getFiyat());
        urunBinding.imageViewUrunCard.setImageResource(
                context.getResources().getIdentifier(urun.getResim(),"drawable",context.getPackageName())
        );

    }
    @Override
    public int getItemCount() {
        return urunSepetList.size();
    }

}
