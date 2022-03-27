package com.example.aikyam;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "WellnessDB" ;
    private static final int DATABASE_VERSION = 1 ;
    private static final String TABLE_NAME = "Wellness" ;
    private static final String KEY_DATE = "Date" ;
    private static final String KEY_MOOD = "Mood" ;
    private static final String KEY_DESCRIPTION = "Description" ;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME + "(" + KEY_DATE + " TEXT PRIMARY KEY," +
                KEY_MOOD + " TEXT NOT NULL," + KEY_DESCRIPTION + " TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);

    }

    public void addEntry (String Date, String Mood, String Description){
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_DATE,Date);
        values.put(KEY_MOOD,Mood);
        values.put(KEY_DESCRIPTION,Description);
        database.insert(TABLE_NAME,null,values);
    }

    public void deleteEntry (String date) {
        SQLiteDatabase database = this.getWritableDatabase();
        database.delete(TABLE_NAME, KEY_DATE + "= ?", new String[] {String.valueOf(date)});
    }

    public ArrayList<MoodModel> retrieveEntry() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME, null) ;
        ArrayList<MoodModel> arrMood = new ArrayList<>() ;
        while (cursor.moveToNext()) {
            MoodModel model = new MoodModel();
            model.date = cursor.getString(0);
            model.mood = cursor.getString(1);
            model.description = cursor.getString(2);
            arrMood.add(model);
        }
        return arrMood;
    }

    public void updateEntry(MoodModel moodModel) {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(KEY_MOOD,moodModel.mood);
        contentValues.put(KEY_DESCRIPTION,moodModel.description);
        database.update(TABLE_NAME,contentValues,KEY_DATE +
                "=" + moodModel.date,null);
    }


}


