package com.fajo.jdc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Health extends Activity {

	private Button mback;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_health);
		
		mback = (Button) findViewById(R.id.btn_goback_health);
        mback.setOnClickListener(new View.OnClickListener() {
            @Override
			public void onClick(View v) {
            	
            	Intent myIntent = new Intent (Health.this, MainPage2.class);
            	Health.this.startActivity(myIntent); 
            	
        		}
        });
        //Find the TextView
        TextView mcheck = (TextView) findViewById(R.id.healthactivity);
        //Make it scrollable by using the Scrolling Method.
        mcheck.setMovementMethod(new ScrollingMovementMethod());
		
	}
	
}