package com.example.protok_v3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import java.util.Vector;


public class SingleListItem extends Activity{
    Defines defines;
    EditText pd_num;
    EditText field, sr_num_dm9225,comments_dm9225, sr_num_switch,comments_switch,sr_num_p0ge,comments_p0ge,sr_num_p1ge,comments_p1ge,sr_num_p2ge,comments_p2ge,sr_num_p3ge,comments_p3ge,ups,battery_pack,rout_switch_media, foreign_device,comments_others;
    EditText cleaning_filters, replacement_filter, study_ups, cleaning_cabinet, efficiency_of_the_cabinet, Date;
    Button save;
    Switch switch1, switch2, switch3, switch4, switch5;

    public DatabaseManager mDatabaseManager;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.single_list_item_view);

        pd_num = findViewById(R.id.pd_number);
        field= findViewById(R.id.field);
        sr_num_dm9225= findViewById(R.id.sr_num_dm9225);
        comments_dm9225= findViewById(R.id.comments_dm9225);
        sr_num_switch= findViewById(R.id.sr_num_switch);
        comments_switch= findViewById(R.id.comments_switch);
        sr_num_p0ge= findViewById(R.id.sr_num_p0ge);
        comments_p0ge= findViewById(R.id.comments_p0ge);
        sr_num_p1ge= findViewById(R.id.sr_num_p1ge);
        comments_p1ge= findViewById(R.id.comments_p1ge);
        sr_num_p2ge= findViewById(R.id.sr_num_p2ge);
        comments_p2ge= findViewById(R.id.comments_p2ge);
        sr_num_p3ge= findViewById(R.id.sr_num_p3ge);
        comments_p3ge= findViewById(R.id.comments_p3ge);
        ups= findViewById(R.id.ups);
        battery_pack= findViewById(R.id.battery_pack);
        rout_switch_media= findViewById(R.id.rout_switch_media);
        foreign_device= findViewById(R.id.foreign_device);
        comments_others= findViewById(R.id.comments_others);
        cleaning_filters= findViewById(R.id.cleaning_filters);
        replacement_filter= findViewById(R.id.replacement_filter);
        study_ups= findViewById(R.id.study_ups);
        cleaning_cabinet= findViewById(R.id.cleaning_cabinet);
        efficiency_of_the_cabinet= findViewById(R.id.efficiency_of_the_cabinet);
        save= findViewById(R.id.save);
        Date = findViewById(R.id.Date);
        switch1= findViewById(R.id.switch1);
        switch2= findViewById(R.id.switch2);
        switch3= findViewById(R.id.switch3);
        switch4= findViewById(R.id.switch4);
        switch5= findViewById(R.id.switch5);

        int name = getIntent().getIntExtra("PD_number", 0);
        pd_num.setText(""+name);

        //DATABASE GET FUNCION
        DatabaseManager databaseManager2 = new DatabaseManager(SingleListItem.this);
        Vector<String> all = databaseManager2.getAllStrings(Integer.toString(name));

        //ASSIGNING DATA FROM THE DATABASE TO THE RELEVANT TABLES
        if (all.isEmpty()){}
        else {
            try {
                Date.setText(all.elementAt(1));
                pd_num.setText(all.elementAt(2));
                field.setText(all.elementAt(3));
                sr_num_dm9225.setText(all.elementAt(4));
                comments_dm9225.setText(all.elementAt(5));
                sr_num_switch.setText(all.elementAt(6));
                comments_switch.setText(all.elementAt(7));
                sr_num_p0ge.setText(all.elementAt(8));
                comments_p0ge.setText(all.elementAt(9));
                sr_num_p1ge.setText(all.elementAt(10));
                comments_p1ge.setText(all.elementAt(11));
                sr_num_p2ge.setText(all.elementAt(12));
                comments_p2ge.setText(all.elementAt(13));
                sr_num_p3ge.setText(all.elementAt(14));
                comments_p3ge.setText(all.elementAt(15));
                ups.setText(all.elementAt(16));
                battery_pack.setText(all.elementAt(17));
                rout_switch_media.setText(all.elementAt(18));
                foreign_device.setText(all.elementAt(19));
                comments_others.setText(all.elementAt(20));
                if (!all.elementAt(21).equals("true"))
                    switch1.setChecked(all.elementAt(21).matches(String.valueOf(true)));
                else
                    switch1.setChecked(all.elementAt(21).matches(String.valueOf(false)));
                if (!all.elementAt(21).equals("true"))
                    switch2.setChecked(all.elementAt(22).matches(String.valueOf(true)));
                else
                    switch2.setChecked(all.elementAt(22).matches(String.valueOf(false)));
                if (!all.elementAt(21).equals("true"))
                    switch3.setChecked(all.elementAt(23).matches(String.valueOf(true)));
                else
                    switch3.setChecked(all.elementAt(23).matches(String.valueOf(false)));
                if (!all.elementAt(21).equals("true"))
                    switch4.setChecked(all.elementAt(24).matches(String.valueOf(true)));
                else
                    switch4.setChecked(all.elementAt(24).matches(String.valueOf(false)));
                if (all.elementAt(21)  != "true")
                    switch5.setChecked(all.elementAt(25).matches(String.valueOf(true)));
                else
                    switch5.setChecked(all.elementAt(25).matches(String.valueOf(false)));
                cleaning_filters.setText(all.elementAt(26));
                replacement_filter.setText(all.elementAt(27));
                study_ups.setText(all.elementAt(28));
                cleaning_cabinet.setText(all.elementAt(29));
                efficiency_of_the_cabinet.setText(all.elementAt(30));


            } catch (Exception e) {
                Toast.makeText(SingleListItem.this, e.toString(), Toast.LENGTH_LONG).show();
            }
        }

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    defines = new Defines(Date.getText().toString(),
                            Integer.parseInt(pd_num.getText().toString()),
                            field.getText().toString(),
                            sr_num_dm9225.getText().toString(),
                            comments_dm9225.getText().toString(),
                            sr_num_switch.getText().toString(),
                            comments_switch.getText().toString(),
                            sr_num_p0ge.getText().toString(),
                            comments_p0ge.getText().toString(),
                            sr_num_p1ge.getText().toString(),
                            comments_p1ge.getText().toString(),
                            sr_num_p2ge.getText().toString(),
                            comments_p2ge.getText().toString(),
                            sr_num_p3ge.getText().toString(),
                            comments_p3ge.getText().toString(),
                            ups.getText().toString(),
                            battery_pack.getText().toString(),
                            rout_switch_media.getText().toString(),
                            foreign_device.getText().toString(),
                            comments_others.getText().toString(),
                            switch1.isChecked(),
                            switch2.isChecked(),
                            switch3.isChecked(),
                            switch4.isChecked(),
                            switch5.isChecked(),
                            cleaning_filters.getText().toString(),
                            replacement_filter.getText().toString(),
                            study_ups.getText().toString(),
                            cleaning_cabinet.getText().toString(),
                            efficiency_of_the_cabinet.getText().toString());

                    Toast.makeText(SingleListItem.this, defines.toString(), Toast.LENGTH_LONG).show();
                    Toast.makeText(SingleListItem.this, "DATABASE CREATED", Toast.LENGTH_LONG).show();

                    finish();

                } catch (Exception e) {
                    Toast.makeText(SingleListItem.this, "DATABASE ERROR", Toast.LENGTH_LONG).show();
                }

                //trustEveryone();
                //SENDING DATA TO BASE
                //Mysingleton mysingleton = new Mysingleton();
                //mysingleton.doInBackground("Date.getText().toString()", "pd_num.getText().toString()");

                //POST DATA ON SERVER
                Mysingleton mysingleton = new Mysingleton();
                mysingleton.sendPostRequest(
                        ""+Date.getText().toString(),
                        ""+pd_num.getText().toString(),
                        "" +field.getText().toString(),
                        "" +sr_num_dm9225.getText().toString(),
                        "" +comments_dm9225.getText().toString(),
                        "" +sr_num_switch.getText().toString(),
                        "" +comments_switch.getText().toString(),
                        "" +sr_num_p0ge.getText().toString(),
                        "" +comments_p0ge.getText().toString(),
                        "" +sr_num_p1ge.getText().toString(),
                        "" +comments_p1ge.getText().toString(),
                        "" +sr_num_p2ge.getText().toString(),
                        "" +comments_p2ge.getText().toString(),
                        "" +sr_num_p3ge.getText().toString(),
                        "" +comments_p3ge.getText().toString(),
                        "" +ups.getText().toString(),
                        "" +battery_pack.getText().toString(),
                        "" +rout_switch_media.getText().toString(),
                        "" +foreign_device.getText().toString(),
                        "" +comments_others.getText().toString(),
                        "" +switch1.isChecked(),
                        "" +switch2.isChecked(),
                        "" +switch3.isChecked(),
                        "" +switch4.isChecked(),
                        "" +switch5.isChecked(),
                        "" +cleaning_filters.getText().toString(),
                        "" +replacement_filter.getText().toString(),
                        "" +study_ups.getText().toString(),
                        "" +cleaning_cabinet.getText().toString(),
                        "" +efficiency_of_the_cabinet.getText().toString());

                //ADDING VALUES FROM EDITET TO LOCAL DATABASE
                DatabaseManager databaseManager = new DatabaseManager(SingleListItem.this);
                databaseManager.addOne(defines);
            }
        });
    }
}
