package plants.chimichangas.agrohacks.com.agrohacksplantsproject;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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
    public void btnCultivos(View view){
        /*DbHelper h = new DbHelper(this);
        String queryRec = h.getPlantByName("Cebolla");
        if(queryRec.equals("Cebolla")){
            System.out.println("El dato existe: "+queryRec);
        }else{
            System.out.println("El dato no existe: "+queryRec);
        }*/
        startActivity(new Intent(MainActivity.this, FructoActivity.class));
    }
    public void btnSim(View view) {
        Intent intent = new Intent(MainActivity.this, frame_2.class);
        startActivity(intent);
    }

   
}
