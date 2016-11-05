package plants.chimichangas.agrohacks.com.agrohacksplantsproject;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import plants.chimichangas.agrohacks.com.agrohacksplantsproject.database.DBManager;

public class Prueba extends AppCompatActivity {
    ListView lista;
    DBManager manager;
    Cursor cursor;
    SimpleCursorAdapter adap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba);
        lista =(ListView) findViewById(R.id.listView11);
        manager = new DBManager();
        cursor = manager.nameQuery();
        String[] from = new String[]{DBManager.NAME,DBManager.PLAGAS};
        int[] to = new int[]{android.R.id.text1,android.R.id.text2};
        adap = new SimpleCursorAdapter(this,android.R.layout.two_line_list_item,cursor,from, to,0);
        lista.setAdapter(adap);
    }
}
