package com.example.sash.tamilkalvi;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by Sash on 21-Sep-15.
 */
public class DBAdapter extends SQLiteOpenHelper{
    int score;
    public static final String DATABASE_NAME = "scorecard.db";
    public static final String SCORECHART_TABLE_NAME = "scorecardTable";
    public static final String SCORECHART_COLUMN_ID = "id";
    public static final String SCORECHART_COLUMN_NAME = "name";
    public static final String SCORECHART_COLUMN_SCORE = "score";

    public DBAdapter(Context context){
        super(context,DATABASE_NAME,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("create table scorechart"+"(id integer primary key,name text,score varchar)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        db.execSQL("DROP TABLE IF EXISTS scorechart");
        onCreate(db);
    }

    public boolean insertscore  (String name, Integer score)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        contentValues.put("score", score);
        db.insert("score", null, contentValues);
        return true;
    }

    public Cursor getData(int id){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from scorechart where id="+id+"", null );
        return res;
    }

    public int numberOfRows(){
        SQLiteDatabase db = this.getReadableDatabase();
        int numRows = (int) DatabaseUtils.queryNumEntries(db, SCORECHART_TABLE_NAME);
        return numRows;
    }

    public boolean updatescore (Integer id, String name, Integer score)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        contentValues.put("score", score);
        db.update("scorechart", contentValues, "id = ? ", new String[]{Integer.toString(id)});
        return true;
    }

    public ArrayList<String> getAllscorechart()
    {
        ArrayList<String> array_list = new ArrayList<String>();

        //hp = new HashMap();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from scorechart", null );
        res.moveToFirst();

        while(res.isAfterLast() == false){
            array_list.add(res.getString(res.getColumnIndex(SCORECHART_COLUMN_NAME)));
            res.moveToNext();
        }
        return array_list;
    }
}
