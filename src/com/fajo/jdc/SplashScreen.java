package com.fajo.jdc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity {

	//Private Timer
	private static int SPLASH_TIME = 5000;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
		
		new Handler().postDelayed(new Runnable(){
			
			@Override
			public void run(){
				Intent i = new Intent(SplashScreen.this, MainActivity.class);
				startActivity(i);
				
				finish();
			};
		}, SPLASH_TIME);

    }
}
