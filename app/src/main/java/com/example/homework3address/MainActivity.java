package com.example.homework3address;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        ArrayList<String> address = new ArrayList<>();
        address.add("Kyzyl-Kiya");
        address.add("Osh");
        address.add("Bishkek");
        address.add("NewYork");
        address.add("Batken");
        address.add("Tashkent");
        address.add("Chicago");
        address.add("Hawaii");
        address.add("Usa");
        address.add("Germany");
        AddressAdapter adapter = new AddressAdapter(address);
        recyclerView.setAdapter(adapter);

    }
}