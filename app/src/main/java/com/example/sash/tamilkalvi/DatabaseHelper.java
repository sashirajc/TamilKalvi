package com.example.sash.tamilkalvi;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;

/**
 * Created by Sash on 21-Sep-15.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "scores";
    public static final String TABLE_NAME = "scoretable";
    public static final String NAME = "name";
    public static final String SCORE = "score";

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory,
                          int version) {
        super(context, DB_NAME, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create a database table
        String createQuery = "CREATE TABLE " + TABLE_NAME
                + " (_id integer primary key autoincrement," + NAME + ", "
                + SCORE + ");";
        db.execSQL(createQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Database will be wipe on version change
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

}