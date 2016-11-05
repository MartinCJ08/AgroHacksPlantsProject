package plants.chimichangas.agrohacks.com.agrohacksplantsproject;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import plants.chimichangas.agrohacks.com.agrohacksplantsproject.database.DBHelper;
import plants.chimichangas.agrohacks.com.agrohacksplantsproject.database.DBManager;

public class MainActivity extends AppCompatActivity {
    ListView lista;
    DBManager manager;
    Cursor cursor;
    SimpleCursorAdapter adap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*DBHelper help = new DBHelper(this);
        SQLiteDatabase db = help.getWritableDatabase();*/
        lista =(ListView) findViewById(R.id.listView1);
        manager = new DBManager();
        cursor = manager.nameQuery();
        String[] from = new String[]{DBManager.NAME,DBManager.PLAGAS};
        int[] to = new int[]{android.R.id.text1,android.R.id.text2};
        adap = new SimpleCursorAdapter(this,android.R.layout.two_line_list_item,cursor,from, to,0);
        lista.setAdapter(adap);
    }


    public void onClick(View view){

        //Intent activity2 = new Intent(getApplicationContext(), Activity2.class);
        Intent activity;
        //startActivity(activity2);
        switch (view.getId()) {
            case R.id.ibtnCultivo:
                System.out.println("Cultivo");
                activity = new Intent(getApplicationContext(), FructoActivity.class);
                startActivity(activity);
                break;
            case R.id.ibtnProbl:
                activity = new Intent(getApplicationContext(), frame_2.class);
                startActivity(activity);
                System.out.println("Simulador");
                break;
        }
    }
}
