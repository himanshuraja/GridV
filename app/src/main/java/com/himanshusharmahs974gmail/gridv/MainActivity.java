package com.himanshusharmahs974gmail.gridv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
        String contacts[]={"Ar","Sachin","Sumint","Yogesh"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.list);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.simple_list_item_1,contacts);
        listView.setAdapter(adapter);
        registerForContextMenu(listView);





    }
public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

    super.onCreateContextMenu(menu, v, menuInfo);
    menu.setHeaderTitle("Select Please");
    menu.add(0, v.getId(), 0, "Call");
    menu.add(0, v.getId(), 0, "SMS");


}
public boolean onContextItemSelected(MenuItem item){

    if (item.getTitle()=="Call"){
        Toast.makeText(getApplicationContext(),"calling",Toast.LENGTH_LONG).show();
    }
    else if (item.getTitle()=="SMS"){
        Toast.makeText(getApplicationContext(),"sending",Toast.LENGTH_LONG).show();
    }

    else {
        return false;
    }
    return true;
}}




