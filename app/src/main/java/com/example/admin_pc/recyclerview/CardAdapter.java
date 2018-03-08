package com.example.admin_pc.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.admin_pc.recyclerview.Card;
import com.example.admin_pc.recyclerview.R;

import java.util.List;

/**
 * Created by ADMIN-PC on 3/8/2018.
 */

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder> {

    private Context mCtx;
    private List<Card> cardList;

    public CardAdapter(Context mCtx, List<Card> cardList) {
        this.mCtx = mCtx;
        this.cardList = cardList;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_layout, null);
        CardViewHolder holder = new CardViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {

        Card card = cardList.get(position);

        holder.textViewName.setText(card.getPname());
        holder.textViewDesc.setText(card.getPdescription());

    }

    @Override
    public int getItemCount() {
        return cardList.size();
    }

    class CardViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName , textViewDesc;

        public CardViewHolder(View itemView) {
            super(itemView);

            textViewName = itemView.findViewById(R.id.textViewName);
            textViewDesc = itemView.findViewById(R.id.textViewDesc);
        }
    }
}

