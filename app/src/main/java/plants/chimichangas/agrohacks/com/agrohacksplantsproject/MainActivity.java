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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DBHelper help = new DBHelper(this);
        SQLiteDatabase db = help.getWritableDatabase();
        ListView txt =(ListView) findViewById(R.id.listView1);
        DBManager manager = new DBManager();
        Cursor c = manager.nameQuery();
        String[] from = new String[]{DBManager.NAME};
        int[] to = new int[]{R.id.listView1};
        Adapter adap = new SimpleCursorAdapter(this,R.layout.activity_main,c,from, to, 0);
        txt.setAdapter((ListAdapter) adap);
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
