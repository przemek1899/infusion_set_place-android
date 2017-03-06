package com.vcf.przemek.firstappsdk16;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Przemek on 2017-02-07.
 */

public class InfusionSetDatabase extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "INFUSION_SET_MEMORY";
    private static final int DATABASE_VERSION = 1;
    private static final String INFUSION_SET_TABLE_NAME = "infusion_set";
    private static final String INFUSION_SET_TABLE_CREATE =
            "CREATE TABLE " + INFUSION_SET_TABLE_NAME + " (" +
                    InfusionSetReader.InfusionSetEntry._ID + " INTEGER PRIMARY KEY," +
                    InfusionSetReader.InfusionSetEntry.COLUMN_NAME_PLACE + " TEXT NOT NULL," +
                    InfusionSetReader.InfusionSetEntry.COLUMN_NAME_CREATION_DATE + " INTEGER NOT NULL," +
                    InfusionSetReader.InfusionSetEntry.COLUMN_NAME_NOT_WORKING + " BOOLEAN);";

    InfusionSetDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(INFUSION_SET_TABLE_CREATE);
    }

    @Override
    public void onUpgrade (SQLiteDatabase db, int oldVersion, int newVersion){

    }
}
