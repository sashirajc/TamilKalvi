package com.example.sash.tamilkalvi;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Sash on 21-Sep-15.
 */
public class DatabaseConnector {
    private static final String DB_NAME = "scores";
    private static final String TABLE_NAME = "scoretable";
    private static final String NAME = "name";
    private static final String SCORE = "score";
    private static final int DATABASE_VERSION = 1;
    private SQLiteDatabase database;
    private DatabaseHelper dbOpenHelper;

    public DatabaseConnector(Context context) {
        dbOpenHelper = new DatabaseHelper(context, DB_NAME, null,
                DATABASE_VERSION);

    }

    // Open Database function
    public void open() throws java.sql.SQLException {
        // Allow database to be in writable mode
        database = dbOpenHelper.getWritableDatabase();
    }

    // Close Database function
    public void close() {
        if (database != null)
            database.close();
    }

    // Create Database function
    public void InsertScore(String name, String score) {
        ContentValues newCon = new ContentValues();
        newCon.put(NAME, finaltest.playerName);
        newCon.put(SCORE, finaltest.finalResult);


        database.insert(TABLE_NAME, null, newCon);
        close();
    }

    // List all data function
    public Cursor ListAllScores() {
        return database.query(TABLE_NAME, new String[] { NAME,SCORE }, null,
                null, null, null, NAME);
    }


}
