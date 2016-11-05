package plants.chimichangas.agrohacks.com.agrohacksplantsproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClick(View view){

        //Intent activity2 = new Intent(getApplicationContext(), Activity2.class);
        Intent activity;
        //startActivity(activity2);
        switch (view.getId()) {
            case R.id.ibtnCultivo:
                //DO something
                System.out.println("Cultivo");
                activity = new Intent(getApplicationContext(), FructoActivity.class);
                startActivity(activity);

                break;
            case R.id.ibtnProbl:
                //DO something
                System.out.println("Problemas");
                break;

        }
    }
}
