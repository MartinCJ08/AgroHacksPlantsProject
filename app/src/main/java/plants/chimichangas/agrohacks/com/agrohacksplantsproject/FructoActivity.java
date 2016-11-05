package plants.chimichangas.agrohacks.com.agrohacksplantsproject;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FructoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fructo);
    }

    public void onClickScroll(View view){
        Intent activity;
        String sName;

        switch (view.getId()) {
            case R.id.ibtnAlfa:
                //DO something
                System.out.println("Alfalfa");
                sName = "Alfalfa";
                activity = new Intent(getApplicationContext(), FrucScrollActivity.class);
                startActivity(activity);
                break;
            case R.id.ibtnCeb:
                //DO something

                System.out.println("Cebolla");
                sName = "Alfalfa";
                activity = new Intent(getApplicationContext(), FrucScrollActivity.class);
                startActivity(activity);
                break;
            case R.id.ibtnChile:
                System.out.println("Chile jalapeño");
                sName = "Chile";
                activity = new Intent(getApplicationContext(), FrucScrollActivity.class);
                startActivity(activity);
                break;
            case R.id.ibtnMaiz:
                System.out.println("Maíz");
                sName = "Maiz";
                activity = new Intent(getApplicationContext(), FrucScrollActivity.class);
                startActivity(activity);
                break;
            case R.id.ibtnNuez:

                System.out.println("Nuez");
                sName = "Nuez";
                activity = new Intent(getApplicationContext(), FrucScrollActivity.class);
                startActivity(activity);
                break;
        }
    }
}
