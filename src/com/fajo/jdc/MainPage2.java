package com.fajo.jdc;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPage2 extends Activity {
	private Button xHealth, xEducation, xProjects, xDisaster, xBack;
	
    @Override
	@SuppressLint("NewApi") 
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity_main);

        xHealth = (Button) findViewById(R.id.health);
		xHealth.setOnClickListener(new View.OnClickListener() {
            @Override
			public void onClick(View v) {
            	
            	Intent myIntent = new Intent (MainPage2.this, Health.class);
            	MainPage2.this.startActivity(myIntent); 
            	
        		}
        });
        
		xEducation = (Button) findViewById(R.id.education);
		xEducation.setOnClickListener(new View.OnClickListener() {
            @Override
			public void onClick(View v) {
            	
            	Intent myIntent = new Intent (MainPage2.this, Education.class);
            	MainPage2.this.startActivity(myIntent); 
            	
        		}
        });
        
		xProjects = (Button) findViewById(R.id.projects);
		xProjects.setOnClickListener(new View.OnClickListener() {
            @Override
			public void onClick(View v) {
            	
            	Intent myIntent = new Intent (MainPage2.this, Projects.class);
            	MainPage2.this.startActivity(myIntent); 
            	
        		}
        });

				
		xDisaster = (Button) findViewById(R.id.disaster);
		xDisaster.setOnClickListener(new View.OnClickListener() {
            @Override
			public void onClick(View v) {
            	
            	Intent myIntent = new Intent (MainPage2.this, Disaster.class);
            	MainPage2.this.startActivity(myIntent); 
            	
        		}
        });
		
		xBack = (Button) findViewById(R.id.btn_goback_maingactivity2);
		xBack.setOnClickListener(new View.OnClickListener() {
            @Override
			public void onClick(View v) {
            	
            	Intent myIntent = new Intent (MainPage2.this, MainActivity.class);
            	MainPage2.this.startActivity(myIntent); 
            	
        		}
        });
      }
}
