package plants.chimichangas.agrohacks.com.agrohacksplantsproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.sql.SQLOutput;

import plants.chimichangas.agrohacks.com.agrohacksplantsproject.db.DbHelper;
import plants.chimichangas.agrohacks.com.agrohacksplantsproject.db.PlantContract;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); /*
        DBManager m = new DBManager();
        String[] campos = new String[] {m.NAME, m.PLAGAS};
        String[] args = new String[] {"Cebolla"};

        Cursor c = m.getDb().query(m.TABLE_NAME, campos, "name=", args, null, null, null);

        if (c.moveToFirst()) {
            //Recorremos el cursor hasta que no haya más registros
            do {
                String name = c.getString(0);
                String plagas = c.getString(1);
                System.out.println("Nombre: "+name+" plagas: "+plagas);
            } while (c.moveToNext());
        }*/

    }


    public void onClick(View view){

        Intent activity;
        switch (view.getId()) {
            case R.id.ibtnCultivo:
                System.out.println("Cultivo");
                DbHelper h = new DbHelper(this);
                System.out.println(h.getPlantByName("Cebolla"));
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
