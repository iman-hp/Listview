package com.vasiqimarket.www.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText=(EditText)findViewById(R.id.edttext);
        Button btnadd=(Button)findViewById(R.id.btnadd);
        ListView lstview=(ListView)findViewById(R.id.lstview);
        final ArrayList<String> araye=new ArrayList<String>();
        araye.add("ایمان");
        araye.add("مبینا");
        araye.add("علیرضا");
        araye.add("زهره");
        final ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,araye);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gereftam=editText.getText().toString();
                araye.add(gereftam);
                adapter.notifyDataSetChanged();
            }
        });
        lstview.setAdapter(adapter);
    }
}
