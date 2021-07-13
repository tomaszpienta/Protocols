package com.example.protok_v3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import java.util.Vector;


public class MainActivity extends Activity  {
    Button sync;
    LinearLayout layout;
    ConnectionH conn = new ConnectionH();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = findViewById(R.id.linear);
        sync = findViewById(R.id.sync);
        for (int i=0; i<=206; i++){
            final Button button = new Button(this);
            button.setLayoutParams(new LinearLayout.LayoutParams(-1, 150));
            button.setId(i);
            button.setText("PD " + i);
            int finalI1 = i;

            DatabaseManager databaseManager2 = new DatabaseManager(MainActivity.this);
            Vector<String> all = databaseManager2.getAllStrings(""+finalI1);
            if (all.isEmpty()){}
            else {
                button.setBackgroundResource(R.color.teal_700);
            }

            button.setOnClickListener(v -> {
                Intent form = new Intent(MainActivity.this, SingleListItem.class);
                form.putExtra("PD_number", finalI1);
                startActivity(form);
            });
            layout.addView(button);
            sync.setOnClickListener(view -> {
                try {
                    conn.downloadJSON("MySql php location"); // <--- DATABASE.php fille
                }
                catch (Exception ex){
                    Toast.makeText(getApplicationContext(), "!!BLAD!!" + ex, Toast.LENGTH_SHORT).show();
                }

                finish();
                //overridePendingTransition(0, 0);
                startActivity(getIntent());
                //overridePendingTransition(0, 0);
            });
        }
    }
}
