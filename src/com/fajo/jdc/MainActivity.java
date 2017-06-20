package com.fajo.jdc;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	private Button xMission, xAbout, xVolunteer, xRescue, xGallery, xContactUs, xDonatetUs, xProjectsManagment, xfacebook, xtwitter;
	
    @Override
	@SuppressLint("NewApi") 
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

		xMission = (Button) findViewById(R.id.btn_mission);
        xMission.setOnClickListener(new View.OnClickListener() {
            @Override
			public void onClick(View v) {
            	
            	Intent myIntent = new Intent (MainActivity.this, MissionVision.class);
            	MainActivity.this.startActivity(myIntent); 
            	
        		}
        });

		xProjectsManagment = (Button) findViewById(R.id.btn_projects);
		xProjectsManagment.setOnClickListener(new View.OnClickListener() {
            @Override
			public void onClick(View v) {
            	
            	Intent myIntent = new Intent (MainActivity.this, MainPage2.class);
            	MainActivity.this.startActivity(myIntent); 
            	
        		}
        });

        
		xAbout = (Button) findViewById(R.id.btn_about_us);
        xAbout.setOnClickListener(new View.OnClickListener() {
            @Override
			public void onClick(View v) {
            	
            	Intent myIntent = new Intent (MainActivity.this, About_Us.class);
            	MainActivity.this.startActivity(myIntent); 
            	
        		}
        });
        
        xVolunteer = (Button) findViewById(R.id.btn_volunteer);
        xVolunteer.setOnClickListener(new View.OnClickListener() {
            @Override
			public void onClick(View v) {
            	
            	Intent myIntent = new Intent (MainActivity.this, VolunteerRegister.class);
            	MainActivity.this.startActivity(myIntent); 
            	
        		}
        });

				
		xRescue = (Button) findViewById(R.id.btn_volunteer_rescue);
		xRescue.setOnClickListener(new View.OnClickListener() {
            @Override
			public void onClick(View v) {
            	
            	Intent myIntent = new Intent (MainActivity.this, VolunteerRescue.class);
            	MainActivity.this.startActivity(myIntent); 
            	
        		}
        });

		xGallery = (Button) findViewById(R.id.btn_gallery);
		xGallery.setOnClickListener(new View.OnClickListener() {
            @Override
			public void onClick(View v) {
            	
            	Intent myIntent = new Intent (MainActivity.this, Gallery.class);
            	MainActivity.this.startActivity(myIntent); 
            	
        		}
        });
		
		xContactUs = (Button) findViewById(R.id.btn_contact_us);
		xContactUs.setOnClickListener(new View.OnClickListener() {
            @Override
			public void onClick(View v) {
            	
            	Intent myIntent = new Intent (MainActivity.this, ContactUs.class);
            	MainActivity.this.startActivity(myIntent); 
            	
        		}
        });
		
		xDonatetUs = (Button) findViewById(R.id.btn_goback_donate_us);
		xDonatetUs.setOnClickListener(new View.OnClickListener() {
            @Override
			public void onClick(View v) {
            	
            	Intent myIntent = new Intent (MainActivity.this, DonateUs.class);
            	MainActivity.this.startActivity(myIntent); 
            	
        		}
        });	
        xfacebook = (Button) findViewById(R.id.facebook_btn);
        xfacebook.setOnClickListener(new View.OnClickListener() {
            @Override
			public void onClick(View v) {
            	
            	Intent myIntent = new Intent (MainActivity.this, facebook.class);
            	MainActivity.this.startActivity(myIntent); 
            	
        		}
        });
        xtwitter = (Button) findViewById(R.id.button1);
        xtwitter.setOnClickListener(new View.OnClickListener() {
            @Override
			public void onClick(View v) {
            	
            	Intent myIntent = new Intent (MainActivity.this, Twitter.class);
            	MainActivity.this.startActivity(myIntent); 
            	
        		}
        });
      }
}
