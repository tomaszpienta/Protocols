package com.example.protok_v3;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.Vector;

public class DatabaseManager extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 12;
    private static final String DATABASE_NAME = "DProtokoly";
    private static final String TABLE_1 = "Protokoly";


    public DatabaseManager(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_1 + " ;");
        String createTable1 = "CREATE TABLE IF NOT EXISTS Protokoly(\n " +
                " ID TEXT,\n " +
                " Date TEXT,\n " +
                " pd_number TEXT,\n " +
                " field TEXT,\n " +
                " sr_num_dm9225 TEXT,\n " +
                " comments_dm9225  TEXT,\n " +
                " sr_num_switch  TEXT,\n " +
                " comments_switch  TEXT,\n " +
                " sr_num_p0g  TEXT,\n " +
                " comments_p0g  TEXT,\n " +
                " sr_num_p1g  TEXT,\n " +
                " comments_p1g  TEXT,\n " +
                " sr_num_p2g  TEXT,\n " +
                " comments_p2g  TEXT,\n " +
                " sr_num_p3g  TEXT,\n " +
                " comments_p3g  TEXT,\n " +
                " ups  TEXT,\n " +
                " battery_pack  TEXT,\n " +
                " rout_switch_media  TEXT,\n " +
                " foreign_devic  TEXT,\n " +
                " comments_others  TEXT,\n " +
                " switch1  TEXT,\n " +
                " switch2  TEXT,\n " +
                " switch3  TEXT,\n " +
                " switch4  TEXT,\n " +
                " switch5  TEXT,\n " +
                " cleaning_filters  TEXT,\n " +
                " replacement_filter  TEXT,\n " +
                " study_ups  TEXT,\n " +
                " cleaning_cabinet  TEXT,\n " +
                " efficiency_of_the_cabinet  TEXT); ";
        db.execSQL(createTable1);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_1 + " ;");
        onCreate(db);
    }


    public void addOne(Defines defines){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        String vInsertQuery =
                "INSERT INTO Protokoly(" +
                        "Date,\n" +
                        "pd_number,\n" +
                        "field,\n" +
                        "sr_num_dm9225,\n" +
                        "comments_dm9225,\n" +
                        "sr_num_switch,\n" +
                        "comments_switch,\n" +
                        "sr_num_p0g,\n" +
                        "comments_p0g,\n" +
                        "sr_num_p1g,\n" +
                        "comments_p1g,\n" +
                        "sr_num_p2g,\n" +
                        "comments_p2g,\n" +
                        "sr_num_p3g,\n" +
                        "comments_p3g,\n" +
                        "ups,\n" +
                        "battery_pack,\n" +
                        "rout_switch_media,\n" +
                        "foreign_devic,\n" +
                        "comments_others,\n" +
                        "switch1,\n" +
                        "switch2,\n" +
                        "switch3,\n" +
                        "switch4,\n" +
                        "switch5,\n" +
                        "cleaning_filters,\n" +
                        "replacement_filter,\n" +
                        "study_ups,\n" +
                        "cleaning_cabinet,\n" +
                        "efficiency_of_the_cabinet)" +
                        "VALUES('" + defines.getDate()
                        + "', '" + defines.getPd_number()
                        + "', '" + defines.getField()
                        + "', '" + defines.getSr_num_dm9225()
                        + "', '" + defines.getComments_dm9225()
                        + "', '" + defines.getSr_num_switch()
                        + "', '" + defines.getComments_switch()
                        + "', '" + defines.getSr_num_p0ge()
                        + "', '" + defines.getComments_p0ge()
                        + "', '" + defines.getSr_num_p1ge()
                        + "', '" + defines.getComments_p1ge()
                        + "', '" + defines.getSr_num_p2ge()
                        + "', '" + defines.getComments_p2ge()
                        + "', '" + defines.getSr_num_p3ge()
                        + "', '" + defines.getComments_p3ge()
                        + "', '" + defines.getUps()
                        + "', '" + defines.getBattery_pack()
                        + "', '" + defines.getRout_switch_media()
                        + "', '" + defines.getForeign_device()
                        + "', '" + defines.getComments_others()
                        + "', '" + defines.getSwitch1()
                        + "', '" + defines.getSwitch2()
                        + "', '" + defines.getSwitch3()
                        + "', '" + defines.getSwitch4()
                        + "', '" + defines.getSwitch5()
                        + "', '" + defines.getCleaning_filters()
                        + "', '" + defines.getReplacement_filter()
                        + "', '" + defines.getStudy_ups()
                        + "', '" + defines.getCleaning_cabinet()
                        + "', '" + defines.getEfficiency_of_the_cabinet() + "');";
        db.execSQL(vInsertQuery);
    }

    public Vector<String> getAllStrings(String apd_num) {
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "SELECT * FROM Protokoly WHERE pd_number = '" + apd_num +  "' ORDER BY rowID DESC LIMIT 1;";
        Cursor vCursor = db.rawQuery(query, null);
        Vector<String> vResult = new Vector<>(0);
        while (vCursor.moveToNext()) {
            for (int i=0; i<=30;i++){
                vResult.add(vCursor.getString(i));
            }
        }
        return vResult;
    }
}


