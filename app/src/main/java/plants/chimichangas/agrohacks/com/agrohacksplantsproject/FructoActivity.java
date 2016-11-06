package plants.chimichangas.agrohacks.com.agrohacksplantsproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import plants.chimichangas.agrohacks.com.agrohacksplantsproject.db.DbHelper;

public class FructoActivity extends AppCompatActivity {
    private String sName;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fructo);
        //android.R.layout
        setTitle("Cultivos");
    }

    public void ibtnCeb(View view) {
        //sName="Cebolla";
        String value="";
        i=new Intent(getApplicationContext(), PlagaActivity.class);
        i.putExtra(value,"Cebolla");
        System.out.println(i.getExtras());
        startActivity(i);
    }
    public void ibtnMaiz(View view) {
        String value="";
        i=new Intent(getApplicationContext(), PlagaActivity.class);
        i.putExtra(value,"Cebolla");;
        startActivity(i);
    }

    public void ibtnAlfa(View view) {
        i=new Intent(getApplicationContext(), PlagaActivity.class);
        i.putExtra(sName,"Alfalfa");
        startActivity(i);
    }
    public void ibtnChile(View view) {
        i=new Intent(getApplicationContext(), PlagaActivity.class);
        i.putExtra(sName,"Chile");
        startActivity(i);
    }
    public void ibtnNuez(View view) {
        i=new Intent(getApplicationContext(), PlagaActivity.class);
        i.putExtra(sName,"Nuez");
        startActivity(i);
    }

}
