package com.example.homework3address;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AddressViewHolder extends RecyclerView.ViewHolder {
    private TextView tvAddress;
    public AddressViewHolder(@NonNull View itemView) {
        super(itemView);
        tvAddress = itemView.findViewById(R.id.tv_address);
    }
    public void bind(String address){
        tvAddress.setText(address);
    }
}
