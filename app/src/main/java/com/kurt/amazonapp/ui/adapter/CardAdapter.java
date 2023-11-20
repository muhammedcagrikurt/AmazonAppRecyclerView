package com.kurt.amazonapp.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kurt.amazonapp.data.entity.CardResim;
import com.kurt.amazonapp.databinding.CardTasarimBinding;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardTasarimHolder> {

    private List<CardResim> cardResimList;

    private Context context;

    public CardAdapter(List<CardResim> cardResimList, Context context) {
        this.cardResimList = cardResimList;
        this.context = context;
    }

    @NonNull
    @Override
    public CardTasarimHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardTasarimBinding binding =CardTasarimBinding.inflate(LayoutInflater.from(context),parent,false);
        return new CardTasarimHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardTasarimHolder holder, int position) {
        CardResim cardResim = cardResimList.get(position);
        holder.tasarimBinding.imageViewUrun.setImageResource(
                context.getResources().getIdentifier(
                        cardResim.getResim(),"drawable",context.getPackageName()
                )
        );
    }

    @Override
    public int getItemCount() {
        return cardResimList.size();
    }

    public class CardTasarimHolder extends RecyclerView.ViewHolder{
        private CardTasarimBinding tasarimBinding;

        public CardTasarimHolder(CardTasarimBinding tasarimBinding) {
            super(tasarimBinding.getRoot());
            this.tasarimBinding=tasarimBinding;
        }
    }
}
