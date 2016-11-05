package plants.chimichangas.agrohacks.com.agrohacksplantsproject.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Jona622 on 11/5/16.
 */

public class DBHelper extends SQLiteOpenHelper {

    public static final String DB_NAME="plants.sqlite";
    public static final int SCHEME_VER = 1;

    public DBHelper(Context context) {
        super(context, DB_NAME, null, SCHEME_VER);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DBManager.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVer, int newVer) {

    }
}
