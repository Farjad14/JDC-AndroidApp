package com.fajo.jdc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MissionVision extends Activity {

	private Button mback;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mission_vision);
		
		mback = (Button) findViewById(R.id.btn_goback_mission);
        mback.setOnClickListener(new View.OnClickListener() {
            @Override
			public void onClick(View v) {
            	
            	Intent myIntent = new Intent (MissionVision.this, MainActivity.class);
            	MissionVision.this.startActivity(myIntent); 
            	
        		}
        });
		
	}
	
}