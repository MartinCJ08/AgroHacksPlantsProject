package plants.chimichangas.agrohacks.com.agrohacksplantsproject.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Jona622 on 11/5/16.
 */

public class DBManager {
    public static final String TABLE_NAME="plants";
    public static final String ID="_id";
    public static final String NAME="name";
    public static final String PLAGAS = "plagas";
    public static final String CONSEJOS = "consejos";

    public static final String CREATE_TABLE=" create table "+TABLE_NAME+" ("+ID
                    +" integer primary key autoincrement not null,"+NAME+" text not null,"+PLAGAS+" text not null,"+CONSEJOS+" text not null);";
    private DBHelper helper;
    private SQLiteDatabase db;
    public void DBManager(Context context){
        helper = new DBHelper(context);
        db = helper.getWritableDatabase();
    }
    public Cursor nameQuery(){
        String[] column = new String[]{NAME};
        return db.query(TABLE_NAME,column,null,null,null,null,null);
    }
}
