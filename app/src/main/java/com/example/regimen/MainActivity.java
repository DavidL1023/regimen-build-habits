package com.example.regimen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //initializers
    BottomNavigationView bottomNavigationView;
    RecyclerView itemRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find by id
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        //set home on startup
        changeFragment(new HomeFragment());


        //swap between fragments
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int selected = item.getItemId();

                if (selected==R.id.navHome) {
                    changeFragment(new HomeFragment());

                } else if (selected == R.id.navHistory) {
                    changeFragment(new HistoryFragment());

                } else if (selected == R.id.navNotes) {
                    changeFragment(new NotesFragment());

                } else if (selected == R.id.navGroups) {
                    changeFragment(new GroupsFragment());
                }

                return true;
            }
        });

    }

    //helper function to swap between fragments
    private void changeFragment(Fragment fr){
        FrameLayout fl = findViewById(R.id.frameLayout);
        fl.removeAllViews();
        FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
        transaction1.add(R.id.frameLayout, fr);
        transaction1.commit();
    }

}