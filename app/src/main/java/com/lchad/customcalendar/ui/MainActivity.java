package com.lchad.customcalendar.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.lchad.customcalendar.R;

/**
 * Created by liuchad on 16/3/21.
 * Github: https://github.com/lchad
 */

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    private CalendarFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment = new CalendarFragment();
        getFragmentManager().beginTransaction().add(R.id.container, fragment, TAG).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_switch) {
            fragment.switchMonthAndWeek();
        }
        if (item.getItemId() == R.id.action_today) {
            fragment.setBackToToday();
        }
        return super.onOptionsItemSelected(item);
    }
}