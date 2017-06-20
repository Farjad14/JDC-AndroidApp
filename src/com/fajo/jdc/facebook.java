package com.fajo.jdc;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

@SuppressLint("SetJavaScriptEnabled") public class facebook extends Activity {

	Button mback1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.facebook);

		//Import Above.
		WebView x = (WebView) findViewById(R.id.webView4);
		x.getSettings().setJavaScriptEnabled(true);
		x.loadUrl("https://www.facebook.com/JDC.organization");
				
		mback1 = (Button) findViewById(R.id.btn_goback_facebk);
        mback1.setOnClickListener(new View.OnClickListener() {
            @Override
			public void onClick(View v) {
            	
            	Intent myIntent = new Intent (facebook.this, MainActivity.class);
            	facebook.this.startActivity(myIntent); 
            	
        		}
        });
	}
}
