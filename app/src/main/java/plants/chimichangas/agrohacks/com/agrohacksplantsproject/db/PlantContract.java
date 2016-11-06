package plants.chimichangas.agrohacks.com.agrohacksplantsproject.db;

import android.provider.BaseColumns;

/**
 * Created by Jona622 on 11/5/16.
 */

public class PlantContract {
    public static abstract class PlantEntry implements BaseColumns {
        public static final String TABLE_NAME ="plant";

        public static final String ID = "id";
        public static final String NAME = "name";
        public static final String LAT = "lat";
        public static final String LONGI = "longi";
        public static final String PLAGA = "plaga";
        //
    }
}
