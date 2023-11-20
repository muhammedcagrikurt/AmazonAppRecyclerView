package com.kurt.amazonapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.kurt.amazonapp.data.entity.CardResim;
import com.kurt.amazonapp.data.entity.Kategori;
import com.kurt.amazonapp.databinding.ActivityMainBinding;
import com.kurt.amazonapp.ui.adapter.CardAdapter;
import com.kurt.amazonapp.ui.adapter.YatayRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.navHostFragment);
        NavigationUI.setupWithNavController(binding.bottomNavigationView,navHostFragment.getNavController());









    }
}