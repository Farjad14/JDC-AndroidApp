package com.fajo.jdc;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

@SuppressLint("SetJavaScriptEnabled") public class VolunteerRescue extends Activity {

	Button mback1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_volunteer_rescue);

		//Import Above.
		WebView x = (WebView) findViewById(R.id.webView2);
		x.getSettings().setJavaScriptEnabled(true);
		x.loadUrl("http://www.jdcwelfare.org/images/Rescue%20Form.pdf");
				
		mback1 = (Button) findViewById(R.id.btn_goback_VS);
        mback1.setOnClickListener(new View.OnClickListener() {
            @Override
			public void onClick(View v) {
            	
            	Intent myIntent = new Intent (VolunteerRescue.this, MainActivity.class);
            	VolunteerRescue.this.startActivity(myIntent); 
            	
        		}
        });
	}
}
