package plants.chimichangas.agrohacks.com.agrohacksplantsproject.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Jona622 on 11/5/16.
 */

public class DbHelper extends SQLiteOpenHelper{
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Plant.db";
    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //codigo sql
        db.execSQL("CREATE TABLE " + PlantContract.PlantEntry.TABLE_NAME + " ("
                + PlantContract.PlantEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + PlantContract.PlantEntry.ID + " TEXT NOT NULL,"
                + PlantContract.PlantEntry.NAME + " TEXT NOT NULL,"
                + PlantContract.PlantEntry.INFO + " TEXT NOT NULL,"
                + PlantContract.PlantEntry.PLAGA + " TEXT NOT NULL,"
                + "UNIQUE (" + PlantContract.PlantEntry.ID + "))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public Cursor getPlantByName(String nombre) {
        Cursor c = getReadableDatabase().query(
                PlantContract.PlantEntry.TABLE_NAME,
                null,
                PlantContract.PlantEntry.NAME + " LIKE ?",
                new String[]{nombre},
                null,
                null,
                null);
        return c;
    }
}
