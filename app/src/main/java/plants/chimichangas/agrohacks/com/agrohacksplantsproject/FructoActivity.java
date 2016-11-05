package plants.chimichangas.agrohacks.com.agrohacksplantsproject;

import android.content.Intent;
import android.database.Cursor;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import plants.chimichangas.agrohacks.com.agrohacksplantsproject.database.DBHelper;
import plants.chimichangas.agrohacks.com.agrohacksplantsproject.database.DBManager;

public class FructoActivity extends AppCompatActivity {
    private String sqlQuery="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fructo);
    }

    public void onClickScroll(View view){
        Intent activity;
        String sName="";
        sqlQuery = "SELECT name result FROM plants WHERE name=="+sName;
        switch (view.getId()) {
            case R.id.ibtnAlfa:
                //DO something
                System.out.println("Alfalfa");
                sName = "Cebolla";
                DBHelper db = new DBHelper(this);
                if(db.getNameQuery().equals(sName)){
                    activity = new Intent(getApplicationContext(), FrucScrollActivity.class);
                    startActivity(activity);
                }
                break;
            case R.id.ibtnCeb:
                //DO something

                System.out.println("Cebolla");
                sName = "Cebolla";
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
    public String getSqlQuery(){
        return sqlQuery;
    }
}
