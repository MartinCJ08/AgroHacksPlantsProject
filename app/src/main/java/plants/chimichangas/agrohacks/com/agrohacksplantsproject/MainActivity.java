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
        setContentView(R.layout.activity_main);
    //HOla jona
    }


    public void onClick(View view){

        Intent activity;
        switch (view.getId()) {
            case R.id.btnCultivos:
                System.out.println("Cultivo");
                DbHelper h = new DbHelper(this);
                System.out.println(h.getPlantByName("Cebolla"));
                activity = new Intent(getApplicationContext(), FructoActivity.class);
                startActivity(activity);
                break;
            case R.id.btnSim:
                activity = new Intent(getApplicationContext(), frame_2.class);
                startActivity(activity);
                System.out.println("Simulador");
                break;

        }
    }
}
