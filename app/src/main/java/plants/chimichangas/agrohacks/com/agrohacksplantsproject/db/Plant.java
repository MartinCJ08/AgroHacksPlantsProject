package plants.chimichangas.agrohacks.com.agrohacksplantsproject.db;

import java.util.UUID;

/**
 * Created by Jona622 on 11/5/16.
 */

public class Plant {
    private String id;
    private String name;
    private String info;
    private String plaga;


    public Plant(String name,
                 String info, String plaga) {
        this.id = (UUID.randomUUID().toString());
        this.name = name;
        this.info = info;
        this.plaga = plaga;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public String getPlaga() {
        return plaga;
    }
    //

}
