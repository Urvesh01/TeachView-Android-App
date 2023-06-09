package com.example.techview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.techview.R;
import com.example.techview.model.ChatModel;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;

public class ChatAdapter extends FirestoreRecyclerAdapter<ChatModel, ChatAdapter.ChatViewHolder> {


    public ChatAdapter(@NonNull FirestoreRecyclerOptions<ChatModel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull ChatViewHolder holder, int position, @NonNull ChatModel model) {

    }

    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_item,parent,false);

        return new ChatViewHolder(v);
    }

    class ChatViewHolder extends RecyclerView.ViewHolder{

        public ChatViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
