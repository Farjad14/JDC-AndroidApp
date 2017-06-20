package com.fajo.jdc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Projects extends Activity {

	private Button mback;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_projects);
		
		mback = (Button) findViewById(R.id.btn_goback_projects);
        mback.setOnClickListener(new View.OnClickListener() {
            @Override
			public void onClick(View v) {
            	
            	Intent myIntent = new Intent (Projects.this, MainPage2.class);
            	Projects.this.startActivity(myIntent); 
            	
        		}
        });
        //Find the TextView
        TextView mcheck = (TextView) findViewById(R.id.activityprojects);
        //Make it scrollable by using the Scrolling Method.
        mcheck.setMovementMethod(new ScrollingMovementMethod());
        
	}
	
}