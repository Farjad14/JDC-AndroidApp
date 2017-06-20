package com.fajo.jdc;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

@SuppressLint("SetJavaScriptEnabled") public class Twitter extends Activity {

	Button mback1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.twitter);

		//Import Above.
		WebView x = (WebView) findViewById(R.id.webView5);
		x.getSettings().setJavaScriptEnabled(true);
		x.loadUrl("https://twitter.com/JDCWelfareOrg");
				
		mback1 = (Button) findViewById(R.id.btn_goback_tweet);
        mback1.setOnClickListener(new View.OnClickListener() {
            @Override
			public void onClick(View v) {
            	
            	Intent myIntent = new Intent (Twitter.this, MainActivity.class);
            	Twitter.this.startActivity(myIntent); 
            	
        		}
        });
	}
}
