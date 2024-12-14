package com.example.dailyhelper;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.dailyhelper.fragmentUI.diary.MainMenuDiaryFragment;
import com.example.dailyhelper.fragmentUI.Home.MainMenuHomeFragment;
import com.example.dailyhelper.fragmentUI.preset.MainMenuPresetFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    private final MainMenuHomeFragment fragmentHome = new MainMenuHomeFragment();
    private final MainMenuDiaryFragment fragmentDiary = new MainMenuDiaryFragment();
    private final MainMenuPresetFragment fragmentPreset = new MainMenuPresetFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(new ItemSelectedListener());
        bottomNavigationView.setSelectedItemId(R.id.menu_home);
    }

    class ItemSelectedListener implements BottomNavigationView.OnItemSelectedListener {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

            int itemId = menuItem.getItemId();
            if (itemId == R.id.menu_home) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.menu_frame_layout, fragmentHome)
                        .commit();
                return true;
            } else if (itemId == R.id.menu_preset) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.menu_frame_layout, fragmentPreset)
                        .commit();
                return true;
            } else if (itemId == R.id.menu_diary) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.menu_frame_layout, fragmentDiary)
                        .commit();
                return true;
            }

            return false;
        }
    }
}