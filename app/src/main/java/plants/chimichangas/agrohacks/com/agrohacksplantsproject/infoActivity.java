package plants.chimichangas.agrohacks.com.agrohacksplantsproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import plants.chimichangas.agrohacks.com.agrohacksplantsproject.db.DbHelper;
import plants.chimichangas.agrohacks.com.agrohacksplantsproject.db.PlantContract;

public class infoActivity extends AppCompatActivity implements OnMapReadyCallback {
    private String cd="";
    private GoogleMap mapita;
    private String nameCol="TEST";
    private float lat;
    private float longi;
    private LatLng l1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        setCd("Chihuahua");
        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map);
        DbHelper h = new DbHelper(this);
        lat= Float.parseFloat(h.searchCordenates("lat",nameCol));
        System.out.println(lat);
        longi = Float.parseFloat(h.searchCordenates("longi",nameCol));
        System.out.println(longi);
        l1 = new LatLng(lat,longi);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap mapita) {
        this.mapita=mapita;
        mapita.addMarker(new MarkerOptions().position(l1).title(cd));
        Toast.makeText(this,"Cord: "+lat+","+longi,Toast.LENGTH_LONG).show();

    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

}
