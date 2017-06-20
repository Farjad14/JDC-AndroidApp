package com.fajo.jdc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ContactUs extends Activity {

	private Button mback;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.contact_us);
		
		mback = (Button) findViewById(R.id.btn_goback_contact);
        mback.setOnClickListener(new View.OnClickListener() {
            @Override
			public void onClick(View v) {
            	
            	Intent myIntent = new Intent (ContactUs.this, MainActivity.class);
            	ContactUs.this.startActivity(myIntent); 
            	
        		}
        });
        //Find the TextView
        TextView mcheck = (TextView) findViewById(R.id.activitycontactus);
        //Make it scrollable by using the Scrolling Method.
        mcheck.setMovementMethod(new ScrollingMovementMethod());
		
	}
	
}