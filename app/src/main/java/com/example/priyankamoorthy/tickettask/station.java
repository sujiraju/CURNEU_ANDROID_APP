package com.example.priyankamoorthy.tickettask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class station extends Activity {

    Button gettic, addsta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.station);
        gettic = (Button)findViewById(R.id.button);
        addsta= (Button)findViewById(R.id.button2);
        gettic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(station.this,st.class);
                startActivity(i);
            }
        });
        addsta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(station.this,ticket.class);
                startActivity(in);
            }
        });

    }
}