package com.example.regimen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        changeFragment(new HomeFragment());

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

    private void changeFragment(Fragment fr){
        FrameLayout fl = findViewById(R.id.frameLayout);
        fl.removeAllViews();
        FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
        transaction1.add(R.id.frameLayout, fr);
        transaction1.commit();
    }

}