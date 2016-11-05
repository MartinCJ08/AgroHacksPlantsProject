package plants.chimichangas.agrohacks.com.agrohacksplantsproject.database;

/**
 * Created by Jona622 on 11/5/16.
 */

public class DBManager {
    public static final String TABLE_NAME="plants";
    public static final String ID="_id";
    public static final String NAME="name";
    public static final String LOGO_URI = "logoUri";
    public static final String PLAGAS = "plagas";
    public static final String CONSEJOS = "consejos";

    public static final String CREATE_TABLE=" create table "+TABLE_NAME+" ("+ID
                    +" integer primary key autoincrement,"+NAME+" text not null,"+LOGO_URI+" text not null,"+
                    PLAGAS+" text not null,"+CONSEJOS+" text not null);";
}
