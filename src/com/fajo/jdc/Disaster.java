package com.fajo.jdc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Disaster extends Activity {

	private Button mback;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_disaster);
		
		mback = (Button) findViewById(R.id.btn_goback_disaster);
        mback.setOnClickListener(new View.OnClickListener() {
            @Override
			public void onClick(View v) {
            	
            	Intent myIntent = new Intent (Disaster.this, MainPage2.class);
            	Disaster.this.startActivity(myIntent); 
            	
        		}
        });
        //Find the TextView
        TextView mcheck = (TextView) findViewById(R.id.activitydisaster);
        //Make it scrollable by using the Scrolling Method.
        mcheck.setMovementMethod(new ScrollingMovementMethod());
        
	}
	
}