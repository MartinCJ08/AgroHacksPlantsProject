package plants.chimichangas.agrohacks.com.agrohacksplantsproject.db;

import java.util.UUID;

/**
 * Created by Jona622 on 11/5/16.
 */

public class Plant {
    private String id;
    private String name;
    private float lat;
    private float longi;
    private String plaga;


    public Plant(String name,
                 int lat,int longi, String plaga) {
        this.id = (UUID.randomUUID().toString());
        this.name = name;
        this.lat = lat;
        this.longi=longi;
        this.plaga = plaga;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPos() {
        return "Lat: "+lat+" Long "+longi;
    }

    public String getPlaga() {
        return plaga;
    }
    //

}
