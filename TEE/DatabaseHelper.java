package com.example.aad_tee_j074;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "ProfileDB" ;
    private static final int DATABASE_VERSION = 1 ;
    private static final String TABLE_NAME = "Profile" ;
    private static final String KEY_ID = "Id" ;
    private static final String KEY_NAME = "Name" ;
    private static final String KEY_PHONE = "Phone" ;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME + "(" + KEY_ID + " TEXT PRIMARY KEY," +
                KEY_NAME + " TEXT NOT NULL," + KEY_PHONE + " TEXT NOT NULL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);

    }

    public void addEntry (String Id, String Name, String Phone){
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_ID,Id);
        values.put(KEY_NAME,Name);
        values.put(KEY_PHONE,Phone);
        database.insert(TABLE_NAME,null,values);
    }

    public void deleteEntry (String id) {
        SQLiteDatabase database = this.getWritableDatabase();
        database.delete(TABLE_NAME, KEY_ID + "= ?", new String[] {String.valueOf(id)});
    }

    public ArrayList<ProfileModel> retrieveEntry() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME, null) ;
        ArrayList<ProfileModel> arrMood = new ArrayList<>() ;
        while (cursor.moveToNext()) {
            ProfileModel model = new ProfileModel();
            model.id = cursor.getString(0);
            model.name = cursor.getString(1);
            model.phone = cursor.getString(2);
            arrMood.add(model);
        }
        return arrMood;
    }

    public void updateEntry(ProfileModel profileModel) {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(KEY_NAME,profileModel.name);
        contentValues.put(KEY_PHONE,profileModel.phone);
        database.update(TABLE_NAME,contentValues,KEY_ID +
                "=" + profileModel.id,null);
    }


}