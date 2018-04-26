package com.example.lab3_1;

import android.graphics.Color;
import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button button;    //Create Button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button1);

        registerForContextMenu(button);        //register context menu button
    }

    public void onCreateContextMenu (ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);;
        //set Menu
        menu.setHeaderTitle("Button Menu");
        menu.add(0,1,1,"Red");
        menu.add(0,2,2,"Green");
        menu.add(0,3,3,"Blue");
    }
    public boolean onContextItemSelected (MenuItem item) {
        //Change textcolor
        switch(item.getItemId()){
            case 1:
                button.setTextColor(Color.RED);
                break;
            case 2:
                button.setTextColor(Color.GREEN);
                break;
            case 3:
                button.setTextColor(Color.BLUE);
                break;
        }
        return super.onContextItemSelected(item);
    }
}