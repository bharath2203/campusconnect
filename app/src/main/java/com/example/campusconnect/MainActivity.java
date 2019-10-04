package com.example.campusconnect;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean isNavigationHide = false;
    boolean isSearchBarHide = false;
    private TextView mTextMessage;
    private BottomNavigationView navigation;
    private View search_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation_light);

        initComponent();
    }

    private void initComponent() {
        search_bar = (View) findViewById(R.id.search_bar);
//        mTextMessage = (TextView) findViewById(R.id.search_text);

        navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.navigation_forum:
                        Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.navigation_notifications:
                        Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                }
                return false;
            }
        });
    }

//    private void animateNavigation(final boolean hide) {
//        if (isNavigationHide && hide || !isNavigationHide && !hide) return;
//        isNavigationHide = hide;
//        int moveY = hide ? (2 * navigation.getHeight()) : 0;
//        navigation.animate().translationY(moveY).setStartDelay(100).setDuration(300).start();
//    }
//
//    private void animateSearchBar(final boolean hide) {
//        if (isSearchBarHide && hide || !isSearchBarHide && !hide) return;
//        isSearchBarHide = hide;
//        int moveY = hide ? -(2 * search_bar.getHeight()) : 0;
//        search_bar.animate().translationY(moveY).setStartDelay(100).setDuration(300).start();
//    }
}
