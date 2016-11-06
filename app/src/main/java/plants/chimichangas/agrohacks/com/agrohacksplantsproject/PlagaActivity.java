package plants.chimichangas.agrohacks.com.agrohacksplantsproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import plants.chimichangas.agrohacks.com.agrohacksplantsproject.db.DbHelper;

public class PlagaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plaga);
        setTitle("Informacion");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final Intent intent = new Intent(getApplicationContext(), infoActivity.class);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action 1", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                startActivity(intent);
            }
        });
        String titler = this.getIntent().getExtras().getString("value");
        System.out.println("titler "+titler);
        DbHelper hp = new DbHelper(this);
        TextView sc = (TextView) findViewById(R.id.textPlagas);
        System.out.println("hp "+hp.getContent(titler));
        if(hp.getPlantByName(titler).equals(titler)){
            System.out.println("Entro al if");
            //sc.setText("Ñonga");
            sc.setText(""+hp.getContent(titler));
        }
       // sc.setText(""+hp.getContent(f.getsName()));

    }
}
