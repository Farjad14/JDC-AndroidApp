package com.fajo.jdc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class About_Us extends Activity {
	TextView mtextinfor;
	private Button mback;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about_us);
		
		mback = (Button) findViewById(R.id.btn_goback_aboutus);
        mback.setOnClickListener(new View.OnClickListener() {
            @Override
			public void onClick(View v) {
            	
            	Intent myIntent = new Intent (About_Us.this, MainActivity.class);
            	About_Us.this.startActivity(myIntent); 
            	
        		}
        });
      //Find the TextView
        TextView mcheck = (TextView) findViewById(R.id.aboutus1);
        //Make it scrollable by using the Scrolling Method.
        mcheck.setMovementMethod(new ScrollingMovementMethod());
        		
	}
	
}